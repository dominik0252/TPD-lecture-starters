package test;

import model.Reminder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReminderTest {
  Reminder r;
  String note;

  @BeforeEach
  public void setUp() {
    note = "1 d before";
    r = new Reminder(note);
  }

  @Test
  public void testGetSetNote() {
    String newNote = "15 min before";
    assertEquals(note, r.getNote());
    r.setNote(newNote);
    assertEquals(newNote, r.getNote());
  }
}
