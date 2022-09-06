package Collection_LinkedList_ASS;

import java.util.LinkedList;
import java.util.Scanner;
// Q7.How do you insert an element at the head and tail of a LinkedList?
public class Insert_ele_Head_and_Tail_LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList ob=new LinkedList();

        System.out.println("Enter Linkedlist Element :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println(ob);

        ob.addFirst(10);
        ob.addLast(100);

        System.out.println("After adding first and last element is :");
        System.out.println(ob);


    }
}
/*
Output :

        Enter Linkedlist Element :
        40 50 60 70 80
        [40, 50, 60, 70, 80]
        After adding first and last element is :
        [10, 40, 50, 60, 70, 80, 100]

 */
