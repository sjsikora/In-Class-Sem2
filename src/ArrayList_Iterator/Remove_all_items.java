package ArrayList_Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Remove_all_items {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("a");


        // This does not work. Rather we need to use another metho
        // for(int i = 0; i < list.size(); i++) {
        //     list.remove("a");
        // }

        while(list.contains("a")) {
            list.remove("a");
        }

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            if(itr.next().equals("a")) {
                itr.remove();
            }
        }

        list.removeAll(Arrays.asList("A"));

        System.out.println(list.toString());





    }
}
