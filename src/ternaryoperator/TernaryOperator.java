package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {

        
        int num1 = 7;
        int num2 = 5;
        
        String operator = "+";
        
        int result = (operator == "+") ? num1 + num2
       :(operator == "-")? num1 - num2 : num1 * num2;
        System.out.println(result);


    }
    
}
