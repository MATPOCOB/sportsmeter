package controllers;

import play.mvc.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Application extends Controller {

  enum SportType {
    RUNNING,
    ORIENTIERING,
    BIKE,
    MOUNTAIN_BIKE,
    SWIMMING
  }

  public static void index() {
    List<SportType> sports = asList(SportType.values()).stream().filter((it) -> (it.ordinal() % 2 == 1)).collect(Collectors.<SportType>toList());
    render(sports);
  }

}