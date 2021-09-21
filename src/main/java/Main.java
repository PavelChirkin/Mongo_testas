import data.User;
import utilities.DbUtilities;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DbUtilities dbUtilities = new DbUtilities();

        Scanner sc = new Scanner(System.in);

        //User registration
        System.out.println("Please input your name");
        String name = sc.nextLine();
        System.out.println("Please input your surname");
        String surname = sc.nextLine();
        System.out.println("Please input your balance");
        double balance = Double.parseDouble(sc.nextLine());
        User user = new User(null, name, surname, balance);

    }
}
