package model;

public class Reminder extends Entry {
  String note;

  // REQUIRES: note is one of: '15 min before', '30 min before', '1 h before', '6 h before', '12 h before', '1 d before'
  public Reminder(String note) {
    this.note = note;
  }

  // getters
  public String getNote() {
    return note;
  }

  // setters
  public void setNote(String note) {
    this.note = note;
  }
}
