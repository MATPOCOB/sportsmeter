package ext;

import play.templates.JavaExtensions;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomExtensions extends JavaExtensions {

  public static String formatTime(Date date) {
    return new SimpleDateFormat("HH:mm:ss").format(date);
  }

  public static String formatDuration(Date date) {
    //todo return the number of days
    return formatTime(date);
  }
}
