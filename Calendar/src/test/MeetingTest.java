package test;

import model.Date;
import model.Meeting;
import model.Time;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingTest {
  Meeting m1;
  String testEmail1;
  String testEmail2;

  public void setUp() {
    testEmail1 = "jane.doe@example.com";
    testEmail2 = "scott.tiger@example.com";
    Date date = new Date(2019,12,13);
    Time time = new Time(19,0);
    m1 = new Meeting(date, time, "Cenosco Christmas Party", null);
  }

  @Test
  public void testAddAttendee() {
    assertEquals(0, m1.getAttendees().size());
    m1.addAttendee(testEmail1);
    assertEquals(1, m1.getAttendees().size());
    assertEquals(testEmail1, m1.getAttendees().get(m1.getAttendees().size()));
    m1.addAttendee(testEmail2);
    assertEquals(2, m1.getAttendees().size());
    assertEquals(testEmail2, m1.getAttendees().get(m1.getAttendees().size()));
    m1.addAttendee(testEmail1);
    assertEquals(2, m1.getAttendees().size());
    assertEquals(testEmail2, m1.getAttendees().get(m1.getAttendees().size()));
  }

  @Test
  public void testRemoveAttendee() {
    assertEquals(0, m1.getAttendees().size());
    m1.addAttendee(testEmail1);
    m1.addAttendee(testEmail2);
    assertEquals(2, m1.getAttendees().size());
    m1.removeAttendee(testEmail1);
    assertEquals(1, m1.getAttendees().size());
    assertEquals(-1, m1.getAttendees().indexOf(testEmail1));
  }

  @Test
  public void testGetAttendees() {
    ArrayList<String> attendees = new ArrayList<>();
    attendees.add(testEmail1);
    attendees.add(testEmail2);

    m1.addAttendee(testEmail1);
    m1.addAttendee(testEmail2);

    assertEquals(attendees, m1.getAttendees());
  }

  @Test
  public void testSendInvites() {
    String expected = "Sending invites...\n" +
                      "To: " + testEmail1 + "; " + testEmail2 + "\n" +
                      "Hey, come to " + m1.getLabel() +
                      " on " + m1.getDate().getDateInFormat("Month, DD YYYY") +
                      " at " + m1.getTime().getTimeInFormat("24") + "!\n" +
                      "See you!\n";
    m1.addAttendee(testEmail1);
    m1.addAttendee(testEmail2);
    assertEquals(expected, m1.sendInvites());
  }
}
