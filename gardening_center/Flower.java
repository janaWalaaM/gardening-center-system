/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
public class Flower {

   
 
private String name;
private int price;
private String color;
private int period;
private String season;
private String info;
private int productnum;
public Flower(){};

public Flower(String name,int price,String color,int period,String season,int productnum){
this.name=name;
this.price=price;
this.color=color;
this.period=period;
this.season=season;
this. productnum=productnum;


}
 
public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

     public int getProductnum() {
        return productnum;
    }

    public void setProductnum(int productnum) {
        this.productnum = productnum;
    }




public  String toString(){
return "name: "+name+" \nPrice: "+price+" \ncolor: "+color+" \nperiod: "+period+" \nSeason"+season+" \nProduct number: "+productnum+"\n";
}
}
   