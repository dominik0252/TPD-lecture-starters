package model;

public abstract class Entry {
  Date date;
  Time time;
  String label;
  String interval;

  // getters
  public Date getDate() { return this.date; };
  public Time getTime() { return this.time; }
  public String getLabel() { return this.label; }
  public String getInterval() { return this.interval; }

  // setters
  public void setInterval() {
    this.interval = interval;
  }

  // EFFECTS: returns true if entry is repeating, false otherwise
  public boolean isRepeating() {
    return (this.interval != null);
  }
}
