package test;

import model.Date;
import model.Event;
import model.Reminder;
import model.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EventTest {
  Event e1;
  Event e2;

  @BeforeEach
  public void setUp() {
    Date d1 = new Date(2019,12,12);
    Date d2 = new Date(2020,1,1);
    Time t1 = new Time(8,0);
    Time t2 = new Time(0,0);

    e1 = new Event(d1, t1,"First Event" ,null);
    e2 = new Event(d2, t2,"New Year" ,"1y");
  }

  @Test
  public void testGetSetReminder() {
    String note = "1 d before";
    assertNull(e1.getReminder());
    e1.setReminder(new Reminder(note));
    assertEquals(note, e1.getReminder().getNote());
  }
}
