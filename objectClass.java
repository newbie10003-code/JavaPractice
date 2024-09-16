public class objectClass {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", 2002);
        Car car2 = new Car("Nissan", 2002);

        System.out.println(car1.equals(car2));
    }
}

class Car {
    String model;
    int year;

    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    public boolean equals(Car car2)
    {
        if (this.year == car2.year && this.model.equals(car2.model)) {
            return true;
        }
        return false;
    }
}