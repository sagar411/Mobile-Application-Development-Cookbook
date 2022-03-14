package com.example.listviewandadapter;

public class Drink {
    private  String name;
    private  String discription;
    private  int imageResourcesId;

    public  static final Drink[] drinks ={
    new Drink("Latte","hello this is good latte",R.drawable.latt),
    new Drink("Coffee","helloo this is good cofee",R.drawable.coffe),
    new Drink("Cappuccino","this is good ",R.drawable.image)

    };
private Drink(String name,String discription, int imageResourcesId){
        this.name= name;
        this.discription =discription;
        this.imageResourcesId =imageResourcesId;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getImageResourcesId() {
        return imageResourcesId;
    }

    public void setImageResourcesId(int imageResourcesId) {
        this.imageResourcesId = imageResourcesId;
    }

}
