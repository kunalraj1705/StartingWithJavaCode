package dataStructure.LinkedList;

/**
 * * @author Kunal Raj Bhardwaj
 */

public class DoublyLinkedList {

    //Node Creation
    class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data = data;
        }
    }

    //Head and Tail representation of Node
    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        //If list is empty
        if(head == null){
            head =newNode;
            tail = newNode;
            tail.next = null;
            head.previous = null;
        }else {
            //New Node will be added after tail where tails next will point to new node
            tail.next = newNode;

            //New Nodes previous will point to the tail
            newNode.previous = tail;

            //new Node will become new tail
            tail = newNode;

            //tails next will be null as this is the last element
            tail.next = null;
        }
    }

    public void display(){
        Node temp = head;

        while (temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);

        System.out.println("List of nodes are :");
        dll.display();
    }
}
