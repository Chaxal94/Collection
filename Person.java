import java.util.Date;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Date bd;

    public Person(String name, int age, Date bd) {
        this.name = name;
        this.age = age;
        this.bd = bd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(bd, person.bd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, bd);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bd=" + bd +
                '}';
    }
}
