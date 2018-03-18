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


public class LoginPage extends Base {

    @FindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement LBL_LOGIN_PAGE_TITLE;
    @FindBy(id = "com.pearsoned.smartflashcards:id/editTextUserName")
    private WebElement TXT_USERNAME;
    @FindBy(id = "com.pearsoned.smartflashcards:id/editTextPassword")
    private WebElement TXT_PASSWORD;
    @FindBy(id = "com.pearsoned.smartflashcards:id/buttonSignIn")
    private WebElement BTN_SIGN_IN;
    @FindBy(id = "android:id/alertTitle")
    private WebElement ALERT_TITLE;
    @FindBy(id = "android:id/message")
    private WebElement ALERT_MESSAGE;
    @FindBy(id = "android:id/button1")
    private WebElement BTN_ALERT_OK;
    @FindBy(id = "com.pearsoned.smartflashcards:id/buttonCreateAccount")
    private WebElement BTN_CREATE_ACCOUNT;
    @FindBy(id = "com.pearsoned.smartflashcards:id/toolbar")
    private WebElement TOOL_BAR;
    @FindBy(id = "com.pearsoned.smartflashcards:id/button_skip")
    private WebElement BTN_WELCOME_SKIP;
    @FindBy(id = "com.pearsoned.smartflashcards:id/textView_gotIt")
    private WebElement BTN_GOT_IT;

    private static final String CREATE_ACCOUNT_BUTTON_LABEL = "Create Account";

    public LoginPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public void isLoginPageTitleEquals(String pageTitle) throws IOException {
        isPageTitleEquals(LBL_LOGIN_PAGE_TITLE, pageTitle);
    }

    public void login(String username, String password) throws IOException {
        setTextAs(TXT_USERNAME, username);
        setTextAs(TXT_PASSWORD, password);
    }

    public void tapSignInButton() throws IOException {
        tap(BTN_SIGN_IN);
    }

    public void clearTextFields() throws IOException {
        clearText(TXT_USERNAME);
        clearText(TXT_PASSWORD);
    }

    public void skipWelcomeFlow() throws IOException {
        tap(BTN_WELCOME_SKIP);
    }

    public void tapGotItButton() throws IOException {
        tap(BTN_GOT_IT);
    }

    public void isLandingPageTitleEquals(String pageTitle) throws IOException {
        isPageTitleEquals(TOOL_BAR, pageTitle);
    }

    public void isLoginErrorAlertTitleEquals(String loginErrorAlertTitle) throws IOException {
        isElementNameEquals(ALERT_TITLE, loginErrorAlertTitle);
    }

    public void isLoginErrorAlertMessageEquals(String loginErrorAlertMessage) throws IOException {
        isElementNameEquals(ALERT_MESSAGE, loginErrorAlertMessage);
    }

    public void tapLoginErrorAlertOkButton() throws IOException {
        tap(BTN_ALERT_OK);
    }

    public void navigateToCreateAccount() throws IOException {
        tap(BTN_CREATE_ACCOUNT);
    }

    public void isCreateAccountButtonVisible() throws IOException {
        isElementTextEquals(BTN_CREATE_ACCOUNT, CREATE_ACCOUNT_BUTTON_LABEL);
    }


}
