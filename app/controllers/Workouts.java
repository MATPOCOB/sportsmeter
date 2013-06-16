package controllers;

import models.Workout;
import play.mvc.Controller;

import javax.validation.Valid;
import java.util.List;

public class Workouts extends Controller {

  public static void list() {
    List<Workout> workouts = Workout.all().fetch();
    render(workouts);
  }

  public static void add() {
    render();
  }

  public static void save(@Valid Workout workout) {
    //validation.valid(workout);
    if (validation.hasErrors()) {
      validation.keep();
      params.flash();
      add();
    }
    workout.save();
    list();
  }

}
