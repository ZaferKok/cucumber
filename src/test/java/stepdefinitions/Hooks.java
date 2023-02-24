package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    static int stepCount;

    @Before
    public void setup() {
        Driver.getDriver();
    }

    @After
    public void teardown(Scenario scenario) {
        byte[] picture;
        if (scenario.isFailed()) {
            picture = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(picture, "image/png", "failed" + scenario.getName());
        }
        else {
            picture = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(picture, "image/png", "passed" + scenario.getName());
        }
        Driver.closeDriver();
    }

    @AfterStep
    public void makeSlowRunning() throws InterruptedException {
        Driver.wait(2);
        this.stepCount = stepCount + 1;
        System.out.println((stepCount) + ". STEP");
    }
}
