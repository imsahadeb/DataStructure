package DataStructure.Lecture_20;
class Node<T> {
    T data;
    LinkedListNode<T> next;
    Node(T data){
        this.data=data;
       // next=null;

    }
    
}

public class LegthOfLL {
    public static int length(LinkedListNode<Integer> head){
		
        int count =0;
        while(head != null){
            head=head.next;
            count++;
        }
        
        return count;
	}


    public static void main(String[] args) {
        LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(10);
        LinkedListNode<Integer> n2 = new LinkedListNode<Integer>(20);
        LinkedListNode<Integer> n3 = new LinkedListNode<Integer>(30);
        LinkedListNode<Integer> n4 = new LinkedListNode<Integer>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        
        int len = length(n1);
        System.out.println(len);


    }
    
}
