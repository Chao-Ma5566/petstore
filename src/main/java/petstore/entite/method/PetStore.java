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

    @Column (name="managerName")
    private String managerName;

    public PetStore() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
