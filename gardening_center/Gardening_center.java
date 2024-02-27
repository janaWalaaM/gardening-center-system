/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package in.gardening_center;

/**
 *
 * @author janawalaa
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class Gardening_center {

      public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
         BinaryTreeS tree = new BinaryTreeS();
        BinaryTreeS tree2 = new BinaryTreeS();
        HashMap<Integer, Flower> hm = new HashMap<Integer, Flower>();
        Storage s = new Storage();
        tree2.addNode(s.getFlower1());
        tree2.addNode(s.getFlower2());
        tree2.addNode(s.getFlower3());
        tree2.addNode(s.getFlower4());
        tree2.addNode(s.getFlower5());
        tree2.addNode(s.getFlower6());
        tree2.addNode(s.getFlower7());
        tree2.addNode(s.getFlower8());
        tree2.addNode(s.getFlower9());
        tree2.addNode(s.getFlower10());
     
     Storage flowers = new Storage();
    
        flowers.setFlower1(flowers.getFlower1());
        flowers.setFlower2(flowers.getFlower2());
        flowers.setFlower3(flowers.getFlower3());
        flowers.setFlower4(flowers.getFlower4());
        flowers.setFlower5(flowers.getFlower5());
        flowers.setFlower6(flowers.getFlower6());
        flowers.setFlower7(flowers.getFlower7());
        flowers.setFlower8(flowers.getFlower8());          
        flowers.setFlower9(flowers.getFlower9());      
        flowers.setFlower10(flowers.getFlower10());      
        AccountsMangements account = new AccountsMangements();
        String name =null;
        String email = null;
        String password = null;
        
        UserAccount user = new UserAccount(name,email,password);
      
        int option = 0;
        boolean check = false;
        boolean check2 = false;
        
     
     
       for(int i=0;;i++){  
        System.out.println("1- Recommanded flowers "+"\n"+"2- search for flowers"+"\n3- search by range\n"
        +"4- myAccount"+"\n"+"5- Quite");
         option = in.nextInt();
        switch (option){
         
            case 1:
             flowers.displayRecommandedFlower();
               System.out.println("Enter the option number of Flower that you want: ");
               option = in.nextInt();
               check = account.accountChecker(user);
        switch(option){
                    case 1:
                    System.out.println(flowers.getFlower1());
                    flowers.choseOption(flowers.getFlower1(), check, user);
                    break;
                    case 2:
                    System.out.println(flowers.getFlower2());
                    flowers.choseOption(flowers.getFlower2(), check, user);
                    break;
                    case 3:
                    System.out.println(flowers.getFlower3());
                    flowers.choseOption(flowers.getFlower3(), check, user);
                    break;
             
               
                 case 4:
                    System.out.println(flowers.getFlower4());
                    flowers.choseOption(flowers.getFlower4(), check, user);
                    break;
               
               
               
                 case 5:
                    System.out.println(flowers.getFlower5());
                   flowers.choseOption(flowers.getFlower5(), check, user);
                    break;
               
               
               
                 case 6:
                    System.out.println(flowers.getFlower6());
                    flowers.choseOption(flowers.getFlower6(), check, user);
                    break;
               
               
                case 7:
                    System.out.println(flowers.getFlower7());
                   flowers.choseOption(flowers.getFlower7(), check, user);
                    break;
               
                case 8:
                    System.out.println(flowers.getFlower8());
                    flowers.choseOption(flowers.getFlower8(), check, user);
                    break;
               
               
                case 9:
                    System.out.println(flowers.getFlower9());
                    flowers.choseOption(flowers.getFlower9(), check, user);
                    break;
               
               case 10:
                    System.out.println(flowers.getFlower10());
                   flowers.choseOption(flowers.getFlower10(), check, user);
                    break;
               
               }
               
               break;
            
                
               
              
                case 2:
               
       for(int j=0;;i++){  
        System.out.println("\n"+"1- search for flowers"+"\n"+
        "\n"+"3- Quite");
                    System.out.println("Filter option : ");
                  option = in.nextInt();
                   switch(option){
                    
                       case 1:
                       for(int e=0;;i++){
                           System.out.println("Search by: "+"\n"+"1- name "+"\n"+"2- color\n3-price\n4- Quite\"");
                option = in.nextInt();
                switch(option){
                    case 1:
                        System.out.println("name of flower: ");
                        String  flname = in.nextLine();
                        flname = in.next();
                      flowers.sbyname(flname);
                        break;
                    case 2:
                        System.out.println("color of flower: ");
                      String    color = in.nextLine();
                          color = in.next();
                       flowers.sbycolor(color);
                        break;
                    case 3:
                
                 System.out.println("Period  of flower: ");
                     int  num = in.nextInt();
                       
                       flowers.sbynum(num);
                break;
               
                
                
                
                }
                   if(option ==4){
            break;      
                   }
                       }
                      
                       
                       
                       
                       case 2:
                       
                       break;
                   
                   
                   
                   
                   }
        break;
       }
                       
                  break;
                    case 3:
                    check = account.accountChecker(user);    
                    System.out.println("Enter the minimum price: ");
                    double minPrice = in.nextDouble();
                    System.out.println("Enter the maximum price: ");
                    double maxPrice = in.nextDouble();
                    ArrayList<Flower> flowersInRange = tree2.getFlowersInRange(minPrice, maxPrice);
                    if (flowersInRange.size() > 0) {
                        System.out.println("Flowers in price range $" + minPrice + " - $" + maxPrice + ":");
                    for (int j = 0; j < flowersInRange.size(); j++) {
                         System.out.println((j+1) + ". " + flowersInRange.get(j));
                    }
                    System.out.println("Enter the index of the flower you want to select: ");
                    int index = in.nextInt();
                    in.nextLine();
                    if (index >= 1 && index <= flowersInRange.size()) {
                        Flower selectedFlower = flowersInRange.get(index-1);
                        System.out.println(selectedFlower);
                        s.choseOption(selectedFlower, check, user);
                    } else {
                          System.out.println("Invalid index");
                    }
                    } else {
                        System.out.println("No flowers found in price range $" + minPrice + " - $" + maxPrice);
                     }
                    break;
                     
            
                
                case 4:
                check = account.accountChecker(user);
                check2 = account.accountChecker2(user);
                if(check == false){
                    System.out.println("Enter your name:");
                    name = in.next();
                    System.out.println("Enter your email: ");
                    email = in.next();
                    System.out.println("Make a new password: ");
                    password = in.next();
                    user.setName(name);
                    user.setPassword(password);
                    user.setEmail(email);
                    account.signIn(user,check, check2);
                    if(check2 == true){
                        account.LogIn(user, check, flowers);
                    }
                }
                else{
                    account.profile(user,flowers,check);
                }
                break;
        
            
                 
            
                
        }
        if(option ==5){
            break;
        }
        
        
        
       }
       }
    }
        
    

