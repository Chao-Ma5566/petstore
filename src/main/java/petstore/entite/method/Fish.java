package petstore.entite.method;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.util.Date;

@Entity
public class Fish extends Animal{
    @Enumerated
    @Column(name="livingEnv")
    private FishLivEnv fishLivEnv;

    public Fish() {
    }

    public Fish(Date birth, String couleur, PetStore petStore, FishLivEnv fishLivEnv) {
        super(birth, couleur, petStore);
        this.fishLivEnv = fishLivEnv;
    }

    public Fish(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }

    public FishLivEnv getFishLivEnv() {
        return fishLivEnv;
    }

    public void setFishLivEnv(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }


}
