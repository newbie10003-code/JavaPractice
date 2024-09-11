import java.util.ArrayList;
import java.util.List;

public class wrapperClasses {
    public static void main(String[] args) {
        Character i = '1';
        System.out.println(i.hashCode());
        i = '4';
        System.out.println(i.hashCode());
        List<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);
    }
}
