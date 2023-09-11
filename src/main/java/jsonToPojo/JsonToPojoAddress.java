package jsonToPojo;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Address;

import java.io.File;
import java.io.IOException;

public class JsonToPojoAddress {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Address address =  objectMapper.readValue(new File("src/test/payloads/address.json"), Address.class);
        System.out.println(address.getCity());
        address.setCity("Delhi");
        System.out.println(address.getCity());

        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address));
    }
}
