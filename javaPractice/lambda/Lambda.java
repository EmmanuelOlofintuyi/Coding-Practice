package lambda;
//a lambda is a shortcut to defining an implementation of a functional interface
public class Lambda {
    public static void main(String[] args) {


        Printable lambdaPrintable = (s) -> "meow";
        printThing(lambdaPrintable);

    }

    static  void printThing(Printable thing){
        thing.print("!");
    }
}
