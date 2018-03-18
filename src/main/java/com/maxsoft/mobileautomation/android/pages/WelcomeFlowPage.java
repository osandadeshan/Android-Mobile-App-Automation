package com.maxsoft.mobileautomation.android.pages;

import com.maxsoft.mobileautomation.android.common.Base;
import com.maxsoft.mobileautomation.android.util.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


/**
 * Created by Osanda on 5/14/2017.
 */


public class WelcomeFlowPage extends Base {

    @FindBy(id = "com.pearsoned.smartflashcards:id/button_skip")
    private WebElement BTN_SKIP;
    @FindBy(id = "com.pearsoned.smartflashcards:id/button_next")
    private WebElement BTN_NEXT;
    @FindBy(id = "com.pearsoned.smartflashcards:id/textView_gotIt")
    private WebElement BTN_GOT_IT;

    public WelcomeFlowPage() {
        PageFactory.initElements(DriverSetup.androidDriver, this);
    }

    public void tapSkipButton() throws IOException {
        tap(BTN_SKIP);
    }

    public void tapNextButton() throws IOException {
        tap(BTN_NEXT);
    }

    public void tapGotItButton() throws IOException {
        tap(BTN_GOT_IT);
    }


}
