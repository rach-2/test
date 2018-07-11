import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login
{
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
    private  WebElement username;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
    private WebElement password;
    @FindBy(xpath ="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
    private WebElement loginButtton;

    public void  login()
    {
        username.sendKeys("tester");
        password.sendKeys("test");
        loginButtton.click();
    }




}

