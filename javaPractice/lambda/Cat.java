package lambda;

public class Cat implements Printable{
    public String name;
    public int age;

    public Cat(){}

    @Override
    public String print(String s) {
        System.out.println("Meow");
        return "";
    }
}
