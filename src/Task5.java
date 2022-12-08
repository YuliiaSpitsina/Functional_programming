import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Holly", "Belly", 25));
        personList.add(new Person("Sakura", "Naruto", 18));
        personList.add(new Person("Katerina", "Boltovskoi", 150));


        System.out.println(personList.stream().filter(person -> person.firstName.length() + person.lastName.length() < 15).max(new PersonAgeComparator()));
    }

    public static class PersonAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
    public static class Person {
        private final String firstName;
        private final String lastName;
        private final int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public String toString() {
            return  firstName + " " + lastName ;
                    }
    }
}

