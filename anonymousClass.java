public class anonymousClass {

    public static void main(String[] args) {
        Anonymous obj = new Anonymous() {
            void sings() {
                System.out.println("Singing from inner class");
            }
        };

        obj.sings();
        
    }
}

class Anonymous {
    void sings()
    {
        System.out.println("Singing from outer class");
    }
}