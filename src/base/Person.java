package base;
import java.util.*;

public class Person {

    public int id;
    public static ArrayList<Person> personList = new ArrayList<>();
    public String name;
    public final String nationalID;

    public Person(String name, String nationalID){
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
        id = personList.size();
    }

    public static Person findByID(int id){
        for(Person findPerson : personList){
            if(findPerson.id == id){
                return findPerson;
            }
        }
        return null;
    }

}
