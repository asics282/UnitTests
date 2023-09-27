package HW1.Calculator;

public class Calculator {
    public static double calculate(int operand1, int operand2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result =  operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if(operand2 != 0){
                    result = operand1 / operand2;
                    break;}
                else {
                    throw new ArithmeticException("Деление на ноль запрещено");
                }
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
    }


    public static double calculateDiscount(double total, int discount) {
        if (discount >= 100){
            throw new ArithmeticException("Размер скидки не может быть больше 100 %");
        }
        return total - total * ((double) discount/100);

    }


    public static void main(String[] args) {
        System.out.println(calculateDiscount(500,50));
        System.out.println(calculate(2,0,'/'));
    }
}
