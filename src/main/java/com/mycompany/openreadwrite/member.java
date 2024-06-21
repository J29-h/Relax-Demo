package com.mycompany.openreadwrite;

/**
 *
 * @author jae~jae~
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class member {
    
    private int ID ;   //cos id
    private String firstName; //name
    private String lastName;//++
    String email;// ADRESS
    private int phoneNumber;//SAME
    private int password;
    int id;
    
    
    public member() {
        this.ID=0;
        this.firstName=""; 
        this.lastName="";
        this.email="";
        this.phoneNumber=0;
        this.password=0;
    }

    public member(int ID, String firstName,String lastName, String email,int phoneNumber, int password) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;   
        this.email = email;
        this.phoneNumber=phoneNumber;
        this.password=password;
        
    }
    
    public member(member ship){
        this.ID=ship.ID; 
        this.firstName=ship.firstName;
        this.lastName=ship.lastName;
        this.email=ship.email;
        this.phoneNumber=ship.phoneNumber;
        this.password=ship.password;
    }

    member(int ID, String firstName, String lastName, String email, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
   
     public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPassword(int password){
        this.password=password;
    }
    
    
    public int getID() {
        return ID;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getemail() {
        return email;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public int getPassword(){
        return password;
    }
    public String toString(){
        String info;
        
        info="Passenger Information\n Number ID"+this.ID+"\nfirstName:"+this.firstName+
                "\nlastName:"+this.lastName+"\n Passenger email:"+this.email+"\nPhone Number"+this.phoneNumber+"\nPassword"+this.password;
        
        return info;
    }
    
    public void wrint_in_file() throws IOException{
        member mem = new member();
        FileWriter fwrite=new FileWriter("Passenger.txt",true);
        PrintWriter write=new PrintWriter(fwrite);
        mem.setID(ID);
        write.print(mem.getID()+"\t\t");
        mem.setfirstName(firstName);
        write.print(mem.getfirstName()+"\t\t");
        mem.setlastName(lastName);
        write.print(mem.getlastName()+"\t\t");
        mem.setemail(email);
        write.print(mem.getemail()+"\t\t\t");
        mem.setPhoneNumber(phoneNumber);
        write.println(mem.getPhoneNumber()+"\t\t\t");
        mem.setPassword(password);
        write.println(mem.getPassword());
        write.close();  
    }
    
    
   public void displayInfoPassenger() throws FileNotFoundException{
        
        System.out.println("No.\tPassenger ID\t  firstName\t lastName\t email \tPhone \tPassword");
        File file=new File("Passenger.txt");
        Scanner read=new Scanner(file);
        int count=1;
        while(read.hasNext()){
            
            String line=read.nextLine();
            
            System.out.println(count+"\t"+line);
            count++;
        }
        
        read.close();
    }
        
    
    
}
