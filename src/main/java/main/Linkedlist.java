/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import main.Linkedlist;
/**
 *
 * @author uyanda
 */
public class Linkedlist {
    Linkedlist(int data){
        node = new Node(data);
    }
    
    void printList(){
        Node current = this.node;
        
        while(current != null){
            System.out.printf("%d ", current.data);
            current = current.next;
        }
        System.out.println("");
    }
    
    void addNode(int data){
        Node newNode = new Node(data);
        Node current = this.node;
        
        while(current.next != null){
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    private Node node;
}
