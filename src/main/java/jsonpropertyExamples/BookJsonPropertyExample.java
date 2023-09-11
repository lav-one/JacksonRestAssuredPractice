package jsonpropertyExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Book;

public class BookJsonPropertyExample {
    public static void main(String[] args) throws JsonProcessingException {
        Book book = new Book();
        book.setBookName("Test");
        book.setAuthorName("Lavanya");

        ObjectMapper objectMapper = new ObjectMapper();
        String bokObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);
        System.out.println(bokObject);

        Book b = objectMapper.readValue(bokObject, Book.class);
        System.out.println(b.getBookName());
        System.out.println(b.getAuthorName());
    }
}
