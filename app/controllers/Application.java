package controllers;

import models.Sport;
import play.mvc.*;

import java.util.List;

import static java.util.Arrays.asList;

public class Application extends Controller {

  public static void index() {
    List<Sport> sports = asList(Sport.values());
    render(sports);
  }

  public static void welcome() {
    render();
  }

}