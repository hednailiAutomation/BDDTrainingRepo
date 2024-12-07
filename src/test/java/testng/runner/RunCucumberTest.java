package testng.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hedi\\eclipse-workspace\\BDDTraining\\src\\test\\resources\\Features",
glue={"steps","pages","common","testng.runner"},plugin={"pretty","html: target/HtmlReport/index.html"},monochrome=true)


public class RunCucumberTest {

}
