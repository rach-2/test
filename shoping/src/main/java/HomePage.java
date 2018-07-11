import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
{
     @FindBy(xpath = "//*[@id=\"search_query_top\"]")
      private  WebElement searcBar;
}
