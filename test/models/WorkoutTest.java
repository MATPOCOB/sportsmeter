package models;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class WorkoutTest {

  @Test
  public void getSpeed() throws Exception {
    Workout workout = new Workout();
    workout.distance = 20.0;
    workout.duration = new Date(2 * 60 * 60 * 1000);
    assertEquals(new Double(10), workout.getSpeed());
  }
}
