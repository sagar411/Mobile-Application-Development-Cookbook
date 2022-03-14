package com.example.starbuzz;

public class Stores {
    private  String name;
    private  String discription;
    private  int imageResourcesId;

    public  static final Stores[] stores ={
            new Stores("kathmandu","hello this is good place",R.drawable.cafe1),
            new Stores("palpa","helloo this is good place",R.drawable.cafe2),
            new Stores("syangja","this is good ",R.drawable.image)

    };
    private Stores(String name,String discription, int imageResourcesId){
        this.name= name;
        this.discription =discription;
        this.imageResourcesId =imageResourcesId;
    }

    public String getName() {
        return name;
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
