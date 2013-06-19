package models;

import play.Play;

public class Config {
  public static final String DATE_FORMAT = Play.configuration.getProperty("date.format");
  public static final String TIME_FORMAT = Play.configuration.getProperty("time.format", "HH:mm:ss");
}
