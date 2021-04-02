package oparators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int firstValue = 80;
        int secondValue = 39;
        int result;

        result = firstValue & secondValue;
        System.out.println("firstValue & secondValue = " + result );

        result = firstValue | secondValue;
        System.out.println("firstValue | secondValue = " + result );

        result = ~firstValue;
        System.out.println("~firstValue = " + result );

        result = firstValue ^ secondValue;
        System.out.println("firstValue ^ secondValue = " + result );

        result = firstValue << 2;
        System.out.println("firstValue << 2 = " + result );

        result = firstValue >> 2;
        System.out.println("firstValue >> 2  = " + result );

        result = firstValue >>> 2;
        System.out.println("firstValue >>> 2 = " + result );
    }
}
