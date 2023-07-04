package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClimatImpl {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("puMeteo");

    public Climat saveClimat(Climat climat) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(climat);
            et.commit();
        } catch (RuntimeException e) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
            throw e;
        } finally {
            em.close();
        }
//        System.out.println("Success");
        return climat;
    }
}
