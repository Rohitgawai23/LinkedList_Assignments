package Collection_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Remove_given_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList<String> ob=new LinkedList<String>();
        System.out.println("Enter LinkedList ");
        for(int i=0; i<3; i++)
        {
            String s=sc.nextLine();
            ob.add(s);
        }

        System.out.println("Enter the String you want to Remove");
        String s1=sc.nextLine();

        ob.remove(s1);

        System.out.println(ob);



    }
}
