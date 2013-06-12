package controllers;

import play.mvc.*;

import java.util.List;

import static java.util.Arrays.asList;

public class Application extends Controller {

  enum SportType {
    RUNNING,
    ORIENTEERING,
    WALKING,
    MOUNTAIN_BIKE,
    SWIMMING,
    ROLLER_BLADES
  }

  public static void index() {
    List<SportType> sports = asList(SportType.values());
    render(sports);
  }

}