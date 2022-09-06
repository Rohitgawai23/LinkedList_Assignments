package Collection_LinkedList_ASS;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
// Q2. Write a Java program to traverse the elements of a LinkedList in reverse direction?
public class Reverse_direction_Ele_LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList Al=new LinkedList<>();

        System.out.println("Enter LinkedList :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            Al.add(n);
        }
        System.out.println(Al);

        ListIterator li= Al.listIterator(Al.size());
        System.out.println("reverse direction :");
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }


    }
}
/*
Output :

        Enter LinkedList :
        1 2 3 4 5
        [1, 2, 3, 4, 5]
        reverse direction :
        5
        4
        3
        2
        1

 */
