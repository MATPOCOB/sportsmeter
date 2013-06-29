package models;

import play.data.binding.As;
import play.data.validation.Min;
import play.data.validation.Required;
import play.db.jpa.Model;
import play.libs.Time;

import javax.persistence.Entity;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
public class Workout extends Model {
  @Required
  public Date start;
  @As("HH:mm:ss")
  public Date duration;
  //public Date finish;
  @Required
  public Sport type;
  @Required @Min(0)
  public Double distance;
  public Integer happy;
  public Double speed;
}
