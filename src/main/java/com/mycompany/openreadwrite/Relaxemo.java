package com.mycompany.openreadwrite;


import com.mycompany.openreadwrite.Other;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jae~jae~
 */
public class Relaxemo {

    public void Relax() throws IOException {

        Scanner scan = new Scanner(System.in);
        ArrayList<member> members = new ArrayList<>();
        member ship = new member();
        int ID;
        String firstName;
        String lastName;
        String email;
        int phoneNumber;
        int password;
        System.out.println("Enter YOUR National ID number:");
        ID = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your firstName:");
        firstName = scan.nextLine();
        System.out.println("Enter your lastName:");
        lastName = scan.nextLine();
        System.out.println("Enter your email:");
        email = scan.nextLine();
        System.out.println("Enter your Phone number:");
        phoneNumber = scan.nextInt();
        System.out.println("Create Password:");
        password=scan.nextInt();
        member shi;
        shi = new member(ID, firstName, lastName, email, phoneNumber, password);
        members.add(shi);
        shi.wrint_in_file();
        

    }

    public void PassengerChoise() {

        Scanner scan = new Scanner(System.in);

        int choice1 = 1;
        int choice2 = 1;
        while (choice1 != 0) {
            Other h;
            h = new Other();
            h.creat_hotel();
            System.out.println(" \n \n  choose a number for information");
            System.out.println(" 1.Hotel\n 2. Restaurant \n 3. Famly  places\n 0. exit ");

            choice1 = scan.nextInt();
            switch (choice1) {

                case 0:
                    System.out.println("  HOPE WE HAVE BNIFETED YOU AND THANK U FOR USING RELAX AIRLINE !");
                    break;
                case 1:

                    System.out.println(" the hotel");

                    for (int i = 0; i < Other.listed.size(); i++) {
                        System.out.println("[" + i + " ]" + Other.listed.get(i).getHotel());
                    }
                    break;
                case 2:
                    System.out.println(" the Restaurant");

                    for (int i = 0; i < Other.listed.size(); i++) {
                        System.out.println("[" + i + " ]- " + Other.listed.get(i).getRestaurant());
                    }
                    break;

                case 3:
                    System.out.println(" Family_places");

                    for (int i = 0; i < Other.listed.size(); i++) {
                        System.out.println("[" + i + " ]- " + Other.listed.get(i).getFamly_places());
                    }
                    break;
                default:
                    System.out.println("Sorry, invalid choice");
            }
        }
    }

}
