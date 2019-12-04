package model;

public class Date {
  private int year;
  private int month;
  private int day;

  // REQUIRES:  valid year, month and day
  // MOOIFIES:  this
  // EFFECTS:   creates date object
  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  };

  // REQUIRES:  formats 'YYYY-MM-DD' 'DD-MM-YYYY' 'Month DD, YYYY'
  // EFFECTS:   returns date in the given format
  public String getDateInFormat(String format) {
    String formattedDate = null;
    switch (format) {
      case "YYYY-MM-DD":
        formattedDate = "" + year + "-" + month + "-" + day;
        break;
      case "DD-MM-YYYY":
        formattedDate = "" + day + "-" + month + "-" + year;
        break;
      case "Month DD, YYYY":
        formattedDate = getMonthName(month) + " " + day + ", " + year;
        break;
      default:
        formattedDate = "#!!!INVALID FORMAT!!!#";
        break;

    }
    return formattedDate;
  };

  private String getMonthName(int month){
    switch (month) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "#!!!INVALID MONTH!!!#";
    }
  }
}
