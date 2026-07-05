class Car{
    int Nember_pleats;
    String Brind_name;
    String Color;
}
public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.Brind_name = "BMW";
        obj.Color = "Black";
        obj.Nember_pleats = 29838;

        System.out.println("Details of Car: " + obj.Brind_name + " " + obj.Color + " " + obj.Nember_pleats);
    }
}
