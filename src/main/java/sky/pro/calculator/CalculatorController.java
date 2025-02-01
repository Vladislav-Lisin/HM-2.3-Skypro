package sky.pro.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String Hello() {
        return calculatorService.helloUser();
    }

    @GetMapping(path = "/plus")
    public String plus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.diff(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.mul(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.div(num1, num2);
    }


}
