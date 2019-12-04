package model;

public class Time {
  private int hours;
  private int minutes;

  // REQUIRES:  valid hours in 24h format, valid minutes
  // MODIFIES:  this
  // EFFECTS:   create a new Time object
  public Time(int hours, int minutes) {
    this.hours = hours;
    this.minutes = minutes;
  }

  // REQUIRES:  format 'AM/PM', '24'
  // EFFECTS:   returns time in the given format
  public String getTimeInFormat(String format) {
    switch (format) {
      case "24":
        return "" + hours + ":" + minutesAsString();
      case "AM/PM":
        if (hours == 0) {
          return "12:" + minutesAsString() + "AM";
        } else if (hours < 12) {
          return "" + hours + ":" + minutesAsString() + "AM";
        } else if (hours == 12) {
          return "" + hours + ":" + minutesAsString() + "PM";
        } else {
          return "" + (hours - 12) + ":" + minutesAsString() + "PM";
        }
      default:
        return "#!!!INVALID FORMAT!!!#";
    }
  }

  private String minutesAsString() {
    if (minutes < 10) {
      return "0" + minutes;
    } else {
      return "" + minutes;
    }
  }
}
