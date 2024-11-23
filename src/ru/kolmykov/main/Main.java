package ru.kolmykov.main;
import ru.kolmykov.calculate.*;
import ru.kolmykov.geometry.PointGeometry;
import java.math.BigInteger;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {

        //3.3.3

        Calculate calculate1 = new Calculate();
        BigInteger integer1 = new BigInteger("12345678912345678912");
        BigInteger result = calculate1.sum(integer1, 8.0, 6.0, 3.0 / 6);
        double finalResult = result.doubleValue();
        System.out.println(finalResult);


        //3.3.4

        String x = "2";
        String y = "5";
        System.out.println(power(x, y));

        //3.3.5

        Point point1 = new Point(1, 2);
        PointGeometry pointGeometry1 = new PointGeometry(2, 4);

        System.out.println(point1);
        pointGeometry1.print();


    }

    public static double power(String x, String y) {
        int base = parseInt(x);
        int exponent = parseInt(y);
        return pow(base, exponent);
    }
}