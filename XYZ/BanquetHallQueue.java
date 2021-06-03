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
public class BanquetHallQueue {
    private int maxSize;
    private int rear; //back of the queue
    private int front; //front of the queue
    private BanquetHall[] queueArray;
    private int items; //no. of items
    
    public void QueueEx(int s){
        maxSize = s;
        queueArray = new BanquetHall[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }
    
    //add element into the queue
    public void enQueue(BanquetHall element){
        try{
            if(!isFull()){
                rear++;
                queueArray[rear] = element;
                items++;
            }
            else{
                System.out.println("Queue is full");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    //remove element from the queue
    public BanquetHall deQueue(){
        BanquetHall data = queueArray[front];
        data.showBanquetHall();
        front = front + 1;
        
        return data;
    }
    
    public void show(){
        for(int i = 0; i < items; i++){
            BanquetHall c = queueArray[i];
            c.showBanquetHall(i);
        }
    }
    
    //access front element of the queue
    public void peekFront(){
        BanquetHall font = queueArray[front];
        font.showBanquetHall();
    }
    
    //check if the queue is full
    public boolean isFull(){
        if(rear == maxSize - 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    //check if the queue is empty
    public boolean isEmpty(){
        if(front == - 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    void QueueEx(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
