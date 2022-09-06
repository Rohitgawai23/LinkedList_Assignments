package Collection_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_ex {
    public static void main(String[] args) {
        LinkedList<String> ob=new LinkedList<>();

        ob.add("Rohit");
        ob.add("prashant");
        ob.add("Hemant");
        ob.add("Atul");
        ob.add("Anil");

        System.out.println(ob);

        System.out.println("By using iterator :");
        Iterator itr=ob.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}

/*
Output :

        [Rohit, prashant, Hemant, Atul, Anil]
        By using iterator :
        Rohit
        prashant
        Hemant
        Atul
        Anil

 */