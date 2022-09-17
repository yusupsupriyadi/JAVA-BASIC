public class OperatorArithmetic {
    public static void main(String[] args){
        int number1 = 2;
        number1 += 5;
        System.out.println(number1);

        int number2 = 3;
        number2++;
        System.out.println(number2);
        System.out.println(number2 * number1);

        double number3 = 4.3;
        System.out.println(number3);

        int number4 = 5;
        int number5 = 2;
        System.out.println((double)number4 / number5);
    }
}
