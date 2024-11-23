package ru.kolmykov.calculate;
import java.math.BigInteger;

public interface Calc {
    BigInteger sum(double... nums);
    BigInteger sum(BigInteger bigInteger, double... nums);
}