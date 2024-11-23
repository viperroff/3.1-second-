package ru.kolmykov.calculate;
import java.math.BigInteger;

public class Calculate implements Calc {

    @Override
    public BigInteger sum(double... nums) {
        BigInteger result = BigInteger.ZERO;
        for (double num : nums) {
            result = result.add(BigInteger.valueOf((long) num));
        }
        return result;
    }

    @Override
    public BigInteger sum(BigInteger bigInt, double... nums) {
        BigInteger result = sum(nums);
        return result.add(bigInt);
    }
}