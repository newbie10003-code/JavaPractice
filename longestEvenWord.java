import java.util.*;
public class longestEvenWord {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Newbie");
        names.add("Rameshwari");
        names.add("Tiwari");
        names.add("Aunaey");
        Integer res = -1;
        for(String s : names)
        {
            if(s.length() % 2 == 0)
            {
                res = Math.max(res, s.length());
            }
        }
        System.out.println(res);
    }
}