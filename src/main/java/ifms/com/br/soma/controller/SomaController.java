
package ifms.com.br.soma.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ifms.com.br.soma.model.SomaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/sum")
public class SomaController {

    @GetMapping("/{num1}/{num2}")
    public Double getDivisao(@PathVariable String num1, @PathVariable String num2) {
     
        try {
            Double numero1 = Double.parseDouble(num1);
            Double numero2 = Double.parseDouble(num2);
            SomaModel sum = new SomaModel(numero1,numero2);
            return sum.getResultado();

            
        } catch (Exception e) {
                
                 throw new NumberFormatException("Não é permitido letra na url!");
            
        }
      

    }
    
    
}
