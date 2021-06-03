/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XYZ;

import java.util.*;

public class LinkedListImplementation {

    public static void main(String[] args) {
       
       System.out.println("**************************************************");
       System.out.println("**************************************************");
       System.out.println("************** WELCOME TO XYZ HOTEL **************");
       System.out.println("**************************************************");
       System.out.println("**************************************************");
        
        Scanner input=new Scanner(System.in); 
       
        LinkedList ll=new LinkedList();
        
        System.out.println("Search Banquet Halls");
           
        String locationSearch;
        System.out.println("Enter Location :");
        locationSearch = input.nextLine();
        System.out.println("Enter Date :");
        locationSearch = input.nextLine();
        System.out.println("Enter Number of guests :");
        locationSearch = input.nextLine();

        for(int i = 0; i < ll.getLinkedListSize(); i++){
            Reservation rsMain = (Reservation)ll.getElement(i);
            if(rsMain.location.equals(locationSearch)){
               System.out.println("This hall is not avaialable !!!");
               }
            else{
               System.out.println("This hall is available");
            }
        }
        
        System.out.println("This hall is available");
            
        int x=1;
        while(true){
            System.out.println("Need to place a reservation? (Y/N)");
            String ans=input.next();
            if(ans.equals("n")){
                break;
            }

            Reservation p=new Reservation();

            System.out.println("Enter the location:");
            p.setLocation("The location is "+input.next());

            System.out.println("Enter the date:");
            p.setDate("The date is "+input.next());

            System.out.println("With Food/Meals (Y/N) :");
            p.setFood("With food? "+input.next());

            System.out.println("Number of guests :");
            p.setGuests("The number of guests is "+input.next());

            ll.AddElement(p);
            System.out.println("Reservation Successfull! Ypur reservation id is "+p.getCustomerID());
            int k=1;
            while(k<=ll.getLinkedListSize()){
            break;
            }
        }
       
        System.out.println("Cancel a reservation? (Y/N)");
        String res=input.next();
        if(res.equals("y")){
            System.out.println("Enter reservation ID");
            int id=input.nextInt();
            ll.DeleteElement(id);
        }

        System.out.println("Change a reservation? (Y/N)");
        String ch=input.next();
        if(ch.equals("y")){
            System.out.println("Enter reservation ID :");
            int id=input.nextInt();

            System.out.println("Enter the fields (Location, Date, Food, Num of Guests) :");
            String field=input.next();

            System.out.println("Enter the value :");
            String val=input.next();

            ll.EditElement(id, field, val);
        }
    } 
}
