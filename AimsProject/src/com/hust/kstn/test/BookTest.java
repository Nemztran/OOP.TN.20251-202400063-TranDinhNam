package com.hust.kstn.test;
import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Nguyen Van A", 2003, "ABCD");
        BookAuthor author2 = new BookAuthor("Nguyen Van B", 2006, "MNPQ");
        Book book1 = new Book("Vat li dai cuong", "Giao trinh", 26.2, 1305, Arrays.asList(author1, author2));
        System.out.println(book1);
    }
}
