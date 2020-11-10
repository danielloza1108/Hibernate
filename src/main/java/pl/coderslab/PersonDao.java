package pl.coderslab;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonDao {
    @PersistenceContext
    EntityManager entityManager;

    public PersonDao() {
    }

    public void save(Personn person){
        entityManager.persist(person);
    }
}
