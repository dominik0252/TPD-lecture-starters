package model;

public abstract class Entry {
  // getters
  public Date getDate() { return null; };
  public Time getTime() { return null; }
  public String getLabel() { return null; }
  public String getInterval() { return null; }

  // setters
  public void setInterval() { }

  // EFFECTS: returns true if entry is repeating, false otherwise
  public boolean isRepeating() { return false; }
}
