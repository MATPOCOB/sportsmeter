package ext;

import models.Config;
import play.templates.JavaExtensions;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CustomExtensions extends JavaExtensions {

  public static String formatTime(Date date) {
    return new SimpleDateFormat(Config.TIME_FORMAT).format(date);
  }

  public static String formatDate(Date date) {
    return new SimpleDateFormat(Config.DATE_FORMAT).format(date);
  }

  public static String formatTimeUTC(Date date) {
    SimpleDateFormat dateFormat = new SimpleDateFormat(Config.TIME_FORMAT);
    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    return dateFormat.format(date);
  }
}
