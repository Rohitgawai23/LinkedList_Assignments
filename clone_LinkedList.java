package Collection_LinkedList_ASS;

import java.util.LinkedList;

// Q4. Write a Java program to clone an linked list to another linked list.
public class clone_LinkedList {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();

        ll.add(12);
        ll.add(143);
        ll.add(456);

        System.out.println("first LinkedList : "+ll);


        LinkedList ob=new LinkedList();

        ob=(LinkedList) ll.clone();

        System.out.println("clone LinkedList :"+ob);

    }
}
/*
Output :

        first LinkedList : [12, 143, 456]
        clone LinkedList :[12, 143, 456]

 */
