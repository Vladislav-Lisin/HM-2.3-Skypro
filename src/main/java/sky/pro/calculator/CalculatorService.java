package sky.pro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    public String helloUser() {
        return "Добро пожаловать в калькулятор";
    }

    public Boolean parametersAvailability(Integer num1, Integer num2) {
        return num1 == null || num2 == null;
    }

    public String sum(Integer num1, Integer num2) {
        if (parametersAvailability(num1, num2)) {
            return "Необходимо ввести оба параметра num1 и num2";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String diff(Integer num1, Integer num2) {
        if (parametersAvailability(num1, num2)){
            return "Необходимо ввести все параметры";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String mul(Integer num1, Integer num2) {
        if (parametersAvailability(num1, num2)){
            return "Необходимо ввести все параметры";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String div(Integer num1, Integer num2) {
        if (parametersAvailability(num1, num2)){
            return "Необходимо ввести все параметры";
        }
        if (num2 == 0) {
            return "Деление на ноль не возможно.";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
