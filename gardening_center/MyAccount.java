/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
public interface MyAccount {
public void LogIn(UserAccount username,boolean check,Storage flower);
     public void LogOut(UserAccount user);
     public void profile(UserAccount user, Storage books,boolean flower);    
}
