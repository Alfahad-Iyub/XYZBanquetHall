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
public class Reservation {

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String location;
    public String date;
    private String food;
    public String numOfGuests;
    private int customerID;
    private static int idCounter = 1000;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getGuests() {
        return numOfGuests;
    }

    public void setGuests(String numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public Reservation getNextReservation() {
        return nextReservation;
    }

    public void setNextReservation(Reservation nextReservation) {
        this.nextReservation = nextReservation;
    }
    
    private Reservation nextReservation;
    
    
    public void setDate(String d){
    
    date=d;
    
    }
    
    public String getDate(){
    
    
    return date;
    
    }
    
    public void setCustomerID(int customerID) {
    customerID = idCounter++;
    }

    public int getCustomerID() {
    return customerID;
    }
    
}
