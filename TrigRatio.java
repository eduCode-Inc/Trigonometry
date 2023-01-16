import java.util.*;
public class TrigRatio {
    String ratio;
    double angle, minutes, rad, value;
    TrigRatio(String r, double a, double m) {
        ratio = r;
        angle = a;
        minutes = m;
    }
    TrigRatio(String r, double v) {
        ratio = r;
        value = v;
    }
    double calculateRatio() {
        switch (ratio) {
            case "sin":
                {
                    angle += (minutes/60);
                    rad = Math.toRadians(angle);
                    value = Math.sin(rad);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "cos":
                {
                    angle += (minutes/60);
                    rad = Math.toRadians(angle);
                    value = Math.cos(rad);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "tan":
                {
                    angle += (minutes/60);
                    rad = Math.toRadians(angle);
                    value = Math.tan(rad);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "cosec":
                {
                    angle += (minutes/60);
                    rad = Math.toRadians(angle);
                    value = 1/Math.sin(rad);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "sec":
                {
                    angle += (minutes/60);
                    rad = Math.toRadians(angle);
                    value = 1/Math.cos(rad);
                    value = (double)Math.round(value * 10000d)/10000d;
                    break;
                }
            case "cot":
                {
                    angle += (minutes/60);
                    rad = Math.toRadians(angle);
                    value = 1/Math.tan(rad);
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
    double calculateAngle() {
        switch (ratio) {
            case "sin":
                {
                    rad = Math.asin(value);
                    angle = Math.toDegrees(rad);
                    angle = (double)Math.round(angle * 10000d)/10000d;
                    break;
                }
            case "cos":
                {
                    rad = Math.acos(value);
                    angle = Math.toDegrees(rad);
                    angle = (double)Math.round(angle * 10000d)/10000d;
                    break;
                }
            case "tan":
                {
                    rad = Math.atan(value);
                    angle = Math.toDegrees(rad);
                    angle = (double)Math.round(angle * 10000d)/10000d;
                    break;
                }
            case "cosec":
                {
                    rad = Math.asin(1/value);
                    angle = Math.toDegrees(rad);
                    angle = (double)Math.round(angle * 10000d)/10000d;
                    break;
                }
            case "sec":
                {
                    rad = Math.acos(1/value);
                    angle = Math.toDegrees(rad);
                    angle = (double)Math.round(angle * 10000d)/10000d;
                    break;
                }
            case "cot":
                {
                    rad = Math.atan(1/value);
                    angle = Math.toDegrees(rad);
                    angle = (double)Math.round(angle * 10000d)/10000d;
                    break;
                }
            default:
                {
                    angle = 0.0d;
                    System.out.println("Error: Not a valid ratio entered");
                    break;
                }
        }
        return angle;
    }
}