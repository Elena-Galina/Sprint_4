package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Всплывающее окно подтверждения/отклонения "Хотите оформить заказ"
public class ModalWindow {
    private final WebDriver driver;
    // локатор кнопки "Да"
    private final By YesButton = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public ModalWindow(WebDriver driver) {
        this.driver = driver;
    }
    // клик по кнопке "Да"
    public void clickYesButton() {
        driver.findElement(YesButton).click();
    }
 }