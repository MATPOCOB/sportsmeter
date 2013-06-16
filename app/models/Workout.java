package models;

import play.data.validation.Required;
import play.db.jpa.Model;
import play.libs.Time;

import javax.persistence.Entity;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
public class Workout extends Model{
  @Required
  public Date date;
  @Required
  public Sport type;
  @Required
  public String duration;
}
