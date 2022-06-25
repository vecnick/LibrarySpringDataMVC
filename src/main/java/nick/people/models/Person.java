package nick.people.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 3 characters")
    private String name;

    @NotEmpty(message = "Email should be empty")
//    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Number should not be empty")
    @Min(value = 0,message = "Number should be grater than 0" )
    private String number;

    @Min(value = 0,message = "Age should be grater than 0" )
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Person(int id, String name,int age, String email,String number) {
        this.number = number;
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
