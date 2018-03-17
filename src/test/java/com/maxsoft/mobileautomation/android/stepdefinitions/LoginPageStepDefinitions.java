package com.maxsoft.mobileautomation.android.stepdefinitions;

import com.maxsoft.mobileautomation.android.pages.LoginPage;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import java.util.List;
import static com.maxsoft.mobileautomation.android.util.DriverSetup.androidDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class LoginPageStepDefinitions {

    private LoginPage loginPage = PageFactory.initElements(androidDriver, LoginPage.class);

    @Step("Login page title is <pageTitle>")
    public void isLoginPageTitleEquals(String pageTitle) throws IOException {
        loginPage.isLoginPageTitleEquals(pageTitle);
    }

    @Step("Set the username and the password <table>")
    public void login(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            loginPage.login(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)));
        }
    }

    @Step("Tap on Sign in button")
    public void tapSignInButton() throws IOException {
        loginPage.tapSignInButton();
    }

    @Step("Clear text fields in Login page")
    public void clearTextFields() throws IOException {
        loginPage.clearTextFields();
    }

    @Step("Create Account button should be visible")
    public void isCreateAccountButtonVisible() throws IOException {
        loginPage.isCreateAccountButtonVisible();
    }

    @Step("On Create Account Page")
    public void navigateToCreateAccount() throws IOException {
        loginPage.navigateToCreateAccount();
    }

    @Step("Login error alert title is <loginErrorAlertTitle>")
    public void isLoginErrorAlertTitleEquals(String loginErrorAlertTitle) throws IOException {
        loginPage.isLoginErrorAlertTitleEquals(loginErrorAlertTitle);
    }

    @Step("Login error alert message is <loginErrorAlertMessage>")
    public void isLoginErrorAlertMessageEquals(String loginErrorAlertMessage) throws IOException {
        loginPage.isLoginErrorAlertMessageEquals(loginErrorAlertMessage);
    }

    @Step("Tap on Ok button in the login error alert")
    public void tapLoginErrorAlertOkButton() throws IOException {
        loginPage.tapLoginErrorAlertOkButton();
    }

    @Step("User lands to the <pageTitle> page")
    public void isLandingPageEquals(String pageTitle) throws IOException {
        loginPage.isLandingPageTitleEquals(pageTitle);
    }


}
