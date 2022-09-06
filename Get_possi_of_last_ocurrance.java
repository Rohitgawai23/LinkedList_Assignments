package Collection_LinkedList_ASS;

import java.util.LinkedList;
import java.util.Scanner;

// Q10.How do you get the position of last occurrence of a given element in a LinkedList?
public class Get_possi_of_last_ocurrance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList ob=new LinkedList();

        System.out.println("Enter LinkedList element :");
        for(int i=0; i<5; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println(ob);

        System.out.println(ob.lastIndexOf(ob.size()));
    }
}
/*
Output :

        Enter LinkedList element :
        1
        2
        3
        4
        5
        [1, 2, 3, 4, 5]
        4


 */