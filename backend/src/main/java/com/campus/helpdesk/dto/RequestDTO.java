package com.campus.helpdesk.dto;

import com.campus.helpdesk.entity.Request.RequestPriority;
import com.campus.helpdesk.entity.Request.RequestStatus;
import lombok.Data;

@Data
public class RequestDTO {
    private String title;
    private String description;
    private RequestPriority priority;
    private RequestStatus status;
    private Long locationId;
}