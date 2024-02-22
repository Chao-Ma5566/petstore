package petstore.entite.method;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Cat extends Animal{
    @Column (name="chipId")
    private String chipId;
}
