/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Danielle
 */
public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        UserProfile user1 = new UserProfile("Danielle", "Mystery");
    String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = input.nextLine();
    System.out.println("The available Genres");
    for(String gen:genres){
        System.out.println(gen);
    }
    System.out.println("Please select a Genre");
    String genre = input.nextLine();
    UserProfile user1 = new UserProfile(name, genre);
    }
    
}
