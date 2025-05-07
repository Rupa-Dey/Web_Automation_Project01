# Web_Automation_Basic Part.
##Maven_project##
**Here is created maven project.

##pom.xml file##
*Here is added the dependency such as selenium,testNG etc. which are taken from mvn repository.

##Class create##
src->test->java-> new_package(rupa_dey)->java_class(e.g, Hello_web).

##For Browser automation##
```bash
    public class setupDriver {
    public  WebDriver driver;
    @BeforeSuite
	//open the browser
    public void openBrowser(){
        driver = new ChromeDriver();
    }
    @AfterSuite
	//quit all tab
    public void closeBrowser(){
        driver.quit();
    }
```
##When the new tab is created ##
```bash
driver.switchTo().newWindow(WindowType.TAB);
```
##When The new window is opened##
```bash
driver.switchTo().newWindow(WindowType.WINDOW);
```
##minimize, maximize, fullscreen,back, forward and refresh is automatically controlled##
```bash
driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
```
#After adding testNG dependency, we will use annotation instead of the main method#

##To get automatiocally title and current url#
```bash
//To get the title
Assert.assertEquals(driver.getTitle(), "Messenger");

//To get the current url
Assert.assertEquals(driver.getCurrentUrl(), "https://www.messenger.com/");
    
```
