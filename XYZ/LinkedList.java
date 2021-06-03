/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XYZ;

/**
 *
 * @author ESOFT
 */
public class LinkedList {
    
    private Reservation head;
    private int size=0;
    
    public LinkedList(){
    
    head=new Reservation();
    
    }
    
    public Reservation  getElement(int pos){
    
    Reservation el=null;
    
    el=head.getNextReservation();
    
    if(pos>1){
    
    for(int p=2;p<=pos;p=p+1){
    
    el=el.getNextReservation();
    
    
    }
    }
    
    return el;
    
    }
    
    
    
    public void AddElement(Reservation p){
    
    Reservation n=new Reservation();
    n.setLocation(p.getLocation());
    n.setDate(p.getDate());
    n.setFood(p.getFood());
    n.setGuests(p.getGuests());
    
    if(size==0){
    
    head.setNextReservation(n);
    
    
    }
    else{
    
    getElement(size).setNextReservation(n);
    
    
    }
    
    size=size+1;
    
    }
    
    
    public void DeleteElement(int pos){
    
    Reservation p1=getElement(pos-1);
    
    Reservation p2=getElement(pos+1);
    
    p1.setNextReservation(p2);
    
     size=size-1;
    
    
    }
    
    
    public void EditElement(int pos,String feild,String value){
    
    Reservation p=getElement(pos);
    
    if(feild.equalsIgnoreCase("location")){
    
    p.setLocation(value);
    
    
    }
    else if(feild.equalsIgnoreCase("date")){
    
    p.setDate(value);
    
    }
    else if(feild.equalsIgnoreCase("food")){
    
    p.setFood(value);
    
    }
    else if(feild.equalsIgnoreCase("numOfGuests")){
    
    
    p.setGuests(value);
    
    
    }
    
    }
    
    
    public int getLinkedListSize(){
    
    return size;
    
    }
    
    
    
}
