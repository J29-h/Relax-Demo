package com.mycompany.openreadwrite;

import java.util.ArrayList;

/**
 *
 * @author jae~jae~
 */
public final class Other {
private String hotel ;
private String restaurant;

private String Famly_places;
public static  ArrayList<Other> listed=new ArrayList <Other> ();
  public  Other(){
this.hotel=null;
this.restaurant=null;
this.Famly_places=null;
creat_hotel();

}
 
 
  public  Other(String hotel,String restaurant,String Famly_places){
this.hotel=hotel;
this.restaurant=restaurant;
this.Famly_places=Famly_places;
}


   public void sethotel(String hotel) {
        this.hotel = hotel;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant= restaurant;
    }

    public void setFamly_places(String Famly_places) {
        this.Famly_places = Famly_places;
    }
    
    
    public String getHotel() {
        return hotel;
    }

    
    public String getRestaurant() {
        return restaurant;
    }
     public String getFamly_places() {
        return Famly_places;
    }
    
    
    @Override
    public String toString(){
        String info;
        
        info="Passenger Information\n hotel is  :"+this.hotel+"\n restaurant is :"+this.restaurant+"\n   Famly_places"+this.Famly_places;
        
        return info;
    }
   public void creat_hotel(){
Other object;
   object=new Other("Hilton","Mcdonald's","city center");
  listed.add(object);
  object=new Other("Holiday In","Kfc","Archeology Museum");
  listed.add(object);
   object=new Other("The Ritz-Carlton","Subway","CIty tower");
  listed.add(object);
  object=new Other(" InterContinental","Shake shack","Amusement park");
  listed.add(object);
   object=new Other("Crowne Plaza","Masa","Zoo");
  listed.add(object);
  object=new Other(" Mövenpick","Nasrat","Cinema");
  listed.add(object);
   object=new Other("Radisson Blu","Paul","Beach or Hills");
  listed.add(object);
   }
}

    

