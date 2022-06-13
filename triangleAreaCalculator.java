import java.util.Scanner;

public class triangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of three of the sides in a triangle and system will calculate the area");
        System.out.println("Input the size of the first side");
        double sidea = sc.nextDouble();

        System.out.println("Input the size of the second side");
        double sideb = sc.nextDouble();

        System.out.println("Input the size of the third side");
        double sidec = sc.nextDouble();

        double semiperimeter = (sidea + sideb + sidec) / 2;
        double semiperimeterin = semiperimeter * (semiperimeter - sidea) * (semiperimeter - sideb)
                * (semiperimeter - sidec);
        double Area = Math.sqrt(semiperimeterin);

        System.out.println(" The semiperimeter is " + semiperimeter);
        System.out.println(" The Area is " + Area);
        sc.close();
    }
}
