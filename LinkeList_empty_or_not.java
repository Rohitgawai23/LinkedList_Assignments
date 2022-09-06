package Collection_LinkedList_ASS;

import java.util.LinkedList;
import java.util.Scanner;
// Q6. Write a Java program to test an linked list is empty or not.
public class LinkeList_empty_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList ll =new LinkedList();

        System.out.println("Enter your LinkedList element :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ll.add(n);
        }

        if(ll.isEmpty())
        {
            System.out.println("LinkedList is empty");
        }
        else
            System.out.println("LinkedList is not empty");

    }
}
/*
Output :

        Enter your LinkedList element :
        1 2 3 4 5
        LinkedList is not empty

 */