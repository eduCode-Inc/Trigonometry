import java.util.*;
public class RunThis {
    public static void main(String args[]) {
        System.out.println("Mathematic Calculator\n");
        System.out.println("Any angle. Any ratio. Just enter\nx to STOP\na for angle to ratio\nb for ratio to angle\nc for standard angle ratios\nd for square roots\ne for cube roots\nf for squares\ng for cubes\n");
        try (Scanner sc = new Scanner(System.in)) {
            Calculator edu = new Calculator();
            while (true) {
                System.out.print("Enter choice: ");
                char bn = sc.next().charAt(0);
                switch (bn) {
                    case 'x':
                        {
                            System.out.println("Thank you for using eduCode's product.\n\nContact us at educode2021@outlook.com for customer service.");
                            System.out.print("For business inquiries, contact us at educode2021@gmail.com");
                            System.exit(0);
                            break;
                        }
                    case 'a':
                        {
                            edu.values();
                            break;
                        }
                    case 'b':
                        {
                            edu.angles();
                            break;
                        }
                    case 'c':
                        {
                            edu.deftables();
                            break;
                        }
                    case 'd':
                        {
                            edu.sqroot();
                            break;
                        }
                    case 'e':
                        {
                            edu.cbroot();
                            break;
                        }
                    case 'f':
                        {
                            edu.square();
                            break;
                        }
                    case 'g':
                        {
                            edu.cube();
                            break;
                        }
                }
            }
        }
    }
}