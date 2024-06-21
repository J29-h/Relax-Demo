package com.mycompany.openreadwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;// Scaneer class needed.
import java.util.Random;//Random class needed.
import java.util.ArrayList; // import the ArrayList class
import static java.lang.System.in;

public class Booking {
// Scanner object to read input.  
    Scanner keyboard = new Scanner(System.in);
    // search arttibutes:
    String Plane;// the number of flight.
    String departure;// from location.
    String arrival;// to location.
    int day, day2;// day of flight
    int month, month2;//monthe of flight
    int year, year2;//year of flight
    String P_class;// the flight class.
    int z, f, s, v, e, a;
// flight arttibutes:
    String date,date1;//date of flight.
    int t, t1;
    int num,num1,num2, num3, num4, num5;//the price number.
    int time,time1,time2,time3,time4,time5,time6,time7;// time of the flight
    String assistance;
    int cost;
// passenger arttibutes:
    int passenger;
    int i,k,y,j,w,l,r,q;
    String name;
    String seconed;
    String last;
    int age;
    int day1;
    int month1;
    int year1;
    String adult;
    private String ID;
    private int phone;
    String nat;
    String gender;
    ArrayList list;
    String title;
    String o, p, x;
    String email1;
    String password1;
    int count=0;
// seats _extra arrtibutes:
    String Seats;
// payment arttibutes:
    int bill;// the total.
    int g;
    public void Search() throws IOException //Searching for the fligth.
    {//////////////////////
        System.out.println("\n--------------- Enter The Information For Your Flight --------------- \n");
        // the loop will function until the user enter 0 and exit.
        do {
            //deciding how many round wanted.
            System.out.println("How Many round: \n1. One Way\n2.Two Way\n");
            Plane = keyboard.nextLine();
            switch (Plane) {
                case "2":// if it is two round then enter the departing and arrival location twice.
                    System.out.print("Enter Departure Location: \n");
                    departure = keyboard.nextLine();
                    System.out.print("Enter Arrival Location: \n");
                    arrival = keyboard.nextLine();
                    System.out.print("Date of Departure(1): \n");
                    System.out.print("01 02 03" + " 04 05 06 07\t" + " 1.Jan 2.Feb 3.Mar 4.Apr\n" + "08 09 10 11" + " 12 13 14\t");
                    System.out.print(" 5.May 6.Jun 7.Jul 8.Aug\n" + "15 16 17 18 19" + " 20 21\t 9.Sep 10.Oct 11.Nov 12.Dec\n" + "22 23 24 25 26 27 28\n29 30 31\n");
                    do {
                        System.out.print("Enter the Day:");
                        a = keyboard.nextInt();
                        if (a == 1) {
                            day = 1;
                        } else if (a == 2) {
                            day = 2;
                        } else if (a == 3) {
                            day = 3;
                        } else if (a == 4) {
                            day = 4;
                        } else if (a == 5) {
                            day = 5;
                        } else if (a == 6) {
                            day = 6;
                        } else if (a == 7) {
                            day = 7;
                        } else if (a == 8) {
                            day = 8;
                        } else if (a == 9) {
                            day = 9;
                        } else if (a == 10) {
                            day = 10;
                        } else if (a == 11) {
                            day = 11;
                        } else if (a == 12) {
                            day = 12;
                        } else if (a == 13) {
                            day = 13;
                        } else if (a == 14) {
                            day = 14;
                        } else if (a == 15) {
                            day = 15;
                        } else if (a == 16) {
                            day = 16;
                        } else if (a == 17) {
                            day = 17;
                        } else if (a == 18) {
                            day = 18;
                        } else if (a == 19) {
                            day = 19;
                        } else if (a == 20) {
                            day = 20;
                        } else if (a == 21) {
                            day = 21;
                        } else if (f == 22) {
                            day = 22;
                        } else if (a == 23) {
                            day = 23;
                        } else if (a == 24) {
                            day = 24;
                        } else if (a == 25) {
                            day = 25;
                        } else if (a == 26) {
                            day = 26;
                        } else if (a == 27) {
                            day = 27;
                        } else if (a == 28) {
                            day = 28;
                        } else if (a == 29) {
                            day = 29;
                        } else if (a == 30) {
                            day = 30;
                        } else if (a == 31) {
                            day = 31;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            day = 000;
                        }
                    } while (day == 000);
                    do {
                        System.out.print("Enter the Month:");
                        z = keyboard.nextInt();
                        if (z == 1) {
                            month = 1;
                        } else if (z == 2) {
                            month = 2;
                        } else if (z == 3) {
                            month = 3;
                        } else if (z == 4) {
                            month = 4;
                        } else if (z == 5) {
                            month = 5;
                        } else if (z == 6) {
                            month = 6;
                        } else if (z == 7) {
                            month = 7;
                        } else if (z == 8) {
                            month = 8;
                        } else if (z == 9) {
                            month = 9;
                        } else if (z == 10) {
                            month = 10;
                        } else if (z == 11) {
                            month = 11;
                        } else if (z == 12) {
                            month = 12;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            month = 000;
                        }
                    } while (month == 000);
                    do {
                        System.out.println("Enter the year please: (Year should be 2022 and up)");
                        v = keyboard.nextInt();
                        if (v >= 2022) {
                            year = v;
                        } else {
                            System.out.print("Entered Wrong, Try Again:\n");
                            year = 000;
                        }
                    } while (year == 000);
                    keyboard.nextLine();
                    System.out.print("Flight Class :\n" + ".Guest\n.Business\n.First\n");
                    P_class = keyboard.nextLine();
                    if (P_class.equalsIgnoreCase("Guest")) {
                        P_class = "Guest";
                    } else if (P_class.equalsIgnoreCase("Business")) {
                        P_class = "Business";
                    } else if (P_class.equalsIgnoreCase("First")) {
                        P_class = "First";
                    } else {
                        System.out.print("The User Didn't Enter a Valid Choice," + " So a Guest Class Will Be Chosen.");
                        P_class = "Guest";
                    }
                    System.out.print("****************************************");
                    System.out.print("Date of Departure(2): \n");
                    System.out.print("01 02 03" + " 04 05 06 07\t" + " 1.Jan 2.Feb 3.Mar 4.Apr\n" + "08 09 10 11" + " 12 13 14\t");
                    System.out.print(" 5.May 6.Jun 7.Jul 8.Aug\n" + "15 16 17 18 19" + " 20 21\t 9.Sep 10.Oct 11.Nov 12.Dec\n" + "22 23 24 25 26 27 28\n29 30 31\n");
                    do {
                        System.out.print("Enter the Day:");
                        e = keyboard.nextInt();
                        if (e == 1) {
                            day2 = 1;
                        } else if (e == 2) {
                            day2 = 2;
                        } else if (e == 3) {
                            day2 = 3;
                        } else if (e == 4) {
                            day2 = 4;
                        } else if (e == 5) {
                            day2 = 5;
                        } else if (e == 6) {
                            day2 = 6;
                        } else if (e == 7) {
                            day2 = 7;
                        } else if (e == 8) {
                            day2 = 8;
                        } else if (e == 9) {
                            day2 = 9;
                        } else if (e == 10) {
                            day2 = 10;
                        } else if (e == 11) {
                            day2 = 11;
                        } else if (e == 12) {
                            day2 = 12;
                        } else if (e == 13) {
                            day2 = 13;
                        } else if (e == 14) {
                            day2 = 14;
                        } else if (e == 15) {
                            day2 = 15;
                        } else if (e == 16) {
                            day2 = 16;
                        } else if (e == 17) {
                            day2 = 17;
                        } else if (e == 18) {
                            day2 = 18;
                        } else if (e == 19) {
                            day2 = 19;
                        } else if (e == 20) {
                            day2 = 20;
                        } else if (e == 21) {
                            day2 = 21;
                        } else if (e == 22) {
                            day2 = 22;
                        } else if (e == 23) {
                            day2 = 23;
                        } else if (e == 24) {
                            day2 = 24;
                        } else if (e == 25) {
                            day2 = 25;
                        } else if (e == 26) {
                            day2 = 26;
                        } else if (e == 27) {
                            day2 = 27;
                        } else if (e == 28) {
                            day2 = 28;
                        } else if (e == 29) {
                            day2 = 29;
                        } else if (e == 30) {
                            day2 = 30;
                        } else if (e == 31) {
                            day2 = 31;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            day2 = 000;
                        }
                    } while (day2 == 000);
                    do {
                        System.out.print("Enter the Month:");
                        f = keyboard.nextInt();
                        if (f == 1) {
                            month2 = 1;
                        } else if (f == 2) {
                            month2 = 2;
                        } else if (f == 3) {
                            month2 = 3;
                        } else if (f == 4) {
                            month2 = 4;
                        } else if (f == 5) {
                            month2 = 5;
                        } else if (f == 6) {
                            month2 = 6;
                        } else if (f == 7) {
                            month2 = 7;
                        } else if (f == 8) {
                            month2 = 8;
                        } else if (f == 9) {
                            month2 = 9;
                        } else if (f == 10) {
                            month2 = 10;
                        } else if (f == 11) {
                            month2 = 11;
                        } else if (f == 12) {
                            month2 = 12;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            month2 = 000;
                        }
                    } while (month2 == 000);
                    do {
                        System.out.println("Enter the year please: (Year should be 2022 and up)");
                        s = keyboard.nextInt();
                        if (s >= 2022) {
                            year2 = s;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            year2 = 000;
                        }
                    } while (year2 == 000);
                    keyboard.nextLine();
                    System.out.println("Flight Class :\n" + ".Guest\n.Business\n.First");
                    P_class = keyboard.nextLine();
                    if (P_class == null) {
                        System.out.print("The User Didn't Enter a Valid Choice," + " So a Guest Class Will Be Chosen.");
                        P_class = "Guest";
                    }
                    System.out.println("****************************************");
                    System.out.println("\nFlight Info:\n");
                    System.out.println("from " + departure + " to " + arrival);
                    Flight();
                    System.out.println("from " + arrival + " to " + departure);
                    Flight1();
                    Passenger();
                    Seats_Extra();
                    Payment();
                    break;
                case "1":// if it is one round then enter the departing and arrival location only once.
                    System.out.print("Enter Departure Location: \n");
                    departure = keyboard.nextLine();
                    System.out.print("Enter Arrival Location: \n");
                    arrival = keyboard.nextLine();
                    System.out.print("Date of Departure: \n");
                    System.out.print("01 02 03" + " 04 05 06 07\t" + " 1.Jan 2.Feb 3.Mar 4.Apr\n" + "08 09 10 11" + " 12 13 14\t");
                    System.out.print(" 5.May 6.Jun 7.Jul 8.Aug\n" + "15 16 17 18 19" + " 20 21\t 9.Sep 10.Oct 11.Nov 12.Dec\n" + "22 23 24 25 26 27 28\n29 30 31\n");
                    do {
                        System.out.print("Enter the Day:");
                        a = keyboard.nextInt();
                        if (a == 1) {
                            day = 1;
                        } else if (a == 2) {
                            day = 2;
                        } else if (a == 3) {
                            day = 3;
                        } else if (a == 4) {
                            day = 4;
                        } else if (a == 5) {
                            day = 5;
                        } else if (a == 6) {
                            day = 6;
                        } else if (a == 7) {
                            day = 7;
                        } else if (a == 8) {
                            day = 8;
                        } else if (a == 9) {
                            day = 9;
                        } else if (f == 10) {
                            day = 10;
                        } else if (f == 11) {
                            day = 11;
                        } else if (a == 12) {
                            day = 12;
                        } else if (a == 13) {
                            day = 13;
                        } else if (a == 14) {
                            day = 14;
                        } else if (a == 15) {
                            day = 15;
                        } else if (a == 16) {
                            day = 16;
                        } else if (a == 17) {
                            day = 17;
                        } else if (a == 18) {
                            day = 18;
                        } else if (a == 19) {
                            day = 19;
                        } else if (a == 20) {
                            day = 20;
                        } else if (f == 21) {
                            day = 21;
                        } else if (f == 22) {
                            day = 22;
                        } else if (a == 23) {
                            day = 23;
                        } else if (a == 24) {
                            day = 24;
                        } else if (a == 25) {
                            day = 25;
                        } else if (a == 26) {
                            day = 26;
                        } else if (a == 27) {
                            day = 27;
                        } else if (a == 28) {
                            day = 28;
                        } else if (a == 29) {
                            day = 29;
                        } else if (a == 30) {
                            day = 30;
                        } else if (a == 31) {
                            day = 31;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            day = 000;
                        }
                    } while (day == 000);
                    do {
                        System.out.print("Enter the Month:");
                        z = keyboard.nextInt();
                        if (z == 1) {
                            month = 1;
                        } else if (z == 2) {
                            month = 2;
                        } else if (z == 3) {
                            month = 3;
                        } else if (z == 4) {
                            month = 4;
                        } else if (z == 5) {
                            month = 5;
                        } else if (z == 6) {
                            month = 6;
                        } else if (z == 7) {
                            month = 7;
                        } else if (z == 8) {
                            month = 8;
                        } else if (z == 9) {
                            month = 9;
                        } else if (z == 10) {
                            month = 10;
                        } else if (z == 11) {
                            month = 11;
                        } else if (z == 12) {
                            month = 12;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            month = 000;
                        }
                    } while (month == 000);
                    do {
                        System.out.println("Enter the year please: (Year should be 2022 and up)");
                        v = keyboard.nextInt();
                        if (v >= 2022) {
                            year = v;
                        } else {
                            System.out.print("Entered Wrong, Enter Again:\n");
                            year = 000;
                        }
                    } while (year == 000);
                    keyboard.nextLine();
                    System.out.print("Flight Class :\n" + ".Guest\n.Business\n.First\n");
                    P_class = keyboard.nextLine();
                    if (P_class == null) {
                        System.out.print("The User Didn't Enter a Valid Choice," + " So a Guest Class Will Be Chosen.");
                        P_class = "Guest";
                    }
                    System.out.print("****************************************\n");
                    System.out.print("Flight Info:\n");
                    System.out.println("from " + departure + " to " + arrival);
                    Flight();
                    Passenger();
                    Seats_Extra();
                    Payment();
                    break;
                case "3","4","5","6","7","8","9":
                    System.out.print("Entered Wrong," + " Please Enter Again");
                    break;                    
                 default :
                    System.out.print("Entered Wrong," + " Please Enter Again");
                    Plane = "0";
                    break;
            }
        } while (!Plane.equals("0"));
    }

    public void Flight() {
        //Random object to choose random number for Price.
        Random r = new Random();

        num = ((int) (Math.random() * 100000)) % 1000;//looked it from a website "stackoverflow".
        num1 = ((int) (Math.random() * 100000)) % 1000;
        num2 = ((int) (Math.random() * 100000)) % 1000;
        System.out.println("A." + day + "/" + month + "\t" + "Price " + num + "$");//the Price on the chosen day.
        System.out.println("B." + (day + 1) + "/" + month + "\t" + "Price " + num1 + "$");//the price after the chosen day.
        System.out.println("C." + (day + 2) + "/" + month + "\t" + "Price " + num2 + "$");// the price after 2 days from the chosen day.
        System.out.println("Choose the Date:");
        date = keyboard.nextLine();
        switch (date) {////////////////////////////////
            case "A","a":
                System.out.println("you chose " + day + "/" + month + " " + num + "$");
                Date(day, month, num);
                cost = num;
                break;
            case "B","b":
                System.out.println("you chose " + (day + 1) + "/" + month + " " + num1 + "$");
                Date(day, month, num1);
                cost = num1;
                break;
            case "C","c":
                System.out.println("you chose " + (day + 2) + "/" + month + " " + num2 + "$");
                Date(day, month, num2);
                cost= num2;
                break;
            default:
                System.out.println("Entered Wrong");
                date="0";
                break;
        }
        do{
        time = 0 + (int) (Math.random() * ((12 - 0) + 1));// looked it from a website.
        time1 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        time2 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        time3 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        System.out.println("1* (" + time + ") A.M.");
        System.out.println("2* (" + time1 + ") P.M.");
        System.out.println("3* (" + time2 + ") A.M.");
        System.out.println("4* (" + time3 + ") P.M.");

        System.out.println("Choose time of Debarting");
        t = keyboard.nextInt();
        switch (t) {
            case 1:
                System.out.println("you chose (" + time + ") A.M");
                Time(time);
                break;
            case 2:
                System.out.println("you chose (" + time1 + ") P.M");
                Time(time1);
                break;
            case 3:
                System.out.println("you chose (" + time2 + ") A.M");
                Time(time2);
                break;
            case 4:
                System.out.println("you chose (" + time3 + ") A.M");
                Time(time3);
                break;
            default:
                System.out.println("Entered Wrong");
                t=00;
                break;

        }}while(t==00);
    }

    public void Flight1() {
        //Random object to choose random number for Price.
        Random r = new Random();

        num3 = ((int) (Math.random() * 100000)) % 1000;//looked it from a website "stackoverflow".
        num4 = ((int) (Math.random() * 100000)) % 1000;
        num5 = ((int) (Math.random() * 100000)) % 1000;
        System.out.println("A." + day2 + "/" + month2 + "\t" + "Price " + num3 + "$");//the Price on the chosen day.
        System.out.println("B." + (day2 + 1) + "/" + month2 + "\t" + "Price " + num4 + "$");//the price after the chosen day.
        System.out.println("C." + (day2 + 2) + "/" + month2 + "\t" + "Price " + num5 + "$");// the price after 2 days from the chosen day.

        System.out.println("Choose the Date:");
        date1 = keyboard.nextLine();
        switch (date1) {
            case "A","a":
                System.out.println("you chose " + day2 + "/" + month2 + " " + num3 + "$");
                Date(day2, month2, num3);
                break;
            case "B","b":
                System.out.println("you chose " + (day2 + 1) + "/" + month2 + " " + num4 + "$");
                Date(day2, month2, num4);

                break;
            case "C","c":
                System.out.println("you chose " + (day2 + 2) + "/" + month2 + " " + num5 + "$");
                Date(day2, month2, num5);

                break;
            default:
                System.out.println("Entered Wrong");

                break;
        }
        do{
        time4 = 0 + (int) (Math.random() * ((12 - 0) + 1));// looked it from a website.
        time5 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        time6 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        time7 = 0 + (int) (Math.random() * ((12 - 0) + 1));
        System.out.println("1* (" + time4 + ") A.M.");
        System.out.println("2* (" + time5 + ") P.M.");
        System.out.println("3* (" + time6 + ") A.M.");
        System.out.println("4* (" + time7 + ") P.M.");

        System.out.println("Choose time of Debarting");
        t1 = keyboard.nextInt();
        switch (t1) {
            case 1:
                System.out.println("you chose (" + time4 + ") A.M");
                Time(time4);
                break;
            case 2:
                System.out.println("you chose (" + time5 + ") P.M");
                Time(time5);
                break;
            case 3:
                System.out.println("you chose (" + time6 + ") A.M");
                Time(time6);
                break;
            case 4:
                System.out.println("you chose (" + time7 + ") A.M");
                Time(time7);
                break;
            default:
                System.out.println("Entered Wrong");
                t1=00;
                break;

        }}while(t1==00);
    }

    public void Passenger() throws IOException {////////////////////////////////////////
            System.out.println("\n***********************************");
            System.out.println("\nPassenger Info:");
            
            do{
                System.out.println("Passenger Number:");
                 x = keyboard.nextLine();            
            do{
            System.out.print("Title:\n1*MR.\n2*MRs.\n3*Ms.\n");
            j = keyboard.nextInt();
            switch (j) {
                case 1:
                    title = "MR.";
                    Title(title);
                    break;
                case 2:
                    title = "MRs.";
                    Title(title);
                    break;
                case 3:
                    title = "Ms.";
                    Title(title);
                    break;
                default:
                    System.out.print("Entered Wrong, Enter Again:\n");
                    j=0;
                    break;
            }}while(j!=0);
            keyboard.nextLine();
            System.out.print("First Name:\n");// skip??
            name = keyboard.nextLine();
            System.out.print("Seconed Name:\n");
            seconed = keyboard.nextLine();
            System.out.print("Last Name:\n");
            last = keyboard.nextLine();
            System.out.print("Age: ");
            age = keyboard.nextInt();
            if (age > 12) {
                // adult
            } else {
                //child
            }
            System.out.println("Gender:\n1*Male.\n2*Female.");
            k = keyboard.nextInt();
            switch (k) {
                case 1:
                    gender = "Male";
                    Gender(gender);
                    break;
                case 2:
                    gender = "Female";
                    Gender(gender);
                    break;
                default:
                    System.out.print("Entered Wrong, Enter Again:\n");
                    break;
            }
            System.out.println("Identification Document:");
            System.out.println("Date of Birth: ");
            System.out.print("01 02 03" + " 04 05 06 07\t" + " 1.Jan 2.Feb 3.Mar 4.Apr\n" + "08 09 10 11" + " 12 13 14\t");
            System.out.print(" 5.May 6.Jun 7.Jul 8.Aug\n" + "15 16 17 18 19" + " 20 21\t 9.Sep 10.Oct 11.Nov 12.Dec\n" + "22 23 24 25 26 27 28\n29 30 31\n");
            do {
                System.out.print("Enter the Day:");
                w = keyboard.nextInt();
                if (w == 1) {
                    day1 = 1;
                } else if (w == 2) {
                    day1 = 2;
                } else if (w == 3) {
                    day1 = 3;
                } else if (w == 4) {
                    day1 = 4;
                } else if (w == 5) {
                    day1 = 5;
                } else if (w == 6) {
                    day1 = 6;
                } else if (w == 7) {
                    day1 = 7;
                } else if (w == 8) {
                    day1 = 8;
                } else if (w == 9) {
                    day1 = 9;
                } else if (w == 10) {
                    day1 = 10;
                } else if (w == 11) {
                    day1 = 11;
                } else if (w == 12) {
                    day1 = 12;
                } else if (w == 13) {
                    day1 = 13;
                } else if (w == 14) {
                    day1 = 14;
                } else if (w == 15) {
                    day1 = 15;
                } else if (w == 16) {
                    day1 = 16;
                } else if (w == 17) {
                    day1 = 17;
                } else if (w == 18) {
                    day1 = 18;
                } else if (w == 19) {
                    day1 = 19;
                } else if (w == 20) {
                    day1 = 20;
                } else if (w == 21) {
                    day1 = 21;
                } else if (w == 22) {
                    day1 = 22;
                } else if (w == 23) {
                    day1 = 23;
                } else if (w == 24) {
                    day1 = 24;
                } else if (w == 25) {
                    day1 = 25;
                } else if (w == 26) {
                    day1 = 26;
                } else if (w == 27) {
                    day1 = 27;
                } else if (w == 28) {
                    day1 = 28;
                } else if (w == 29) {
                    day1 = 29;
                } else if (w == 30) {
                    day1 = 30;
                } else if (w == 31) {
                    day1 = 31;
                } else {
                    System.out.print("Entered Wrong, Enter Again:\n");
                    day1 = 000;
                }
            } while (day1 == 000);
            do {
                System.out.print("Enter the Month:");
                l = keyboard.nextInt();
                if (l == 1) {
                    month1 = 1;
                } else if (l == 2) {
                    month1 = 2;
                } else if (l == 3) {
                    month1 = 3;
                } else if (l == 4) {
                    month1 = 4;
                } else if (l == 5) {
                    month1 = 5;
                } else if (l == 6) {
                    month1 = 6;
                } else if (l == 7) {
                    month1 = 7;
                } else if (l == 8) {
                    month1 = 8;
                } else if (l == 9) {
                    month1 = 9;
                } else if (l == 10) {
                    month1 = 10;
                } else if (l == 11) {
                    month1 = 11;
                } else if (l == 12) {
                    month1 = 12;
                } else {
                    System.out.print("Entered Wrong, Enter Again:\n");
                    month1 = 000;
                }
            } while (month1 == 000);
            keyboard.nextLine();
            do {
                System.out.println("Enter the year:");
                r =keyboard.nextInt();

                if (r <= 2022) {
                    year1 = r;
                } else {
                    System.out.print("Entered Wrong, Try Again:\n");
                    year1 = 000;
                }
            } while (year1 == 000);
            keyboard.nextLine();
            System.out.print("Nationality: ");
            nat = keyboard.nextLine();
            System.out.print("PassPort Number:");
            ID = keyboard.nextLine();
            }while(!x.equals("0"));
    }

    public void Seats_Extra() {
        System.out.println("**************************************************************************************************");
        System.out.println("Seats And Extra:\n"); 
        System.out.print("--------------------------------------------" + "------------------------------------------------ \n");
        System.out.print("//| [1A [4A [7A [1C [4C [7C [7D [1E [4E [7E | W  " + "| [1G [4G [7G [1I [4I [7I [1K [4K [7K [1M |//\n");
        System.out.print("//| [2A [5A [8A [2C [5C [8C [8D [2E [5E [8E | C  " + "| [2G [5G [8G [2I [5I [8I [2K [5K [8K [2M |//\n");
        System.out.print("//| [3A [6A [9A [3C [6C [9C [9D [3E [6E [9E |___ " + "| [3G [6G [9G [3I [6I [9I [3K [6K [9K [3M |//\n");
        System.out.print("//|                                              " + "                                          |//\n");
        System.out.print("//|                                          ___ " + "                                          |//\n");
        System.out.print("//| [1B [4B [7B [1D [1D [4D [7D [1F [4F [7F |    " + "| [1H [4H [7H [1J [4J [7J [1L [4L [7L [1N |//\n");
        System.out.print("//| [2B [5B [8B [2D [2D [5D [8D [2F [5F [8F | C  " + "| [2H [5H [8H [2J [5J [8J [2L [5L [8L [2N |//\n");
        System.out.print("//| [3B [6B [9B [3D [3D [6D [9D [3F [6F [9F | W  " + "| [3H [6H [9H [3J [6J [9J [3L [6L [9L [3N |//\n");
        System.out.print("--------------------------------------------" + "------------------------------------------------  \n");
    do {
    System.out.println("Choose a Seat:(to exit type 0)");
             Seats = keyboard.nextLine();
        }while(!Seats.equals("0"));
    }

    public void Date(int day, int month, int num) {
        this.day = day;
        this.month = month;
        this.num = num;
    }//took a friend advice.

    public void Time(int time) {
        this.time1 = time;
        this.time2 = time;
        this.time3 = time;
        this.time = time;

    }

    public void Title(String title) {
        this.title = title;
    }

    public void Gender(String gender) {
        this.gender = gender;
    }

    public void Birth(int day1, int month1, int year1) {
        this.day1 = day1;
        this.month1 = month1;
        this.year1 = year1;
    }

    public void Payment() {
        g=((int) (Math.random() * 100000000)) % 1000000;

        System.out.println("Payment:");
        System.out.println("******************************************");
        System.out.println("Flight Number: "+g);
        System.out.println("from: "+departure+" to: "+ arrival);
        System.out.println("Your Total is:"+cost);
        System.out.println("******************************************");
        System.out.println("How Would You Like To Pay?\n1.Visa\n2.Cash");
        y=keyboard.nextInt();
        keyboard.nextLine();
        do{
            switch(y){
                case 1:
                System.out.println("Enter Card Number:");
                String card = keyboard.nextLine();
                System.out.println("Enter Exipred Date of Card");
                String Expire= keyboard.nextLine();
                System.out.println("Enter the CVV:");
                int digit=keyboard.nextInt();
                System.out.println("Your Bill Number:");
                bill=((int) (Math.random() * 100000000)) % 1000000;
                System.out.println("Your Payment is Complete");
                break;
                case 2:
                System.out.println("Go to one of Our  Nearest Branches and Pay them there.");
                System.out.println("Your Bill Number:");
                bill=((int) (Math.random() * 100000000)) % 1000000;
                System.out.print(bill);
            }
        }while(y==0);
    }
    
    }


