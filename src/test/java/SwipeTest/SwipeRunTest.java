package SwipeTest;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		monochrome = true,
		format = {"pretty", "html:target/Destination"},
		features = {"SwipeTest"},
		glue = {"SwipeTest"}
		
		)

public class SwipeRunTest {

}
