package nick.people.repositories;

import nick.people.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {

    Optional<Person> findByName(String name);
    List<Person> findByNameOrderByYearOfBirth(String name);
    List<Person> findByYearOfBirth(int yearOfBirth);
    List<Person> findByNameStartingWith(String startingWith);
}
