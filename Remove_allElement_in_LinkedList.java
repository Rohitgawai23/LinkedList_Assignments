package Collection_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Remove_allElement_in_LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList<String> ob=new LinkedList<String>();

        System.out.println("Enter LinkedList :");
        for(int i=0; i<5; i++)
        {
            String s=sc.nextLine();
            ob.add(s);
        }
        ob.clear();
        System.out.println(ob);
    }
}

/*

Enter LinkedList :
Rohit
Roshan
Prashant
Abbas
Atul
[]

 */