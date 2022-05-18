package Lesson_1;

public class Task1 {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Devid")
                .lastName("Patterson")
                .middleName("empty")
                .country("USA")
                .address("Third Builder street")
                .phone("8-800-555-35-35")
                .age(1000)
                .gender("man")
                .build();
        System.out.println(person.toString());
    }
}
