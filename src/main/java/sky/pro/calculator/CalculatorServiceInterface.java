package sky.pro.calculator;



public interface CalculatorServiceInterface {
    String helloUser();
    String sum(Integer num1, Integer num2);
    String diff(Integer num1, Integer num2);
    String mul(Integer num1, Integer num2);
    String div(Integer num1, Integer num2);
    Boolean parametersAvailability(Integer num1, Integer num2);
}
