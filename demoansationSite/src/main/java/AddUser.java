import  org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddUser
{
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
   private WebElement username;
    @FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
    private WebElement password;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
    private WebElement saveButton;
    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
    private WebElement loginLink;


    public void addUser(String userName, String ussrPassword)
    {
        username.sendKeys(userName);
        password.sendKeys(ussrPassword);
        saveButton.click();
        loginLink.click();
    }

}
