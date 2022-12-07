import java.io.*;

public class DoublyLinkedList {
    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;
    public void addNodeAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else 
            {
            head.previous=newNode;
            newNode.next=head;
            head=newNode;
            head.previous=null;
        }
    }
    public void addNodeAtIndex(int data,int index) {
        Node newNode = new Node(data);
        Node current=head;
         for (int i = 0; i < index; i++) {
              current = current.next;
          }
         newNode.previous = current.previous;
         newNode.next = current;
         current.previous.next = newNode;
         current.previous = newNode;
}
    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else 
            {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\n");

    }

    public void delete(int data) {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            if (current.data == data)
                break;
            current = current.next;
        }
        if (current == head) {
            head = current.next;
            current.next.previous = null;
        } else {
            if (current.next == null) {
                tail = current.previous;
                current.previous.next = null;
            } else {
                current.next.previous = current.previous;
                current.previous.next = current.next;
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int num, cho,index;
        DoublyLinkedList dList = new DoublyLinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println(" OPTIONS:\n1.InsertatBegin\n2.InsertatIndex\n3.InsertatEnd\n4.Delete\n5.Display\n6.Exit\n\nEnter the choice :");
            cho = Integer.parseInt(br.readLine());
            switch (cho) {
                case 1: {
                    System.out.println("Enter the integer to be inserted at beginning:");
                    num = Integer.parseInt(br.readLine());
                    dList.addNodeAtBegin(num);
                    break;
                }
                case 2: {
                    System.out.println("Enter the integer to be inserted: ");
                    num = Integer.parseInt(br.readLine());
                    System.out.println("Enter the index ");
                    index = Integer.parseInt(br.readLine());
                    dList.addNodeAtIndex(num,index);
                    break;
                }
                 case 3: {
                    System.out.println("Enter the integer to be inserted at end:");
                    num = Integer.parseInt(br.readLine());
                    dList.addNodeAtEnd(num);
                    break;
                }
                case 4: {
                    System.out.println("Enter the integer to be deleted: ");
                    num = Integer.parseInt(br.readLine());
                    dList.delete(num);
                    break;
                }
                case 5: {
                    dList.display();
                    break;
                }
                case 6: {
                    System.out.println("Exit...");
                    System.exit(0);
                }
                default: {
                    System.out.println("Wrong choice");
                    break;
                }
            }
        } while (true);
    }
}