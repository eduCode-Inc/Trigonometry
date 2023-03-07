public class Root {
    double number;
    double value;
    Root(double n) {
        number = n;
    }
    double squareroot()  {
        value = Math.sqrt(number);
        value = (double)Math.round(value * 10000d)/10000d;
        return value;
    }
    double cuberoot() {
        value = Math.cbrt(number);
        value = (double)Math.round(value * 10000d)/10000d;
        return value;
    }
}