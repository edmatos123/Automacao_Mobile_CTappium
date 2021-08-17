package CliqueTest;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
				monochrome = true,
			   format = {"pretty", "html:target/Destination"},
			   tags = {"@cliqueduplolento"},
		       features = {"CliqueTest"},
			   glue = {"CliqueTest"} 
)

public class CliqueRunTest {

}
