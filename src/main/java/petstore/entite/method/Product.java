package petstore.entite.method;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="code")
    private String code;

    @Column (name="label")
    private String label;

    @Column (name="price")
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProdType type;
    @ManyToMany(mappedBy="products",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<PetStore> petStores = new HashSet<>();

    public Product() {
    }

    public Product(String code, String label, Double price, ProdType type, Set<PetStore> petStores) {
        this.code = code;
        this.label = label;
        this.price = price;
        this.type = type;
        this.petStores = petStores;
    }

    public ProdType getType() {
        return type;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<PetStore> getPetStores() {
        return petStores;
    }

    public void setPetStores(Set<PetStore> petStores) {
        this.petStores = petStores;
    }
}
