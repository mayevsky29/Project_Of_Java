package program;

import entities.Author;
import entities.Book;
import entities.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Session;
import utils.DbContext;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public  static void main(String[] args) {
        Session context = DbContext.getSessionFactory().openSession();
        System.out.println("Connection is good");

        System.out.println("Назва книжки:");
        String name = in.nextLine();
        System.out.println("Автор id:");
        int author_id = Integer.parseInt(in.nextLine());
        Book book = new Book();
        book.setName(name);
        Author author = new Author();
        author.setId(author_id);
        book.setAuthor(author);
        context.save(book);
        System.out.println("Book id = "+ book.getId());

        context.close();


    }
}