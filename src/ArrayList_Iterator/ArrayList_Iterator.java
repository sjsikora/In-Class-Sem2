package ArrayList_Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        // Array list are special in that items can be dynfamically added to the list
        // The size of the ArrayList is not fixed, but can grow as needed

        myArrayList.add("Good ");
        myArrayList.add(" :-)!");
        myArrayList.add(" ERROR ");

        //We can then add through the index. This will add the string "Luck" at index 1
        myArrayList.add(1, " Luck ");

        //We can also remove items from the ArrayList
        myArrayList.remove(myArrayList.size() - 1);

        System.out.println(myArrayList.toString());


        //Itreating through an ArrayList
        System.out.println("For, int");
        for(int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i));
        }
        System.out.println();


        System.out.println("For each");
        for(String s : myArrayList) {
            System.out.print(s);
        }
        System.out.println();


        //Itterator class. 
        System.out.println("Iterator");
        Iterator<String> itr = myArrayList.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
        }
        System.out.println();

        //ListIterator class.
        ListIterator<String> lit = myArrayList.listIterator();

        System.out.println("Going to the front of the list");
        //Point goes to the front of the list
        while(lit.hasNext()) {
            System.out.print(lit.next());
        }
        System.out.println();

        System.out.println("Removing, the last read element");
        //Importantly, the Iterator removes the last element read by either next() or previous().
        lit.remove();

        System.out.println("Going to the back of the list");
        //Then, pointer travels backwards through the list
        while(lit.hasPrevious()) {
            System.out.print(lit.previous());
        }



    }
}
