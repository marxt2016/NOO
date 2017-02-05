package application.pages;

import core.driver.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Olga_Melnikova on 01.02.2017.
 */
public abstract class AbstractScreen {
    public AbstractScreen(){
        PageFactory.initElements(Driver.getInstance(),  this);
    }
}
