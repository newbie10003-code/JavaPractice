/**
 * parentInheritance
 */
class Parent 
{

    public void run()
    {
        System.out.println("Inside Parent run");
        walk();
    }
    public void walk()
    {
        System.out.println("Inside Parent walk");
    }
    
}

class Child extends Parent
{
    @Override
    public void run()
    {
        System.out.println("Inside Child run");
        super.run();
    }

    @Override
    public void walk()
    {
        System.out.println("Inside Child walk");
        super.walk();
    }
}

public class parentInheritance {

    public static void main(String[] args) {
        Parent p = new Child();
        p.run();
    }
}