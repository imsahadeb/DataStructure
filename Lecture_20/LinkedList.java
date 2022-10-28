package DataStructure.Lecture_20;



/************PRINT LINKED LIST****************************** */
public class LinkedList {
    public static void printLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    /*******************************INSERT ITH POS*********************** */

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data) {
        LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);

        if (pos == 0) {

            newNode.next = head;
            head = newNode;

        } else {
            LinkedListNode<Integer> tmp = head;
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;

            }

            newNode.next = tmp.next;
            tmp.next = newNode;

        }

        return head;

    }

    /****************************** REMOVE ELEMENT FROM LINKED LIST******************************** */

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        LinkedListNode<Integer> prev = head;
        int count =0;

        while(count <pos-1){
            count++;
            prev=prev.next;
        }
        prev.next=prev.next.next;

        return head;
	}

/****************************** REVERSE LINKED LIST********************************/
public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
    LinkedListNode<Integer> prevNode,nextNode,curNode;
    prevNode=null;
    nextNode=null;
    curNode=head;
    while(curNode!=null){
        nextNode=curNode.next;
        curNode.next=prevNode;
        prevNode=curNode;
        curNode=nextNode;
    }
    return prevNode;
}

/******************************* LENGTH OF LINKED LIST******************************* */
public static int length(LinkedListNode<Integer> head){
		
    int count =0;
    while(head != null){
        head=head.next;
        count++;
    }
    
    return count;
}

    
    public static void main(String[] args) {
        LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> n2 = new LinkedListNode<Integer>(3);
        LinkedListNode<Integer> n3 = new LinkedListNode<Integer>(5);
        LinkedListNode<Integer> n4 = new LinkedListNode<Integer>(5);
        LinkedListNode<Integer> n5 = new LinkedListNode<Integer>(3);
         LinkedListNode<Integer> n6 = new LinkedListNode<Integer>(2);
        // LinkedListNode<Integer> n7 = new LinkedListNode<Integer>(2);
        // LinkedListNode<Integer> n8 = new LinkedListNode<Integer>(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next=n5;
         n5.next=n6;
        // n6.next=n7;
        // n7.next=n8;
       printLinkedList(n1);
        //Node<Integer> s = deleteNode(n1, 3);
        //print(s);

        LinkedListNode<Integer> tmp = n1;
        int l=length(tmp);
        System.out.println(l);
        int mid=(l/2);
        System.out.println("mid: " +mid);
        while(mid-1>0){
            tmp=tmp.next;
            mid--;
        }
        LinkedListNode<Integer> rightHalf=tmp.next;
        tmp.next=null;
        System.out.print("Right Half: ");
        printLinkedList(rightHalf);
        System.out.print("Left Half: ");
        printLinkedList(n1);
        System.out.print("Reversing Right Half: ");
        rightHalf=reverseLL(rightHalf);
        printLinkedList(rightHalf);

        for(int i=0;i<l/2;i++){
            if(rightHalf.data!=n1.data){
                System.out.println("False");
                break;
            }
            else{
                rightHalf=rightHalf.next;
                n1=n1.next;
                System.out.println(n1);
            }
           
            
        }
       


    }

}
