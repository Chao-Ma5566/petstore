package petstore.entite.method;

import javax.persistence.*;

@Entity
@Table(name= "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name="name")
    private String name;
}
