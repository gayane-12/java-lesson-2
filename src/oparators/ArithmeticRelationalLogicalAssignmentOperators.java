package oparators;

public class ArithmeticRelationalLogicalAssignmentOperators {
    public static void main(String[] args) {
        int firstValue = 158;
        int secondValue = firstValue >= 200 ? 40 : 41;
        int sum = firstValue++ + --secondValue;
        int difference = firstValue - secondValue;
        int product = firstValue * secondValue;
        int quotient = firstValue / secondValue;

        secondValue += 20;

        System.out.println("first value - " + firstValue);
        System.out.println("second value - " + secondValue);
        System.out.println("sum - " + sum);
        System.out.println("difference - " + difference);
        System.out.println("product - " + product);
        System.out.println("quotient - " + quotient);

        if(firstValue % 2 == 0 && secondValue % 2 == 0)
            System.out.println("both values are even");
        else if(firstValue % 2 == 0 || secondValue % 2 == 0)
            System.out.println("one of value is even");
        else
            System.out.println("both values are odd");
    }
}
