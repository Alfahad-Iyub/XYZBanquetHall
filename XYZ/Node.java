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
public class Node {
    
    private int value;
    private Node n;
    
    
    public void setValue(int v){
    
    value=v;
    
    }
    
    public int getValue(){
    
    return value;
    
    }
    
    public void setNode(Node nn){
    
    n=nn;
    
    }
    public Node getNode(){
    
    return n;
    
    
    }
    
    
}
