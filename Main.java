import java.util.*;

public class Main {
    public static void main(String[] args) {


       Person person = new Person("wew3e",5,new Date());
       Person person1 = new Person("wehyythw3e",8,new Date());
       Person person2 = new Person("wew3rgte",7,new Date());
       HashSet<Person> people = new HashSet<>();
        people.add(person);
        people.add(person1);
        people.add(person2);
        HashSet<Person> people1 = new HashSet<>();
        people1.addAll(people);
        System.out.println(people1.contains(person));
        System.out.println(people1.contains(person1));


        System.out.println(people1.contains(people));// stex chen karo spes stugel?
        



















    }

}
