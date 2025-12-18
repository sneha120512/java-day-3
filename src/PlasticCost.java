import java.util.Scanner;

class Plastic2D {
    double length, width;
    double cost;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    void calculateCost() {
        cost = length * width * 40;
        System.out.println("Cost of plastic sheet = Rs " + cost);
    }
}

class Plastic3D extends Plastic2D {
    double height;

    void getData3D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void calculateCost3D() {
        cost = length * width * height * 60;
        System.out.println("Cost of plastic box = Rs " + cost);
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Plastic3D obj = new Plastic3D();
        obj.getData();
        obj.getData3D();
        obj.calculateCost3D();
    }
}

