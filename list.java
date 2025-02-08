class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head,tail;
   
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
   
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtbegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
}



public class Main
    {
        public static void main(String[] args)
        {
            LinkedList link=new LinkedList();
            link.insert(100);
            link.insert(200);
            link.insert(300);
            link.display();
             System.out.println("ins 500 at begin");
              link.insertAtbegin(500);
              link.display();
           
        }
    }




















class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head,tail;
   
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
   
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtbegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
}



public class Main
    {
        public static void main(String[] args)
        {
            LinkedList link=new LinkedList();
            link.insert(100);
            link.insert(200);
            link.insert(300);
            link.display();
             System.out.println("ins 500 at begin");
              link.insertAtbegin(500);
              link.display();
           
        }
    }










class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head,tail;
   
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
   
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtbegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
}



public class Main
    {
        public static void main(String[] args)
        {
            LinkedList link=new LinkedList();
            link.insert(100);
            link.insert(200);
            link.insert(300);
            link.display();
             System.out.println("ins 500 at begin");
              link.insertAtbegin(500);
              link.display();
           
        }
    }