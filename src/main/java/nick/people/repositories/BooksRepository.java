package nick.people.repositories;

import nick.people.models.Book;
import nick.people.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book,Integer> {
    List<Book> findByNameStartingWith(String query);
    List<Book> findByName(String Name);
    List<Book> findByOwner(Person owner);
    List<Book> findByAuthor(String author);
    List<Book> findByYearOfProduction(int yearOfProduction);
}
