class Student {
    int id;
    String name;
    String blood_group;
    
}

public class Hello {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.id = 12421042;
        obj.name = "Mr Naim Zomaddar";
        obj.blood_group = "O+";
        System.out.println("Hello Word, java");
        System.err.println("Student ID: " + obj.id + " \n" + "Name: " + obj.name + " \n" + "Blood Group: " + obj.blood_group);
    }
}
