import java.util.ArrayList;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        for(int llr:ll){
            System.out.println(llr);
        }
        System.out.println("==========================");
        System.out.println(ll.get(2));
        System.out.println("==========================");
        ll.set(1,10);
        System.out.println("==========================");
        for(int llr:ll){
            System.out.println(llr);
        }
        System.out.println("==========================");
        ll.remove(1);
        System.out.println("==========================");
        for(int llr:ll){
            System.out.println(llr);
        }
    }
}