package model;

public class Time {
  // REQUIRES:  valid hours in 24h format, valid minutes
  // MODIFIES:  this
  // EFFECTS:   create a new Time object
  public Time(int hours, int minutes) { }

  // REQUIRES:  format 'AM/PM', '24'
  // EFFECTS:   returns time in the given format
  public String getTimeInFormat(String format) { return null; }
}
