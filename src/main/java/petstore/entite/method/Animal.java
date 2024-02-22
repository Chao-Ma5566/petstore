package petstore.entite.method;

import javax.persistence.*;
import java.util.Date;

/** * Animal abstrait: Fish ou Cat. */
@Entity
@Table(name= "Animal")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="birth")
    private Date birth;

    @Column (name="couleur")
    private String couleur;

    @ManyToOne
    @JoinColumn (name="ID_PETSTORE")
    private PetStore petStore;

    public Animal() {
    }

    public Animal(Date birth, String couleur, PetStore petStore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petStore = petStore;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
