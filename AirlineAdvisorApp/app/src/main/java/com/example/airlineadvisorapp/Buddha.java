package com.example.airlineadvisorapp;

public class Buddha {
    private  String name;
    private  String time;
    private  int price;
    private int image;

    public  static final Buddha[] buddhas ={
            new Buddha("Buddha-1","2:30 PM",6000,R.drawable.buddha),
            new Buddha("Buddha-2","5:30 PM",7500,R.drawable.buddhaa),
            new Buddha("Buddha-3","7:30 PM",2000,R.drawable.buddhaimg)

    };
    private Buddha(String name,String time, int price,int image){
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
