package Collection_LinkedList_ASS;

import java.util.LinkedList;
import java.util.Scanner;
// Q8. How do you remove the elements of a LinkedList from both the ends ?
public class Remove_ele_both_the_ends_LInkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList ob=new LinkedList();

        System.out.println("Enter LinkedList Element :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println(ob);

        ob.removeFirst();
        ob.removeLast();

        System.out.println("After Removing first and last element :");
        System.out.println(ob);

    }
}
/*
Output :

        Enter LinkedList Element :
        10 20 30 40 50
        [10, 20, 30, 40, 50]
        After Removing first and last element :
        [20, 30, 40]

 */
