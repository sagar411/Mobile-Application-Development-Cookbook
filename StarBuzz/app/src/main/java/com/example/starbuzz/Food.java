package com.example.starbuzz;

public class Food {
    private  String name;
    private  String discription;
    private  int imageResourcesId;
    public  static final Food[] foods={
            new Food("SandWitch","hello this is sandwithc",R.drawable.sandwithc),
            new Food("Burger","helloo this is good burger",R.drawable.burger),
            new Food("pizza","this is good pizza",R.drawable.image)

    };
    private Food(String name,String discription, int imageResourcesId){
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
