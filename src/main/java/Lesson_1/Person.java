package Lesson_1;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;
}
