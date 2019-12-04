package ui;

import model.*;

import java.util.ArrayList;

public class CalendarDemo {
  public static void main(String[] args) {
    Event e1 = new Event(new Date(2019,12,12), new Time(8,0),"First Event" ,null);
    Event e2 = new Event(new Date(2020,1,1), new Time(0,0),"New Year" ,"1y");

    e1.setReminder(new Reminder("15 min before"));
    System.out.println("Reminder for event " + e1.getLabel() + " set for " + e1.getReminder().getNote());

    if (e2.isRepeating()) {
      System.out.println("Event " + e2.getLabel() + " will be repeated every " + e2.getInterval() + " at " +
                          e2.getTime() + " starting on " + e2.getDate().getDateInFormat("Month, DD YYYY"));
    }

    Meeting m1 = new Meeting(new Date(2019,12,13), new Time(19, 0),
                            "Cenosco Christmas Party", null);
    m1.addAttendee("scott.tiger@example.com");
    m1.addAttendee("jane.doe@example.com");
    m1.addAttendee("dominik.vidusin@example.com");
    System.out.print("Attendees at " + m1.getLabel() + " are:");
    ArrayList<String> attendees = m1.getAttendees();
    for (int i = 0; i < attendees.size(); i++) {
      System.out.print(attendees.get(i));
      if (i != attendees.size() - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("");
    m1.removeAttendee("dominik.vidusin@example.com");
    System.out.println(m1.sendInvites());
  }
}
