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


public class NavigationBar extends Base {

    @FindBy(id = "com.pearsoned.smartflashcards:id/navigationExpertDecks")
    public WebElement BTN_EXPERTDECK;
    @FindBy(id = "com.pearsoned.smartflashcards:id/navigationMyDecks")
    public WebElement BTN_MYDECK;
    @FindBy(id = "com.pearsoned.smartflashcards:id/navigationArchived")
    public WebElement BTN_ARCHIVED;
    @FindBy(id = "com.pearsoned.smartflashcards:id/navigationSettings")
    public WebElement BTN_SETTINGS;

    public NavigationBar() {
        PageFactory.initElements(DriverSetup.androidDriver, this);
    }

    public void navigateToExpertDeckPage() throws IOException {
        tap(BTN_EXPERTDECK);
    }

    public void navigateToMyDeckPage() throws IOException {
        tap(BTN_MYDECK);
    }

    public void navigateToArchivedPage() throws IOException {
        tap(BTN_ARCHIVED);
    }

    public void navigateToSettingsPage() throws IOException {
        tap(BTN_SETTINGS);
    }


}
