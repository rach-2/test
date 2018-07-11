import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Before;
import org.junit.Test;
import  org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class demoSiteTest
{
    WebDriver driver;
    @Before
    public  void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Devolopment\\web-driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void test()
    {
        driver.get("http://thedemosite.co.uk/addauser.php");
        AddUser adduser = PageFactory.initElements(driver,AddUser.class);
        Login login  = PageFactory.initElements(driver, Login.class);
        adduser.addUser();
        login.login();
        Assert.assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
        ExtentReports report = new ExtentReports("C:\\Devolopment\\demoSiteReport.html", true);
        ExtentTest test =  report.startTest("Login");
        //driver.get("http://thedemosite.co.uk/addauser.php");
       // driver.get("http://thedemosite.co.uk/login.php");
        String loginStatus = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
        test.log(LogStatus.INFO, "Brower started" );
        if(loginStatus.equals("**Successful Login**"))
        {
            test.log(LogStatus.PASS,"Login");
        }
        else
        {
            test.log(LogStatus.FAIL, "Login");
        }
        report.endTest(test);
        report.flush();
        driver.quit();
    }


    @Test
    public void demoSiteTest()
    {

    }
}
