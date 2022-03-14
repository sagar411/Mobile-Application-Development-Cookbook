package com.example.airlineadvisorapp;

public class Shree{
    private  String name;
    private  String time;
    private  int price;
    private int image;

    public  static final Shree[] shrees ={
            new Shree("Shree-1","4:30 PM",3000,R.drawable.image22),
            new Shree("Shee-2","1:30 PM",7100,R.drawable.image22),
            new Shree("Shree-3","5:30 AM",2100,R.drawable.shree3)

    };
    private Shree(String name,String time, int price,int image){
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
