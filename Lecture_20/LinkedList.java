package DataStructure.Lecture_20;
/************PRINT LINKED LIST****************************** */
public class LinkedList {
    public static void print(Node<Integer> head) {
        Node<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    /*******************************INSERT ITH POS*********************** */

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        Node<Integer> newNode = new Node<Integer>(data);

        if (pos == 0) {

            newNode.next = head;
            head = newNode;

        } else {
            Node<Integer> tmp = head;
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;

            }

            newNode.next = tmp.next;
            tmp.next = newNode;

        }

        return head;

    }

    /****************************** REMOVE ELEMENT FROM LINKED LIST******************************** */

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        Node<Integer> prev = head;
        int count =0;

        while(count <pos-1){
            count++;
            prev=prev.next;
        }
        prev.next=prev.next.next;

        return head;
	}


    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        print(n1);
        Node<Integer> s = deleteNode(n1, 3);
        print(s);

    }

}
