package com.maxsoft.mobileautomation.android.common;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.maxsoft.mobileautomation.android.common.Base;
import com.maxsoft.mobileautomation.android.util.DriverSetup;
import com.maxsoft.mobileautomation.android.util.ToastMessage;
import java.io.IOException;
import java.util.List;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CommonStepDefinitions {

    @FindBy(id = "com.pearsoned.smartflashcards:id/toolbar")
    public WebElement TOOL_BAR;

    private Base baseObj = new Base();

    @Step("Testing platform information")
    public void platformInfo(){
        Gauge.writeMessage("Targeted Platform: Android");
        Gauge.writeMessage("Targeted Android Version: v" + DriverSetup.ANDROID_VERSION);
        Gauge.writeMessage("Targeted Android Device: " + DriverSetup.ANDROID_DEVICE_NAME);
        Gauge.writeMessage("Targeted Android App Package Name: " + DriverSetup.ANDROID_APP_PACKAGE);
        Gauge.writeMessage("Targeted Appium Host: " + DriverSetup.APPIUM_HOST);
        Gauge.writeMessage("Targeted Appium Port: " + DriverSetup.APPIUM_PORT);
    }

    @Step("Launch the application")
    public void openApp() throws IOException {
        DriverSetup.setupDriver();
    }

    @Step("Verify that the toast message is <toastMessage>")
    public void verifyToastMessage(String toastMessage) throws Exception {
        //Assert.assertTrue(ToastMessage.getToastMessage().contains(toastMessage), "Invalid Toast Message");
        Assert.assertEquals(ToastMessage.getToastMessageContent(), toastMessage, "Invalid toast message!");
    }

    @Step("Wait <seconds> seconds")
    public void wait(int seconds) throws Exception {
       Thread.sleep(seconds*1000);
    }

    @Step("Verify that the page title is <pageTitle>")
    public void verifyPageTitle(String pageTitle) throws IOException {
        baseObj.isElementAccessibilityIdTextEquals(TOOL_BAR, pageTitle);
    }

    @Step("Swipe the device screen horizontally right to left")
    public void swipeRightToLeftHorizontally() throws InterruptedException {
        baseObj.swipeRightToLeftHorizontally();
    }

    @Step("Swipe the device screen horizontally left to right")
    public void swipeLeftToRightHorizontally() throws InterruptedException {
        baseObj.swipeLeftToRightHorizontally();
    }

    @Step("Swipe the device screen vertically top to bottom")
    public void swipeTopToBottomVertically() throws InterruptedException {
        baseObj.swipeTopToBottomVertically();
    }

    @Step("Swipe the device screen vertically bottom to top")
    public void swipeBottomToTopVertically() throws InterruptedException {
        baseObj.swipeBottomToTopVertically();
    }

    @Step("Scroll down to the bottom of the screen")
    public void scrollDownToBottom() throws InterruptedException {
        baseObj.scrollDown();
    }

    @Step("Scroll to the text of <text>")
    public void scrollTo(String text) throws InterruptedException {
        baseObj.scrollTo(text);
    }

    @Step("Navigate back from the device")
    public void navigateBackFromDevice() throws InterruptedException {
        baseObj.navigateBackFromDevice();
    }

    @Step("Verify the webview contains <text>")
    public void isWebViewTextEquals(String text) throws InterruptedException {
        baseObj.isWebViewTextEquals(text);
    }

    @Step("Verify the webview contains the following text <table>")
    public void isWebViewTextEquals(Table table) throws InterruptedException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            baseObj.isWebViewTextEquals(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Tap on <text>")
    public void tapOnVisibleText(String text){
        baseObj.scrollAndTap(text);
    }

    @Step("Press Enter button on the Keyboard")
    public void pressKeyboardEnter() {
        baseObj.pressKeyboardEnter();
    }

    @Step("Hide keyboard")
    public void hideKeyboard() {
        baseObj.hideKeyboard();
    }

    @Step("Show keyboard")
    public void showKeyboard() {
        baseObj.hideKeyboard();
    }

    @Step("Quit from the application")
    public void quit() {
        DriverSetup.tearDown();
    }


}