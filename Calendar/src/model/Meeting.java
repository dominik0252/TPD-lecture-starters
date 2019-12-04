package model;

import java.util.ArrayList;

public class Meeting extends Event {
  ArrayList<String> attendees = new ArrayList<>();

  public Meeting(Date date, Time time, String label, String interval) {
    super(date, time, label, interval);
  }

  // EFFECTS: returns list of attendee emails
  public ArrayList<String> getAttendees() { return this.attendees; }

  // REQUIRES:  valid email address
  // MODIFIES:  this
  // EFFECTS:   adds attendee email to the list of attendees
  public void addAttendee(String attendeeEmail) {
    if (attendees.indexOf(attendeeEmail) == -1) {
      attendees.add(attendeeEmail);
    }
  }

  // MODIFIES:  this
  // EFFECTS:   removes attendee from the list
  public void removeAttendee(String attendeeEmail) {
    attendees.remove(attendeeEmail);
  }

  // EFFECTS:   print out the emails for attendees
  public String sendInvites() {
    String invites = null;
    invites = "Sending invites...\n" +
              "To: " + getAttendeeEmailList() + "\n" +
              "Hey,\ncome to " + getLabel() +
              " on " + getDate().getDateInFormat("Month DD, YYYY") +
              " at " + getTime().getTimeInFormat("24") + "!\n" +
              "See you!\n";
    return invites;
  }

  private String getAttendeeEmailList() {
    String emailList = "";
    for (int i = 0; i < attendees.size(); i++) {
      emailList = emailList + attendees.get(i);
      if (i != attendees.size() - 1) {
        emailList = emailList + "; ";
      };
    }

    return emailList;
  }
}
