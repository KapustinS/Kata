//package Java1;
//
//import java.math.BigInteger;
//
//public class Task2_4_14 {
//
//    public static BigInteger factorial(int value) {
//
//        if (value == 1 || value == 0) {
//            return BigInteger.ONE;
//        }
//
//        BigInteger result = BigInteger.valueOf(value);
//        result = result.multiply(factorial(--value));
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(factorial(100));
//
//
//    }
//}
