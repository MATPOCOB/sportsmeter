package models;

import play.Play;

public class Config {
  public static String DATETIME_FORMAT = Play.configuration.getProperty("date.format");
  public static String DATE_FORMAT = dateFormat(DATETIME_FORMAT);
  public static String TIME_FORMAT = timeFormat(DATETIME_FORMAT);

  private static String dateFormat(String datetime) {
    return datetime.split(" ")[1];
  }

  private static String timeFormat(String datetime) {
    return datetime.split(" ")[0];
  }
}

