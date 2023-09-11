package jsonpropertyExamples;

import pojo.Person;

public class EmployeeUsageExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lavanya");
        person.setAge(27);

        System.out.println(person.getName());
    }
}
