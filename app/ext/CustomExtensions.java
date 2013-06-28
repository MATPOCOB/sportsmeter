package ext;

import models.Config;
import play.templates.JavaExtensions;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomExtensions extends JavaExtensions {

  public static String formatTime(Date date) {
    return new SimpleDateFormat(Config.DATE_FORMAT.split(" ")[0]).format(date);
  }

  public static String formatDate(Date date) {
    return new SimpleDateFormat(Config.DATE_FORMAT.split(" ")[1]).format(date);
  }
}
