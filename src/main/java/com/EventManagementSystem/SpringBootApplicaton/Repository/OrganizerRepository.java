package com.EventManagementSystem.SpringBootApplicaton.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EventManagementSystem.SpringBootApplicaton.Model.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
