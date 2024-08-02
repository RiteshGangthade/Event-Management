INSERT INTO venue (id, name, location, capacity) VALUES (1, 'Conference Hall A', '123 Main St', 100);
INSERT INTO organizer (id, name, contactInfo) VALUES (1, 'John Doe', 'john@example.com');
INSERT INTO event (id, eventName, eventDate, description, organizer_id, venue_id) VALUES (1, 'Tech Conference', '2024-08-15', 'Annual Tech Conference', 1, 1);
