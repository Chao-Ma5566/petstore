package petstore.entite.method;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="name")
    private String name;

    @Column (name="managerName")
    private String managerName;

    @ManyToMany
    @JoinTable(name="PetStore_Product",
            joinColumns= @JoinColumn(name="ID_PRODUCT", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="ID_PETSTORE", referencedColumnName="ID"))

    private Set<Product> products = new HashSet<>();

    @OneToMany (mappedBy = "petStore", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Animal> animals;

    @OneToOne
    @JoinColumn (name="ID_ADDRESS")
    private Address address;

    public PetStore() {
    }

    public PetStore(String name, String managerName, Set<Product> products, Set<Animal> animals, Address address) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.animals = animals;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
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
