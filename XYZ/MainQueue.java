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
public class MainQueue {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Arshad Riyal", "010101010101", "Beruwala", 0717171717);
        Customer customer2 = new Customer("Irfan Khalid", "020202020202", "Maradana", 0727272727);
        Customer customer3 = new Customer("Abdul Haq", "030303030303", "Nawalapaitiya", 0737373737);
        Customer customer4 = new Customer("Alyasha Iqbal", "040404040404", "Dematagoda", 0747474747);
        Customer customer5 = new Customer("Ruzzaik Ibrahim", "050505050505", "Dehiwala", 0757575757);
        
        CustomerQueue queue1 = new CustomerQueue();
        queue1.QueueEx(5);
        
        queue1.enQueue(customer1);
        queue1.enQueue(customer2);
        queue1.enQueue(customer3);
        queue1.enQueue(customer4);
        queue1.enQueue(customer5);
        
        BanquetHall hall1 = new BanquetHall("H01", "Movenpick", "Kollupitiya", "250 PAX", "2500", "3000", "3500");
        BanquetHall hall2 = new BanquetHall("H02", "Avenra", "Negambo", "300 PAX", "3000", "3500", "4000");
        BanquetHall hall3 = new BanquetHall("H03", "Marine Grand", "Marine Drive", "350 PAX", "3500", "4000", "4500");
        BanquetHall hall4 = new BanquetHall("H04", "Rosewood Ceylon", "Dehiwala", "400 PAX", "4000", "4500", "5000");
        BanquetHall hall5 = new BanquetHall("H05", "Eagles Lakeside", "Attidiya", "450 PAX", "4500", "5000", "5500");
        
        BanquetHallQueue queue2 = new BanquetHallQueue();
        queue2.QueueEx(5);
        
        queue2.enQueue(hall1);
        queue2.enQueue(hall2);
        queue2.enQueue(hall3);
        queue2.enQueue(hall4);
        queue2.enQueue(hall5);
        
        System.out.println("\n---------- All Customers ----------");
        queue1.show();
        
        System.out.println("\n---------- All Banquet Halls ----------");
        queue2.show();
        
        System.out.println("\n---------- Peek Front ----------");
        queue1.peekFront();
        queue2.peekFront();
        
        System.out.println("\n---------- Dequeue Operation ----------");
        queue1.deQueue();
        
        System.out.println("\n---------- Peek front after dequeue ----------");
        queue1.peekFront();
        
        System.out.println("\n---------- All values after dequeu ----------");
        queue1.show();
    }
}
