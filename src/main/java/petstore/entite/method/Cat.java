package petstore.entite.method;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Cat extends Animal{
    @Column (name="chipId")
    private String chipId;

    public Cat() {
    }

    public Cat(Date birth, String couleur, PetStore petStore, String chipId) {
        super(birth, couleur, petStore);
        this.chipId = chipId;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
