package petstore.entite.method;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="number")
    private String number;

    @Column (name="street")
    private String street;

    @Column (name="zipCode")
    private String zipCode;

    @Column (name="city")
    private String city;

    @OneToOne (mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PetStore petStore;

    public Address() {
    }

    public Address(String number, String street, String zipCode, String city, PetStore petStore) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.petStore = petStore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }
}
