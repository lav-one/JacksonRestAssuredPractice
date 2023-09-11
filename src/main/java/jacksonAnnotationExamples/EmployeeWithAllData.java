package jacksonAnnotationExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Employee;
import pojo.EmployeeHobbies;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWithAllData {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employee1 = new Employee();
        employee1.setName("Lavanya");
        employee1.setAge(30);
        employee1.setMarried(false);
        employee1.setMobileNo("99889");
        employee1.setSkills(new ArrayList<>());
        employee1.setFamily_members(new HashMap<String,String>());


        ObjectMapper objectMapper = new ObjectMapper();
        String employeeString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
        System.out.println(employeeString);

        EmployeeHobbies employee1Hobbies = new EmployeeHobbies();
        employee1Hobbies.setName("Lavanya");
        employee1Hobbies.setAge(30);
        employee1Hobbies.setMarried(false);
        employee1Hobbies.setMobileNo("99889");
        employee1Hobbies.setSkills(new ArrayList<>());
        employee1Hobbies.setFamily_members(new HashMap<String,String>());
        employee1Hobbies.setHobbies("gardening");
        String employee1Hobby = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1Hobbies);
        System.out.println(employee1Hobby);
    }
}
