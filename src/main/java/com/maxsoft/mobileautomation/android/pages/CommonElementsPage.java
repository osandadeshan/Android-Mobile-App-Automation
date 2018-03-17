package com.maxsoft.mobileautomation.android.pages;

import com.maxsoft.mobileautomation.android.common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static com.maxsoft.mobileautomation.android.util.DriverSetup.androidDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class CommonElementsPage extends Base {

    @FindBy(id = "com.pearsoned.smartflashcards:id/toolbar")
    public WebElement TOOL_BAR;

    public CommonElementsPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public void isPageTitleEquals(String pageTitle) throws IOException {
        isElementAccessibilityIdTextEquals(TOOL_BAR, pageTitle);
    }


}
