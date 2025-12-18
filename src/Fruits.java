import java.sql.SQLOutput;

class Apple {
    void show(){
        System.out.println("This is apple class");

    }
}
class Banana extends Apple {
    void show() {
        System.out.println("This is banana class");
    }
}
class Cherry extends Apple {
    void show() {
        System.out.println("This is cherry class");

    }
}
public class Fruits {
    public static void main(String[] args)
    {
        Apple a;

        a= new Apple();
        a.show();

        a= new Banana();
        a.show();

        a= new Cherry();
        a.show();

    }
}
