package models;

import play.Play;

public class Config {

  public static String DATE_FORMAT = Play.configuration.getProperty("date.format");

}
