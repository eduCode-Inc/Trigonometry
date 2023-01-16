import java.util.*;
public class RunThis {
    public static void main(String args[]) {
        System.out.println("Trigonometric Calculator\n");
        System.out.println("Any angle. Any ratio. Just enter 1 for angle to ratio, 2 for ratio to angle, 3 for standard angle ratios, and 0 to stop.\n");
        try (Scanner sc = new Scanner(System.in)) {
            Calculator edu = new Calculator();
            while (true) {
                System.out.print("Enter choice: ");
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
                            edu.values();
                            break;
                        }
                    case 2:
                        {
                            edu.angles();
                            break;
                        }
                    case 3:
                        {
                            edu.deftables();
                            break;
                        }
                }
            }
        }
    }
}