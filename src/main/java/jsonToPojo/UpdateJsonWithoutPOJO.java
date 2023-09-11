package jsonToPojo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class UpdateJsonWithoutPOJO {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map map = objectMapper.readValue(new File("src/test/payloads/address.json"), new TypeReference<Map<String, Object>>() {
        });
        System.out.println(map.get("city"));
        map.put("city","Hyd");
        System.out.println(map.get("city"));
    }
}
