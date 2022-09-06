package Collection_LinkedList_ASS;

import java.util.ArrayList;
import java.util.LinkedList;

//  Write a Java program to convert a linked list to array list
public class LinkedList_to_ArrayList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList <String> ();

        ll.add("Red");
        ll.add("Green");
        ll.add("Black");
        ll.add("White");
        ll.add("Pink");

        System.out.println("Original linked list: " + ll);
        //  Convert a linked list to array list
        ArrayList<String> Al=new ArrayList<>(ll);
        for(String str: Al)
        {
            System.out.println(str);
        }

    }
}
/*
output :

        Original linked list: [Red, Green, Black, White, Pink]
        Red
        Green
        Black
        White
        Pink

 */