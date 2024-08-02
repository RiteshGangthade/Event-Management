package com.EventManagementSystem.SpringBootApplicaton.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EventManagementSystem.SpringBootApplicaton.Model.Organizer;
import com.EventManagementSystem.SpringBootApplicaton.Service.OrganizerService;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {
    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public Organizer createOrganizer(@RequestBody Organizer organizer) {
        return organizerService.createOrganizer(organizer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getOrganizerById(@PathVariable Long id) {
        return organizerService.getOrganizerById(id)
                .map(organizer -> ResponseEntity.ok().body(organizer))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organizer> updateOrganizer(@PathVariable Long id, @RequestBody Organizer organizerDetails) {
        return organizerService.getOrganizerById(id)
                .map(organizer -> {
                    organizer.setName(organizerDetails.getName());
                    organizer.setContactInfo(organizerDetails.getContactInfo());
                    Organizer updatedOrganizer = organizerService.updateOrganizer(organizer);
                    return ResponseEntity.ok().body(updatedOrganizer);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOrganizer(@PathVariable Long id) {
        return organizerService.getOrganizerById(id)
                .map(organizer -> {
                    organizerService.deleteOrganizer(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
