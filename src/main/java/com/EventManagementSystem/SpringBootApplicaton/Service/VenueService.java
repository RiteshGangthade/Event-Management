package com.EventManagementSystem.SpringBootApplicaton.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventManagementSystem.SpringBootApplicaton.Model.Venue;
import com.EventManagementSystem.SpringBootApplicaton.Repository.VenueRepository;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    public Optional<Venue> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    public Venue updateVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }
}
