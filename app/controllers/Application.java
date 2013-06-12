package controllers;

import play.mvc.*;

public class Application extends Controller {

  enum SportType {
    RUNNING,
    ORIENTEERING,
    BIKE,
    MOUNTAIN_BIKE,
    SWIMMING
  }

  public static void index() {
    SportType[] sports = SportType.values();
    render(sports);
  }

}