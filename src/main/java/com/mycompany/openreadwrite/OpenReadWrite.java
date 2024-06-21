package com.mycompany.openreadwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*; //the star * to open all io packages
import static java.lang.System.in;

/**
 *
 * @author evam
 */
public class OpenReadWrite {

    public static void main(String[] args) throws IOException {
        Scanner key = new Scanner(System.in);
        Relaxemo re = new Relaxemo();
        Other o = new Other();
        int b;
        String a;
        String name, flight, date, fileCont = "", answer;

        System.out.print("------------------ Welcome to Relax Airline ---------------");
        System.out.println();
        System.out.print("---------------- We ho you enjoy our servicess -------------");
        Booking booking = new Booking();
        booking.Search();

        System.out.print("*****************************************************\n");
        // File name to open .without path because file in project file. 
        File file = new File("ConfirmBooking.txt");
        Scanner scan = new Scanner(file);
        System.out.print("name:");
        name = key.nextLine();
        System.out.print("flight:");
        flight = key.nextLine();
        System.out.print("date:");
        date = key.nextLine();
        while (scan.hasNextLine()) {
            fileCont = fileCont.concat(scan.nextLine() + "\n");
        }
        System.out.println(fileCont);
        System.out.println("** Write Yes/y to accept or write No/n to cancel **");
        answer = key.nextLine();
        if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {
            FileWriter write = new FileWriter(name + "_ConfirmBooking.txt");
            write.write(fileCont);
            write.write("Name:" + name + "\n");
            write.write("Flight Number:" + flight + "\n");
            write.write("Date:" + date + "\n");
            write.close();
        } else if (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N")) {
            System.out.println("**Book was Canceled**");
        } else {
            System.out.println("Wrong Input, Try Again");
         }
        System.out.print("\n");
        System.out.print("------------------ Thank u for bookin in Relax Airline ---------------");
        System.out.println();
        System.out.print("--------------- Would you like to try our other servicess ---------------");
        do {
            System.out.println("\n_Yes\n_NO\n");
            a = key.nextLine();
            switch (a) {

                case "Yes","yes","y":
                    System.out.println("***********Be a VIP Member in Relax Airline***********");
                    System.out.println();
                    System.out.println("*************Get Info About your Location**************");
                    System.out.println();
                    System.out.println("******************* Type 0 to Exit ********************");
                    System.out.println();
                    do {
                        System.out.println("Choose 1 ,or 2:");
                        b = key.nextInt();
                        switch (b) {

                            case 1:
                                FileWriter fwrite = new FileWriter("Passenger.txt", true);
                                PrintWriter write = new PrintWriter(fwrite);
                                member mem = new member();
                                mem.wrint_in_file();
                                re.Relax();
                                break;
                            case 2:
                                re.PassengerChoise();
                                o.creat_hotel();
                                break;
                            case 0:
                                System.out.println("***************Thank u for choosing Relax Airline ****************");
                                System.out.println();
                                System.out.println("*** We hope you enjoyed our Servicess we hope to see you again ***");
                                System.out.println();
                                System.exit(0);
                                break;
                            case 3,4,5,6,7,8,9:
                                System.out.print("Entered Wrong," + " Please Enter Again");
                                break;
                            default:
                                System.out.print("Entered Wrong," + " Please Enter Again");
                                break;
                        }
                    } while (b == 0);

                    break;
                case "No","no","n":
                    System.out.println("***************Thank u for choosing Relax Airline ****************");
                    System.out.println();
                    System.out.println("*** We hope you enjoyed our Servicess we hope to see you again ***");
                    System.out.println();
                    System.exit(0);
                    Relaxemo choiseObject = new Relaxemo();
                    choiseObject.PassengerChoise();

                    break;
                default:
                    a = "0";

            }
        } while (!a.equals("0"));

        //String name, flight, date, fileCont = "", answer;
    }
}
