package com.example.airlineadvisorapp;

public class Flight {
    private  String name;
    private  String time;
    private  int price;
    private int image;

    public  static final Flight[] flights ={
            new Flight("YETI-1","12:30 AM",5000,R.drawable.yeti),
            new Flight("YETI-2","10:30 AM",4500,R.drawable.yeti2),
            new Flight("YETI-3","1:30 AM",6000,R.drawable.yeti4)

    };
    private Flight(String name,String time, int price,int image){
        this.name= name;
        this.time =time;
        this.price =price;
        this.image=image;
    }

    public String getName() {
        return name;
    }



    public String getTime() {
        return time;
    }


    public int getPrice() {
        return price;
    }
    public String toString(){
        return  this.name+"    "+this.time + "    Rs."+this.price;

    }


    public int getImage() {
        return image;
    }
}


