package FormularioTest;

import org.junit.runner.RunWith; 
import cucumber.junit. Cucumber ; 

@RunWith(Cucumber.class) 
@Cucumber.Options( 
		monochrome = true,
	   format = {"pretty", "html:target/Destination"},
       features = {"FormularioTest"},
	   glue = {"FormularioTest"}   
 ) 
	
public class FormularioRunTest {

}
