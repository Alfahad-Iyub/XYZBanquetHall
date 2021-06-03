/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XYZ;

/**
 *
 * @author Fahad_PC
 */
public class Customer {
    private String name, nic, address;
    private int contact;
    
    Customer(String name, String nic, String address, int contact){
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.contact = contact;
    }
    
    public void showCustomer(int i){
        System.out.println(i+ " " +this.name+ " " +this.nic+ " " +this.address+ " " +this.contact);
    }
    
    public void showCustomer(){
        System.out.println(this.name+ " " +this.nic+ " " +this.address+ " " +this.contact);
    }
}
