import java.util.*;
public class TrigRatio {
    String ratio;
    double value;
    double angle, minutes;
    TrigRatio(String r, double a, double m) {
        ratio = r;
        angle = a;
        minutes = m;
    }
    double calculate() {
        double ra;
        switch (ratio) {
            case "sin":
                {
                    angle += (minutes/60);
                    ra = Math.toRadians(angle);
                    value = Math.sin(ra);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "cos":
                {
                    angle += (minutes/60);
                    ra = Math.toRadians(angle);
                    value = Math.cos(ra);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "tan":
                {
                    angle += (minutes/60);
                    ra = Math.toRadians(angle);
                    value = Math.tan(ra);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "cosec":
                {
                    angle += (minutes/60);
                    ra = Math.toRadians(angle);
                    value = 1/Math.sin(ra);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "sec":
                {
                    angle += (minutes/60);
                    ra = Math.toRadians(angle);
                    value = 1/Math.cos(ra);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "cot":
                {
                    angle += (minutes/60);
                    ra = Math.toRadians(angle);
                    value = 1/Math.tan(ra);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            default:
                {
                    value = 0.0d;
                    System.out.println("Error: Not a valid ratio entered");
                    break;
                }
        }
        return value;
    }
}