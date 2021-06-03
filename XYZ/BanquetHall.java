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
public class BanquetHall {
    public String id, name, location, pax, menu1, menu2, menu3;
    
    BanquetHall(String id, String name, String location, String pax, String menu1, String menu2, String menu3){
        this.id = id;
        this.name = name;
        this.location = location;
        this.pax = pax;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
    }
    
    public void showBanquetHall(int i){
        System.out.println(i+ " " +this.id+ " " +this.name+ " " +this.location+ " " +this.pax+ " " +this.menu1+ " " +this.menu2+ " " +this.menu3);
    }
    
    public void showBanquetHall(){
        System.out.println(this.id+ " " +this.name+ " " +this.location+ " " +this.pax+ " " +this.menu1+ " " +this.menu2+ " " +this.menu3);
    }
}
