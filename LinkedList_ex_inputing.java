package Collection_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_ex_inputing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList ob=new LinkedList();

        System.out.println("Enter LinkedList :");
        for(int i=0; i<3; i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        System.out.println(ob);

    }
}

/*

Enter LinkedList :
2 3 4
[2, 3, 4]

 */