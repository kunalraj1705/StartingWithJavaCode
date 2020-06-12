package dataStructure.LinkedList;

/**
 * * @author Kunal Raj Bhardwaj
 */

public class CircularLinkedList {

    //Node Creation
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    //Default insert method where the elements will be added at the end
    public void insert(int data){

        //Creating a new node to be added
        Node newNode = new Node(data);

        //Check whether the first node is empty of not
        if(head == null){

            //If empty then enter the value in the first node
            head = newNode;
            tail = newNode;
        }else {
            //Set the link between the current node and the new Node
            tail.next = newNode;

            //Make the new node as tail
            tail = newNode;

            //Link the end node to the first node
            tail.next = head;
        }
    }

    public void display(){

        //Make a temp node to iterate through the list
        Node current = head;

        //Check for the empty list
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        System.out.println("List of Nodes :");
        //Iterate through the list till the iterator reaches the head
        do {
            System.out.print(current.data + " ");
            current = current.next;
        }while (current != head);

        System.out.println();
    }

    public void delete(int dataToDelete){
        //Create a node to iterate through the list
        Node current = head;

        //If list is not empty then iterate through the list to find the value to be deleted
        if(head != null){

            //if the first node has the value to be deleted
            if(current.data == dataToDelete){
                head = head.next;
                tail.next =head;
            }else {
                //if the data is present deep inside the list
                do{
                    Node newNode = current.next;
                    if(newNode.data == dataToDelete){
                        current.next = newNode.next;
                        break;
                    }
                    current = current.next;
                }while (current != head);
            }
        }
    }

    //To insert the data at the starting of the list
    public void insertBegining(int data){
        //Create a new node to be inserted
        Node newNode = new Node(data);

        //Link the new node to the current head
        newNode.next = head;

        //Make the new node as head
        head = newNode;

        //Link the last node to the new head
        tail.next = head;
    }

    public static void main(String[] args){
        CircularLinkedList cll = new CircularLinkedList();

        //Create node and insert data to it
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);

        //Display the list
        cll.display();

        //Delete a data from the list and print
        cll.delete(4);
        cll.display();

        cll.insertBegining(4);
        cll.display();
    }
}
