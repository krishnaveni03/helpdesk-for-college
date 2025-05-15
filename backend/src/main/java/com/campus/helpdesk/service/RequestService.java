package com.campus.helpdesk.service;

import com.campus.helpdesk.dto.RequestDTO;
import com.campus.helpdesk.entity.Request;
import com.campus.helpdesk.entity.User;
import com.campus.helpdesk.repository.RequestRepository;
import com.campus.helpdesk.security.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {

    private final RequestRepository requestRepository;

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public List<Request> getMyRequests() {
        UserPrincipal currentUser = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return requestRepository.findByUserId(currentUser.getId());
    }

    public Request createRequest(RequestDTO requestDTO) {
        UserPrincipal currentUser = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        
        Request request = new Request();
        request.setTitle(requestDTO.getTitle());
        request.setDescription(requestDTO.getDescription());
        request.setPriority(requestDTO.getPriority());
        // Set other fields from DTO
        
        return requestRepository.save(request);
    }

    public Request updateRequest(Long id, RequestDTO requestDTO) {
        Request request = requestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found"));
        
        request.setStatus(requestDTO.getStatus());
        // Update other fields from DTO
        
        return requestRepository.save(request);
    }
}