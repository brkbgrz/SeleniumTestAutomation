package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseStep {
    public WebDriver driver;

    public BaseStep()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resource/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public final class PageUrl {

        public static final String mainUrl="http://automationpractice.com/index.php";
        public static final String loginUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
        public static final String registerUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
        public static final String productUrl="http://automationpractice.com/index.php?id_category=11&controller=category";
        public static final String searchUrl="http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=summer&submit_search=";
        public static final String cartUrl="http://automationpractice.com/index.php?controller=order";
        public static final String addresstUrl="http://automationpractice.com/index.php?controller=order&step=1";
        public static final String myAccountUrl="http://automationpractice.com/index.php?controller=my-account";

    }
    public final class Shipping{
        public static final double price=2.00;
    }

    public enum TimeOut {
        CUSTOM_MAX(60),
        HIGH(15),
        LOW(5),
        MIDDLE(10);
        public long value;

        public long getValue() {
            return value;
        }

        // enum constructor - cannot be public or protected
        private TimeOut(long value) {
            this.value = value;
        }

    }

    public enum Pather {
        id,
        className,
        name,
        xPath,
        cssSelector,
        linkText

    }

    public String geturl()
    {
        driver.get("http://automationpractice.com/index.php");

        return null;
    }
    public void checkUrlIsCurrent(String Url) throws Exception {
        //if(driver.getCurrentUrl().toString()!=Url) {
          //  throw new Exception("Current Url: "+driver.getCurrentUrl()+"Expected Url: "+ PageUrl.loginUrl);
       // }

    }

    public void waitElement(WebElement element, TimeOut timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception ex) {

        }

    }
    public void findElementClick(String path, Pather type) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            switch (type) {
                case className:
                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).click();
                    break;
                case id:
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                    break;
                case name:
                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();
                    break;
                case xPath:
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
                    break;
                case cssSelector:
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();
                    break;
                case linkText:
                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();
                    break;
                default:
                    new NotFoundException();
            }

        } catch (Exception ex) { }
    }
    public WebElement findElement(String path, Pather type, Long timeOut) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    public WebElement findElement(String path, Pather type) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            WebElement element = null;
            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        } catch (Exception ex) {
            System.out.println("find element method error" + ex.getMessage());
            return null;
        }
    }


    public void PageScrolldown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)", "");

    }

    public void PageScrollup() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-300)", "");
    }
    public void DriverQuit() {
        driver.quit(); }
    public static final class Order {

        public static String result;

        public static String getResult() {
            return result;
        }

        public static void setResult(String result) {
            Order.result = result;
        }
    }
}
