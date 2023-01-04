package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class SuccesfulRegistrationPage {
    private final String TEXT = "Thank You for flying with us!";
    private final By SUCCESSFUL_TEXT = By.xpath(".//div[@class = 'finalTxt']");
    private BaseFunc baseFunc;

    public SuccesfulRegistrationPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public boolean isSuccessfulRegistrationTextAppears() {
        String textOnPage = baseFunc.findElement(SUCCESSFUL_TEXT).getText();
        return textOnPage.equals(TEXT);
    }
}
