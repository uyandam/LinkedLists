/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author uyanda
 */
public class Program {
    public static void main(String [] args){
        System.out.println("Hello World!");
        int data = 5;
        Linkedlist obj = new Linkedlist(data);
        obj.printList();
        
        data = 8;
        obj.addNode(data);
        obj.printList();
        
        data = 9;
        obj.addNode(data);
        
        obj.printList();
        
        data = 8;
        
        obj.removeNode(data);
        
        data = 9;
        obj.removeNode(9);
        
        obj.printList();
    }
}
