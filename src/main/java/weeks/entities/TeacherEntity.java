package weeks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Teachers")
public class TeacherEntity {

  @Id
  @GeneratedValue
  private int id;
  private String name;
  private String sname;
}

