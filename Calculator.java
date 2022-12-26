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
        System.out.println("Value: " + result); 
    }
    /*void defaultt() {
        String rats[][] = new String[7][7];
        
    }*/
}