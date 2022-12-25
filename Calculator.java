import java.util.*;
public class Calculator {
    double degrees, minutes, value;
    private String trigratio;
    Scanner sc = new Scanner(System.in);
    void input() {
        System.out.print("Enter angle: ");
        degrees = sc.nextDouble();
        System.out.print("Enter minutes: ");
        minutes = sc.nextDouble();
        System.out.print("Enter trigonometric ratio: ");
        trigratio = sc.next();
        //System.out.println(trigratio);
    }
    void defaultt() {
        String rats[][] = new String[7][7];
        
    }
    public static void main(String[] args) {
        Calculator khs = new Calculator();
        khs.input();
    }
}