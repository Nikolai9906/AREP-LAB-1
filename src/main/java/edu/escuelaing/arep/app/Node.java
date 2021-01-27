package edu.escuelaing.arep.app;

public class Node {

    Object value;
    Node next;

    public Node(Object value){

        this.value = value;
        this.next = null;
    }

    public Object getValue(){ return value;}

    public void linkNext(Node nextNode){
        next = nextNode;
    }

    public Node getNext(){
        return next;
    }
}
