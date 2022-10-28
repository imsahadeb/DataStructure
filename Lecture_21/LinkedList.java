package DataStructure.Lecture_21;

import java.util.*;

public class LinkedList {
    /************************ TAKING INPUT IN LINKED LIST */

    public static LinkedListNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        while (data != -1) {
            LinkedListNode<Integer> currNode = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
                tail.next = currNode;
                tail = currNode;
            }
            data = sc.nextInt();

        }
        return head;
    }

    /************ PRINT LINKED LIST****************************** */
    public static void printLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    /******************************* INSERT ITH POS*********************** */

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

    /******************************
     * REMOVE ELEMENT FROM LINKED LIST********************************
     */

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        LinkedListNode<Integer> prev = head;
        int count = 0;

        while (count < pos - 1) {
            count++;
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return head;
    }

    /******************************
     * REVERSE LINKED LIST
     ********************************/
    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prevNode, nextNode, curNode;
        prevNode = null;
        nextNode = null;
        curNode = head;
        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        return prevNode;
    }

    /*******************************
     * LENGTH OF LINKED LIST*******************************
     */
    public static int length(LinkedListNode<Integer> head) {

        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }

        return count;
    }

    /******************* Print Linked List using Recursion************* */
    public static void printR(LinkedListNode<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }

    /******************* Print Linked List using Recursion************* */
    public static void printLinkedListinReverse(LinkedListNode<Integer> head) {
        if (head == null) {
            return;
        }

        printLinkedListinReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int num, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(num);
            newNode.next = head;
            return newNode;
        } else {
            LinkedListNode<Integer> partialHead = insertR(head.next, num, pos - 1);
            head.next = partialHead;
            return head;
        }

    }

    // exampl
   public static void fun(LinkedListNode<Integer>  start) {
        if (start == null)
            return;
        System.out.print(start.data);

        if (start.next != null)
            fun(start.next.next);
        System.out.print(start.data);
    }

    // Deleteing node in Recursive manner
    public static LinkedListNode<Integer>  delteNodeRec(LinkedListNode<Integer> head,int pos) {
        
        
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput();


    }

}
