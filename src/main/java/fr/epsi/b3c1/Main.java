package fr.epsi.b3c1;

import petstore.entite.method.Address;
import petstore.entite.method.Cat;
import petstore.entite.method.PetStore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pet_store");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    //préparation de donnée
    PetStore newPetStore = new PetStore();

    newPetStore.setName("Hello");
    newPetStore.setManagerName("Marie");
    Address newAddress = new Address("12","street","zet","sfe", newPetStore);
    newPetStore.setAddress(newAddress);
    tx.begin();
        //insertion newPetStore
        try{
            em.persist(newAddress);
            long id = newAddress.getId();
            System.out.println("new adress est ajouté avec id: " + id);
        }catch(Exception e){
            System.out.println("priorité inexistante ou null");
        }


    tx.commit();
    em.close();
    emf.close();
    }
}