package DataStructure.Lecture_20;

import java.util.Scanner;

public class TakeInputLL {


    
    public static void print(LinkedListNode<Integer> head){

        LinkedListNode<Integer> temp = head;
        while(temp!= null){
          System.out.print(temp.data+" ");
          temp=temp.next;
        }
        System.out.println();
  
  
  
    }


    public static LinkedListNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        LinkedListNode<Integer> head =null;
        while(data!=-1){
            LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data);
            if(head==null){
                head=currentNode;
            }
            else{
                LinkedListNode<Integer> tail = head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
            }
            data = sc.nextInt();
            
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head= takeInput();
        print(head);
        
    }
}
