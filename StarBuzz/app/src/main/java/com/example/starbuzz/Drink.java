package com.example.starbuzz;


public class Drink {
    private  String name;
    private  String discription;
    private  int imageResourcesId;

    public  static final Drink[] drinks ={
            new Drink("Latte","hello this is good latte",R.drawable.cafe2),
            new Drink("Coffee","helloo this is good cofee",R.drawable.coffe),
            new Drink("Cappuccino","this is good ",R.drawable.image)

    };
    private Drink(String name,String discription, int imageResourcesId){
        this.name= name;
        this.discription =discription;
        this.imageResourcesId =imageResourcesId;
    }





    public String getDiscription() {
        return discription;
    }


    public int getImageResourcesId() {
        return imageResourcesId;
    }
    public String toString(){
        return  this.name;
    }

}

