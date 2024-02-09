// Polymorphism is the ability to present the same interface for differing
// underlying forms (data types). With polymorphism, each of these classes
// will have different underlying data. Precisely, Poly means ‘many’ and
// morphism means ‘forms’.


class student{
    String name;
    int age;

    public void info(int age){
        System.out.println("Age: "+ age);
    }
    public void info(String name){
        System.out.println("Name: "+ name);
    }
    public void info(String name, int age){
        System.out.println("Name: "+ name);
        System.out.print("Age: "+ age);
    }
}
public class Compile_polym{
    public static void main(String args[]){
        student s1 = new student();
        s1.name="Hunain";
        s1.age=18;

        s1.info(s1.name);
    }
}