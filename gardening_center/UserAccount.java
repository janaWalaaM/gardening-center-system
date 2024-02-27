/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

import java.util.ArrayList;

/**
 *
 * @author janawalaa
 */

public class UserAccount implements NewAccount, MyAccount {

    private String name;
    private String email;
    private  String password;
    private ArrayList<Wishlist> wishList = new ArrayList<Wishlist>();
    private ArrayList<ShoppingCart> cartList = new ArrayList<ShoppingCart>();

    public UserAccount() {
    }

    public UserAccount(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
    public void addToShopCart(ShoppingCart cart){
        cartList.add(cart);
    }

    public void addToWishList(Wishlist wish){
        wishList.add(wish);
    }

    public ArrayList<Wishlist> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Wishlist> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<ShoppingCart> getCartList() {
        return cartList;
    }

    public void setCartList(ArrayList<ShoppingCart> cartList) {
        this.cartList = cartList;
    }

    
    
    
    @Override
    public String toString() {
        return "UserAccount{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }

    @Override
    public void signIn(UserAccount user, boolean check, boolean check2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LogIn(UserAccount username, boolean check, Storage flower) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LogOut(UserAccount user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void profile(UserAccount user, Storage books, boolean flower) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    }

    
    

   

