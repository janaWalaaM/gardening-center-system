/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.gardening_center;

/**
 *
 * @author janawalaa
 */
public class LinkedList {
   Node head;
   
   public void insert( String date){
       Node node= new Node();
       node.date=date;
       node.next=null;
       
       if(head==null)
       {
           head = node;
                   
       }
       else
       {
           Node n= head;
           while(n.next!=null)
           {
               n=n.next;
           }
             n.next= node;
       } 
               
       }
       
       
    public void show(){
       Node node = head;
       
       while(node.next!=null)
           {
               System.out.println(node.date);
               node= node.next;
           }
             System.out.println(node.date);
       } 
}
       
    




