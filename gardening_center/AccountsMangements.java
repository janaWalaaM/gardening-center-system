/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author janawalaa
 */
public class AccountsMangements implements NewAccount, MyAccount {
     
    
    Scanner in = new Scanner(System.in);
    private UserAccount[] accountList = new UserAccount[100];
    private ArrayList<UserAccount> list= new ArrayList<UserAccount>();
    private int numberOfAccount;
    private ArrayList<UserAccount> listClone = new ArrayList<UserAccount>();
    private LocalDateTime time ;

    public AccountsMangements() {
        

    }

    public ArrayList<UserAccount> getList() {
        return list;
    }

    public void setList(ArrayList<UserAccount> list) {
        this.list = list;
    }
    
    
    
    @Override
    public void signIn(UserAccount user, boolean check, boolean check2) {
        for(int i =0;i<listClone.size();i++){
            
            if(check2 == true){
            break;
            }
        }
        
        if(check == false && check2 == false){
            list.add(user);
            System.out.println("You've made a new account");
            numberOfAccount ++;
        }
        }
    
    @Override
    public void LogIn(UserAccount user,boolean check,Storage flower){
         

         for(int i =0;i<listClone.size();i++){
            if(listClone.get(i) == user){
                list.add(user);
                System.out.println("you've logged succefully");
                break;
            }
            System.out.println("The password or username may be wrong, try again!");
        }
}

    @Override
    public void profile(UserAccount user,Storage flowers,boolean check) {
        outer:for(int i =0;i<list.size();i++){
            if(user == list.get(i)){
              for(i=0;;i++){  
                System.out.println(user.toString());
                System.out.println("Choose option: "+"\n"+"1- My wishlist"+"\n"+"2- Shop cart"+"\n"+
                "3- Log out"+"\n"+"4- Quite");
                int option = in.nextInt();
                switch(option){
                    case 1:
                       displaywishlist(user);
                       Flower [] flower = flowers.getFlowerList();
                       
                       if(user.getWishList() != null){
                        for(i = 0;i<flower.length;i++){   
                            if( flower[i] instanceof Wishlist){
                                 flowers.choseOption( flower[i], check, user);
                            }
                        } 
                        
                       }
                       break;
                    case 2:
                      displayCartList(user);
                     Flower [] flower2 =  flowers.getFlowerList();

           if(user.getCartList()  != null){
            for(i = 0;i<flower2.length;i++){   
                if(flower2[i] instanceof ShoppingCart ){


                    System.out.println("Choose option:\n1- Continue the shopping process\n2- Checkout ");

                    option = in.nextInt();

                     switch (option){

                         case 1 :
                         break ;

                         case 2:
                         double x=0;
                             for(i = 0;i<flower2.length;i++){  
                               if(flower2[i] instanceof ShoppingCart )  
                                 x += flower2[i].getPrice();


                         }
                             System.out.println("Total price :"+x);

                             System.out.println("Choose the payment method\n1- Visa \n2- PayPal ");


                        option = in.nextInt();
                        
                          switch (option){

                   case 1:
                        Visa v1=new Visa();
                        System.out.println("enter card number");
                        long cardnumber  = in.nextInt();  
                        v1. cardNumber(cardnumber);
                        System.out.println("enter the Expiration Date");
                       System.out.println("day");
                        int d = in.nextInt();
                        System.out.println("month");
                        int m= in.nextInt();     
                         System.out.println("year");
                        int y= in.nextInt(); 

                        Date d1 =new Date(d,m,y);
                        v1.expirationDate(d1);
                        System.out.println("enter the CVC");      
                        int cvc = in.nextInt();  
                        v1.CVC(cvc);
                        time  = LocalDateTime.now();
                        break;


                    case 2 :
                        PayPal v2=new PayPal();
                        System.out.println("enter card number");
                        long cardnumberp  = in.nextInt();  
                        v2. cardNumber(cardnumberp);
                        System.out.println("enter the Expiration Date");
                         System.out.println("day");
                        int d11 = in.nextInt()  ;
                        System.out.println("month");
                        int m11= in.nextInt();   
                         System.out.println("year");
                        int y11= in.nextInt(); 

                        Date d2 =new Date(d11,m11,y11);
                        v2.expirationDate(d2);
                        System.out.println("enter the CVC");      
                        int cvcS = in.nextInt();  
                        v2.CVC(cvcS);  
                        time  = LocalDateTime.now();
                        break ;
                              
                        }
                          
                         System.out.println("Choose option:\n1- Quite \n2- display your bill \n 3- Cards");
             
                                option = in.nextInt();
                        
                        switch(option){
                       
                            case 1:
                         
                               break ;  
                               
                            case 2:
                            System.out.println("you order");
                          
                           for(i = 0;i<flower2.length;i++){  
                           
                           if(flower2[i] instanceof ShoppingCart ) {
                           System.out.println("\t"+flower2[i].getName() +": $"+flower2[i].getPrice());
                           
                            }
                             
                            }

                       System.out.println(  "    ----------------------------------------");
                             
                            System.out.println("\tTotal price :$"+x);
                                
                               System.out.println("\tyou ordered in " + time+"\n\n");
                               
                               break;
                               
                case 3://aa
                    Cards car1=new Cards("large","white ",11);
                    Cards car2=new Cards("small","black",14);
                    Cards car3=new Cards("large","golden",16);
                    Cards car4=new Cards("middle","brown",18);
                    Cards car5=new Cards("large","red",11);
                    LinkedList Card = new LinkedList(); // LinkedList
                    
                    System.out.println("select the card type\n");
            Card.insert("1-Invitation Card");
            Card.insert("2-greeting card");
            Card.insert("3-graduation card");
            Card.insert("4-apology card");
            Card.insert("5-blank cards");
            Card.show();   
            
           int option1 = in.nextInt();
                switch(option1){
                    case 1:
                    System.out.println(car1.toString());
                    hashing();
                    break;
                    case 2:
                    System.out.println(car2.toString());
                    hashing();
                    break;
                    
                    case 3:
                    System.out.println(car3.toString());
                hashing();
                    break;
             
               
                 case 4:
                    System.out.println(car4.toString());
                   hashing();
                    break;
               
               
               
                 case 5:
                    System.out.println(car5.toString());
                 hashing();
                    break;
              
    }

}
              
          }  
                                
                        
                        }
            }
                        break;
                    
                
               
         
      }   
   
     break ;
                    case 3:
                        LogOut(user);
                        break;
                }
                if(option == 4 || option == 3){
                    break outer;
                }
            }
        }
        }
    
    }
    
    public boolean accountChecker(UserAccount user){
        if(list.contains(user)){
            return true;
        }
        return false;
    }
    
    public void displaywishlist(UserAccount user){
    for(int i =0;i<list.size();i++){
        if(user == list.get(i)){
            System.out.println(user.getWishList());
                
      }
      }
    
   }
   
    public void displayCartList(UserAccount user){
      for(int i =0;i<list.size();i++){
        if(user == list.get(i)){
            System.out.println(user.getCartList());
    
      }
      }
    
   }
    public boolean accountChecker2(UserAccount user){
        if(listClone.contains(user)){
            return true;
        }
        return false;
    }
    
    @Override
    public void LogOut(UserAccount user){
        for(int i =0;i<list.size();i++){
            if(user == list.get(i)){
                listClone.add(user);
                UserAccount u = null;
                list.set(i, u);
                break;
            }
        }
    }

    
   public void hashing(){
    
    
                     
                 HashMap<Integer, String> hm = new HashMap<Integer, String>();
        int ch = 0;
     
	
		//-------------------------------
		
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
        
        
        
        while (ch != 5) {
            System.out.println("1. Insert elements ( key ⇒ integer, value⇒string)\n"
                    + "2. Update existing element\n"
                    + "3. Delete an element\n"
                    + "4. Print elements using iterator\n"
                    + "5. Exit");
            ch = in.nextInt();
            switch(ch)
            {
                case 1:
                     System.out.println("1. ENter Key ");
                     int key=in.nextInt();
                     System.out.println("1. ENter Value ");
                     String val=in.next();
                     hm.put(key, val);
                    break;
                    
                case 2:
                     System.out.println("1. ENter Key ");
                     int key1=in.nextInt();
                     System.out.println("1. ENter Value ");
                     String val1=in.next();
                     if(hm.containsKey(key1))
                                hm.put(key1, val1);
                     else
                     {
                          System.out.println(" Key not found ");
                     }
                    break;
                case 3:
                     System.out.println("1. ENter Key ");
                     int key2=in.nextInt();
                     hm.remove(key2);
                    break;
                case 4:
                    Iterator it = hm.entrySet().iterator();
                    while(it.hasNext())
                    {
                        Map.Entry en=(Map.Entry)it.next();
            
                       System.out.println(en.getKey()+"==>"+
                               en.getValue()
                               );
                    }
                    break;
            }
        }
    
    
    
    
    
   }
    
    
    
    
    }

