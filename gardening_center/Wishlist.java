/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
class Wishlist  extends Flower{

    private int numberOfflower;

    public Wishlist(){
        numberOfflower ++;
    }

    public Wishlist(String name,int price,String color,int period,String season,int num) {
        super(name,price,color,period,season,num);
        numberOfflower ++;
    }
       

 }
