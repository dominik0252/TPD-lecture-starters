package model;

import java.util.ArrayList;

public class Event extends Entry {
  Reminder reminder;

  // REQUIRES:  interval is one of: '15min', '30min', '1h', '6h', '12h', '24h', '1d', '1w', '1m', '1y'
  public Event(Date date, Time time, String label, String interval) {
    this.date = date;
    this.time = time;
    this.label = label;
    this.interval = interval;
  }

  // getters
  public Reminder getReminder() { return this.reminder; }

  // setters
  public void setReminder(Reminder reminder) {
    this.reminder = reminder;
  }
}
