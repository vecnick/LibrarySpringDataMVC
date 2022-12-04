package nick.people.dao;

import nick.people.models.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class BookDao {
    private final EntityManager entityManager;

    @Autowired
    public BookDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    @Transactional(readOnly = true)
//    public Optional<Person> getBookOwner(int id){
//        Session session = entityManager.unwrap(Session.class);
//        Set<Person> people = new HashSet<Person>(session.createQuery("SELECT b FROM Book b LEFT JOIN FETCH b.owner ").getResultList());
//    }
}
