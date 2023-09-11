package jsonIgnoreExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Employee;

public class JsonIgnorePropertiesExamples {
    public static void main(String[] args) throws JsonProcessingException {
        String response = "{\n" +
                "  \"name\":\"Lav\",\n" +
                "  \"age\" : 27,\n" +
                "  \"married\" : false,\n" +
                "  \"mobileNo\" : \"978299\"\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee= objectMapper.readValue(response, Employee.class);
        System.out.println(employee.getAge());
    }
}
