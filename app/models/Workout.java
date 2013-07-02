package models;

import org.hibernate.annotations.Type;
import org.joda.time.LocalTime;
import play.data.binding.As;
import play.data.validation.Min;
import play.data.validation.Required;
import play.db.jpa.Model;
import play.libs.Time;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
public class Workout extends Model {
  @Required
  public Date start;
  @As("HH:mm:ssZ")
  public Date duration;
  @Required
  public Sport type;
  @Required @Min(0)
  public Double distance;
  public Integer happy;

  public Double getSpeed() {
    return distance/(duration.getTime()/(1000*3600.0));
  }

}
