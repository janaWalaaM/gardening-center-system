/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
import java.util.*;
import java.util.ArrayList;
    import java.util.Scanner;
public class Storage {
    Scanner in = new Scanner(System.in);
    private Flower flower1=new Flower("petunia",15,"white",3,"winter",1);
    private Flower flower2=new Flower("rose chinensis",34,"pink",6,"spring",2);
    private Flower flower3=new Flower("hydrangea macrophylla",23,"purple",4,"summer",3);
    private Flower flower4=new Flower("hibiscus rosa",20,"red",8,"autumn",4);
    private Flower flower5=new Flower("hemerocallis fulva",40,"orange",5,"summer",5);
    private Flower flower6=new Flower("anthurium andraeanum",48,"dark Purple",5,"all seasons",6);
    private Flower flower7=new Flower("viola tricolor",19,"yellow",6,"spring",7);
    private Flower flower8=new Flower("tulipa gesneriana",21,"grape",7,"winter",8);
    private Flower flower9=new Flower("nerium oleander",17,"pink",2,"spring",9);
    private Flower flower10=new Flower("antirrhinum majus",25,"pink",9,"winter",10);
    public Flower[] flowerList = {flower1,flower2, flower3, flower4, flower5, flower6, flower7, flower8, flower9, flower10};
    private Reviews review = new Reviews("No one reviwed this book",0);
    private Reviews[] reviewList = new Reviews[100];
    private int numberOfReviews = 0;
    private AccountsMangements account = new AccountsMangements();
    
    private int[] choices = new int[100]; 
    
    public Flower getFlower1() {
        return flower1;
   
    }

    public void setFlower1(Flower flower1) {
        this.flower1 = flower1;
     flower1.setInfo("in flower beds and pots are one of the most popular garden flowers");
    }

    public Flower getFlower2() {
        return flower2;
    }

    public void setFlower2(Flower flower2) {
        this.flower2 = flower2;
     flower2.setInfo("The single or semi-double blooms give off a lovely, light, sweet fragrance and add a touch of elegance to your yard");
    }

    public Flower getFlower3() {
        return flower3;
    }

    public void setFlower3(Flower flower3) {
        this.flower3 = flower3;
    flower3.setInfo(" Their compact, rounded habit and glossy green foliage make them a great choice for low privacy hedging");
    }

    public Flower getFlower4() {
        return flower4;
    }

    public void setFlower4(Flower flower4) {
        this.flower4 = flower4;
     flower4.setInfo(" is an annual or perennial herbaceous plant with trumpet-shaped flowers");
    }

    public Flower getFlower5() {
        return flower5;
    }

    public void setFlower5(Flower flower5) {
        this.flower5 = flower5;
     flower5.setInfo(" is an annual or perennial herbaceous plant with trumpet-shaped flowers");
    }

    public Flower getFlower6() {
        return flower6;
    }

    public void setFlower6(Flower flower6) {
        this.flower6 = flower6;
     flower6.setInfo("they can be grown outdoors in the garden in warm climates");
    }

    public Flower getFlower7() {
        return flower7;
    }

    public void setFlower7(Flower flower7) {
        this.flower7 = flower7;
     flower7.setInfo("make wonderful additions to almost any garden and are prolific bloomers from spring to fall");
    }

    public Flower getFlower8() {
        return flower8;
    }

    public void setFlower8(Flower flower8) {
        this.flower8 = flower8;
     flower8.setInfo("ncludes a huge diversity of plant and bloom size and flower forms");
    }

    public Flower getFlower9() {
        return flower9;
    }

    public void setFlower9(Flower flower9) {
        this.flower9 = flower9;
     flower9.setInfo("grows naturally as a mounded, round shrub, or it can be trained as a small single- or multi-trunked tree");
    
    }

    public Flower getFlower10() {
        return flower10;
    }

    public void setFlower10(Flower flower10) {
        this.flower10 = flower10;
    flower10.setInfo("very popular short-lived garden perennials that are usually grown as annuals. They are a mainstay of classic flower gardens, with infinite uses");
    }
  
   
    public void displayRecommandedFlower(){
        for(int i =0;i<getFlowerList().length;i++){
            int j = i+1;
            System.out.println(j+"- "+getFlowerList()[i].getName());
        }
    }
    public void choseOption(Flower flower,boolean check,UserAccount user){
        int option = 0;
        for(int i = 0; i< reviewList.length;i++){
            reviewList[i] = new Reviews();
        }
        for(int j=0;;j++){
        System.out.println("1- Information about flowers"+"\n"+"2- Rate and Write a review"+"\n"+
        "3- display reviews"+"\n"+"4- add to shop cart"+"\n"+"5- add to wishlist"+"\n"+"6- Quite");
        option = in.nextInt();
        
        switch (option){
            case 1:
                System.out.println(flower.getInfo());
                break;
            case 2:
                if(check == true){
                    System.out.println("Review text: ");
                    String write = in.next();
                    review.setReview(write);
                    for(int i =1;;i++){
                       System.out.println("Rating from 5: ");
                       int rate = in.nextInt();
                       if(rate <=5){      
                            review.setRating(rate);
                            System.out.println("Your review is added");
                            reviewList[numberOfReviews]= review;
                            numberOfReviews ++;
                            break;
                   }
                        else{
                            System.out.println("Please enter correct rate");
                   }
                }
                 
                }
                else{
                   System.out.println("You should log or sign in"); 
                }
                break;
            case 3:
                 for(int i =0;i<reviewList.length;i++){
                    if(reviewList[i].getReview() != null){
                        System.out.println(numberOfReviews+" reviews");
                        System.out.println(reviewList[i].toString());
                       
                   
                    }
                    else{
                        
                    }
                }
                break;
            case 4:
             if(check == true){   
                for(int i = 0;i<flowerList.length;i++){
                    if( flowerList[i] == flower){
                        ShoppingCart cart = new ShoppingCart(flowerList[i].getName(),flowerList[i].getPrice(),flowerList[i].getColor()
                            ,flowerList[i].getPeriod(),flowerList[i].getSeason(),flowerList[i].getProductnum());
                            flowerList[i] = cart;
                        user.addToShopCart(cart);
                        System.out.println("Added to your cart");
                        break;
                    }
               }
             }
			    break;
            case 5:
                if(check == true){
                    for(int i = 0;i<flowerList.length;i++){
                        if(flowerList[i] == flower){
                            Wishlist wish = new Wishlist(flowerList[i].getName(),flowerList[i].getPrice(),flowerList[i].getColor()
                            ,flowerList[i].getPeriod(),flowerList[i].getSeason(),flowerList[i].getProductnum());
                            flowerList[i] = wish;
                            user.addToWishList(wish);
                            System.out.println("Added to your wishlist");
                            break;
                    }
               }
                }
            break;  
        }
        if(option == 6)
            break;
    }
    }

    public Flower[] getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(Flower[] flowerList) {
        this.flowerList = flowerList;
    }
    

public void sbyname(String name){
 String r=" m";
    for (int i=0;i<flowerList.length;i++){
   
        if (name .equals(flowerList[i].getName())){
        
   System.out.println(flowerList[i].toString());
    
    }
//        else{System.out.println("NOT FOUND");}
//    
//    
//    }
  
}

}


public void sbycolor(String color){
 
    for (int i=0;i<flowerList.length;i++){
   
        if (color.equals(flowerList[i].getColor())){
        
   System.out.println(flowerList[i].toString());
    
    }
    
    
    
    }
    
}
public void sbynum(int num){
 
    for (int i=0;i<flowerList.length;i++){
   
        if (num==flowerList[i].getPeriod() ){
        
   System.out.println(flowerList[i].toString());
    
    }
    
    
    
    }
 
    
    
    
    
    
}


}





 




