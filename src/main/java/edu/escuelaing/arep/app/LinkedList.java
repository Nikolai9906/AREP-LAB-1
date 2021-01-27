package edu.escuelaing.arep.app;

public class LinkedList {

    Node head;
    int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public void addFirst(Object obj){
        if(head == null){
            head = new Node(obj);
        }else{
            Node tem = head;
            Node newNode = new Node(obj);
            newNode.linkNext(tem);
            head = newNode;
        }
        size = size + 1;
    }
    public void deleteFirst(){
        head = head.getNext();
        size = size - 1;
    }

    public void deleteNode(int index){
        int count = 0;
        Node temp = head;
        if( index == 0){
            head = head.getNext();
        }else{
            while (count < index-1){
                temp = temp.getNext();
                count = count + 1;
            }
            temp.linkNext(temp.getNext().getNext());
        }
        size = size - 1;
    }

    public void cut(int index){
        int count = 0;
        Node temp = head;
        while (count < index - 1){
            temp = temp.getNext();
            count = count +1;
        }
        temp.linkNext(null);
        size = index;
    }

    public boolean isEmpty(){
        return (head == null)?true:false;
    }

    public Object getNodeValue(int index){
        int count = 0;
        Node temp = head;
        while (count < index){
            temp = temp.getNext();
            count = count + 1;
        }
        return temp.getValue();

    }

    public int getSize(){
        return size;
    }


}
