import java.util.*;
public class RunThis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trigonometric Calculator\n");
        System.out.println("Any angle. Any ratio. Just enter 1 to start and 0 to stop.\n");
        while (true) {
            System.out.print("Enter: ");
            int bn = sc.nextInt();
            switch (bn) {
                case 0:
                    {
                        System.out.println("Thank you for using eduCode's product.\n\nContact us at educode2021@outlook.com for customer service.");
                        System.out.print("For business inquiries, contact us at educode2021@gmail.com");
                        System.exit(0);
                        break;
                    }
                case 1:
                    {
                        Calculator edu = new Calculator();
                        edu.input();
                        edu.output();
                        break;
                    }
            }
        }
    }
}