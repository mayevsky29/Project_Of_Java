package program.dto.admin.authordto;

import com.github.javafaker.Faker;
import lombok.Data;
import program.entities.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import static ch.qos.logback.core.util.OptionHelper.isEmpty;


@Data
public class AuthorAddDto {
    private String fullName;
    private String imageBase64;

//    public Scanner scanner = new Scanner(System.in);
//
//    public ArrayList<Author> SelectProductsFromDb(String str)
//    {
//        try (Connection conn = DriverManager.getConnection(str, "root", ""))
//        {
//            String query = "SELECT * FROM `authors`";
//            try (PreparedStatement statement = conn.prepareStatement(query))
//            {
//
//                ResultSet data = statement.executeQuery();
//                ArrayList<Author> authors;
//                while(data.next())
//                {
//                    authors.add(new Author(data.getInt("Id"), data.getString("Name"));
//                }
//
//                return authors;
//            }
//            catch (Exception ex)
//            {
//                System.out.println(ex.getMessage());
//                return null;
//            }
//        }
//        catch (SQLException ex)
//        {
//            System.out.println("Error connection to Database");
//            return null;
//        }
//        catch (Throwable ex)
//        {
//            System.out.println("Exception driver: " + ex.getMessage());
//            return null;
//        }
//    }
//
//    public void InsertIntoDb(String str)
//    {
//        try (Connection conn = DriverManager.getConnection(str, "root", ""))
//        {
//            String query = "INSERT INTO `products` (`Name`) VALUES (?)";
//            try (PreparedStatement statement = conn.prepareStatement(query))
//            {
//                String name;
//
//                System.out.print("Ведіть назву книги: ");
//                name = scanner.nextLine();
//                statement.setString(1, name);
//
//
//                int rows = statement.executeUpdate();
//                System.out.println("Обновлено кількість рядків: " + rows);
//            }
//            catch (Exception ex)
//            {
//                System.out.println(ex.getMessage());
//            }
//        }
//        catch (SQLException ex)
//        {
//            System.out.println("Помилка підключення до БД!");
//        }
//        catch (Throwable ex)
//        {
//            System.out.println("Exception driver: " + ex.getMessage());
//        }
//    }
//
//    public void InsertIntoDbFaker(String str, Author author)
//    {
//        try (Connection conn = DriverManager.getConnection(str, "root", ""))
//        {
//            String query = "INSERT INTO `authors` (`Name`) VALUES (?)";
//            try (PreparedStatement statement = conn.prepareStatement(query))
//            {
//                statement.setString(1, author.getName());
//
//
//                int rows = statement.executeUpdate();
//            }
//            catch (Exception ex)
//            {
//                System.out.println(ex.getMessage());
//            }
//        }
//        catch (SQLException ex)
//        {
//            System.out.println("Error!");
//        }
//        catch (Throwable ex)
//        {
//            System.out.println("Exception driver: " + ex.getMessage());
//        }
//    }
//
//
//    public void SeedData(String str)
//    {
//        if(isEmpty(str))
//        {
//            Faker faker = new Faker(new Locale("uk"));
//
//            String authorName;
//
//            for(int i = 0; i< 1000; i++)
//            {
//                Author author = new Author(i,
//                        faker.commerce().authorName()
//
//                InsertIntoDbFaker(str, authorName);
//            }
//        }
//    }

}


