package com.campus.helpdesk.repository;

import com.campus.helpdesk.entity.CampusLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampusLocationRepository extends JpaRepository<CampusLocation, Long> {
}