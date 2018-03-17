package com.maxsoft.mobileautomation.android.stepdefinitions;

import com.maxsoft.mobileautomation.android.pages.WelcomeFlowPage;
import com.maxsoft.mobileautomation.android.util.DriverSetup;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


/**
 * Created by Osanda on 4/29/2017.
 */


public class WelcomeFlowPageStepDefinitions {

    private WelcomeFlowPage welcomeFlowPage = PageFactory.initElements(DriverSetup.androidDriver, WelcomeFlowPage.class);

    @Step("Tap on Skip button")
    public void tapSkipButton() throws IOException {
        welcomeFlowPage.tapSkipButton();
    }

    @Step("Tap on Got It button")
    public void tapGotItButton() throws IOException {
        welcomeFlowPage.tapGotItButton();
    }


}
