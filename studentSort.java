import java.util.*;
/**
 * InnerstudentSort
 */
class Student {
    public String fName;
    public String lName;

    public Student(String firstName, String lastName) {
        this.fName = firstName;
        this.lName = lastName;
    }

    public String getName()
    {
        return this.fName;
    }
    
}
public class studentSort {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student("Nilesh", "Bhanot"));
        l.add(new Student("Rams", "Kaps"));
        l.add(new Student("Hatty", "Tiwari"));

        Collections.sort(l, new Comparator<Student>() {
            public int compare(Student s1, Student s2)
            {
                return s1.getName().compareTo(s2.getName());
            }
        });
        
        for(Student s : l)
        {
            System.out.println(s.fName + " " + s.lName);
        }
    }   

}
