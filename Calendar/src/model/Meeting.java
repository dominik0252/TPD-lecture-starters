package model;

public class Meeting extends Event {
  // EFFECTS: returns comma separated list of attendee emails
  public String getAttendees() { return null; }

  // REQUIRES:  valid email address
  // MODIFIES:  this
  // EFFECTS:   adds attendee email to the list of attendees
  public void addAttendee(String attendeeEmail) { }

  // MODIFIES:  this
  // EFFECTS:   removes attendee from the list
  public void removeAttendee(String attendeeEmail) {}

  // EFFECTS:   print out the emails for attendees
  public String sendInvites() { return null; }
}
