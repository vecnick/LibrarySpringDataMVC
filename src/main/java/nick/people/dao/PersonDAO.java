package nick.people.dao;

import nick.people.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static JdbcTemplate jdbcTemplate = null;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        PersonDAO.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index(){
        return  jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class) );
    }

    public Person show(int id){
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
    }

    public void save(Person person){
        jdbcTemplate.update("INSERT INTO Person(name,number,age,email) VALUES(?,?,?,?)",person.getName(),
                person.getNumber(),person.getAge(),person.getEmail());
    }
    public void update(int id, Person person){
        jdbcTemplate.update("UPDATE Person SET name=?,number=?,age=?,email=? WHERE id=?",
                person.getName(),person.getNumber(),person.getAge(),person.getEmail(),id);
    }

    public static void delete(int id){
        jdbcTemplate.update("DELETE FROM Person WHERE id=?",id);
    }
}
