package rupadey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Hello_web extends setupDriver{

    @Test
    public void testTitlePage() throws InterruptedException {
        driver.get("https://www.messenger.com/");
        Assert.assertEquals(driver.getTitle(), "Messenger");
        Thread.sleep(2000);
    }
    @Test
    public void testCurrentUrl() {
        driver.get("https://www.messenger.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.messenger.com/");
    }
}
