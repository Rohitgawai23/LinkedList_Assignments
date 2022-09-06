package Collection_LinkedList_ASS;


import java.util.*;

// Q1. Given an element, how do you find out whether that element exist in a LinkedList or not. If it exist retrieve
//   the position of that element?
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList ob=new LinkedList();
        System.out.println("Enter LinkedList element :");
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            ob.add(n);
        }
        Iterator it = ob.iterator();
        System.out.println("Elements is");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Enter elements you want find");
        int E=sc.nextInt();
        if(ob.contains(E))
            System.out.println("Elements present in "+ob.indexOf(E) + " Index");
    }
}
/*

 Output :

         Enter LinkedList element :
         1 2 3 4 5
         Elements is
         1
         2
         3
         4
         5
         Enter elements you want find
         4
         Elements present in 3 Index

 */