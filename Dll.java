import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter num");
   int n=sc.nextInt();
   int a[]=new int[n];
   int temp;
   System.out.println("enter the elements");
   for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
       
   }
  for(int i=0;i<n;i++){
     for(int j=i+1;j<a.length;j++){
         if(a[i]>a[j]){
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
         }
     }
  }
  System.out.println("ascending order");
  for(int i=0;i<n;i++)
  {
      System.out.println(a[i]);
     
  }
}

  }




import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next =null;
        this.prev = null;
    }
}
class DLL{
    Node head,tail;
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail=newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void display(){
        Node temp = head;
        if(temp==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" <--> ");
            }
             temp = temp.next;
           
        }
        System.out.println();
    }
    public void deleteAtBeg(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev = null;
        }
    }
    public void deleteAtEnd(){
       
    }
}
public class Main
{
public static void main(String[] args) {
DLL doubly = new DLL();
doubly.insertAtBeg(100);
doubly.insertAtBeg(200);
doubly.insertAtBeg(300);
doubly.insertAtEnd(400);
doubly.deleteAtBeg();
doubly.display();
}
}





class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rem;
        int temp=x;
        long ans=0;
        while(x!=0)
        {
            rem=x%10;
            ans=(ans*10)+rem;
            x=x/10;

        }
        if(temp==ans){
            return true;
        }
        else{
            return false;
        }
        }
        }
       
   




import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter num");
   int n=sc.nextInt();
   int a[]=new int[n];
   
   int temp;
   System.out.println("enter the elements");
   for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
       
   }
  for(int i=0;i<n;i++){
     for(int j=i+1;j<a.length;j++){
         if(a[i]>a[j]){
             temp=a[i];
             a[i]=a[j];
             
             a[j]=temp;
             
             
             
         }
     }
  }
  System.out.println("sec largest num" +a[n-2]);
}
}

