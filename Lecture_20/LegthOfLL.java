package DataStructure.Lecture_20;
class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
       // next=null;

    }
    
}

public class LegthOfLL {
    public static int length(Node<Integer> head){
		
        int count =0;
        while(head != null){
            head=head.next;
            count++;
        }
        
        return count;
	}


    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        
        int len = length(n1);
        System.out.println(len);


    }
    
}
