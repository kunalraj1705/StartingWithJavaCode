package dataStructure.LinkedList;

public class SinglyLinkedList {

    //Creating a Node
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Head and Tail Representation of Node
    public Node head = null;
    public Node tail = null;

    //Adding a Node to the Singly Linked list
    public void addNode(int d){
        //Create a new Node
        Node newNode = new Node(d);

        //Check whether the node is empty or not
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Displaying the Linked list
    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("Empty List");
            return;
        }

        System.out.println("List of Nodes");
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //Deleting the node
    public void delete(int key){
        Node temp = head, prev = null;

        //Find the node to be deleting
        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        //If key Not found
        if(temp == null){
            System.out.println("Key  Not Found");
            return;
        }

        //Breaking the link
        prev.next = temp.next;
    }

    public static void main(String[] args){
        //Adding data to the linked list
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        sll.addNode(4);

        //Displaying the List
        sll.display();

        //Deleting node and displaying list when key is present in the list
        System.out.println("Deleting node and displaying list when key is present in the list.... Key = 3");
        sll.delete(3);
        sll.display();

        //Deleting node and displaying list when key is not in the list
        System.out.println("Deleting node and displaying list when key is not in the list.... Key = 6");
        sll.delete(6);
        sll.display();
    }
}
