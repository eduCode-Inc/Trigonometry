import java.util.*;
public class Calculator {
    double result;
    Scanner sc = new Scanner(System.in);
    double degrees, minutes;
    String trigratio;
    Calculator() {
        result = 0.0d;
    }
    void input() {
        System.out.print("Enter angle: ");
        degrees = sc.nextDouble();
        System.out.print("Enter minutes: ");
        minutes = sc.nextDouble();
        System.out.print("Enter trigonometric ratio: ");
        trigratio = sc.next();      
    }
    void output() {
        TrigRatio rat = new TrigRatio(trigratio, degrees, minutes);
        result = rat.calculate();
        System.out.println("Value: " + result + "\n"); 
    }
    void deftable() {
        String rats[][] = {
            {"     ", "  0  ", " 30  ", " 45  ", " 60  ", " 90  "},
            {" sin ", "  0  ", " 1/2 ", " 1/\u221a2", " \u221a3/2", "  1  "},
            {" cos ", "  1  ", " \u221a3/2", " 1/\u221a2", " 1/2 ", "  0  "},
            {" tan ", "  0  ", " 1/\u221a3", "  1  ", " \u221a3  ", "  \u221e  "},
            {"cosec", "  \u221e  ", "  2  ", " \u221a2  ", " 2/\u221a3", "  1  "},
            {" sec ", "  1  ", " 2/\u221a3", " \u221a2  ", "  2  ", "  \u221e  "},
            {" cot ", "  \u221e  ", " \u221a3  ", "  1  ", " 1/\u221a3", "  0  "}};
        System.out.println("Standard Angle Ratios:\n");
        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 6; i2++) {
                System.out.print(rats[i][i2] + "\t");
            }
            System.out.println("\n");
        }
    }
}