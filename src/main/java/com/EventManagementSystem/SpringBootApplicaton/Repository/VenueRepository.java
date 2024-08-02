package com.EventManagementSystem.SpringBootApplicaton.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EventManagementSystem.SpringBootApplicaton.Model.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
}
