package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Главная страница
public class MainPage {

    private final WebDriver driver;
    // локатор кнопки "Заказать" в заголовке
    private final By orderButtonHeader = By.className("Button_Button__ra12g");
    // локатор второй кнопки "Заказать" в блоке "Как это работает"
    private final By orderButtonSecond = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // локатор 1-го выпадающего списка в разделе "Вопросы о важном"
    private final By firstQuestionButton = By.id("accordion__heading-0");
    // локатор элемента 1-го выпадающего списка в разделе "Вопросы о важном"
    private final By firstQuestionButtonList = By.id("accordion__panel-0");
    //локатор текстового содержимого элемента 1-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerFirstQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-0']/p");
    // локатор 2-го выпадающего списка в разделе "Вопросы о важном"
    private final By secondQuestionButton = By.id("accordion__heading-1");
    // локатор элемента 2-го выпадающего списка в разделе "Вопросы о важном"
    private final By secondQuestionButtonList = By.id("accordion__panel-1");
    //локатор текстового содержимого элемента 2-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerSecondQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-1']/p");
    // локатор 3-го выпадающего списка в разделе "Вопросы о важном"
    private final By thirdQuestionButton = By.id("accordion__heading-2");
    // локатор элемента 3-го выпадающего списка в разделе "Вопросы о важном"
    private final By thirdQuestionButtonList = By.id("accordion__panel-2");
    //локатор текстового содержимого элемента 3-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerThirdQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-2']/p");
    // локатор 4-го выпадающего списка в разделе "Вопросы о важном"
    private final By fourthQuestionButton = By.id("accordion__heading-3");
    // локатор элемента 4-го выпадающего списка в разделе "Вопросы о важном"
    private final By fourthQuestionButtonList = By.id("accordion__panel-3");
    //локатор текстового содержимого элемента 4-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerFourthQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-3']/p");
    // локатор 5-го выпадающего списка в разделе "Вопросы о важном"
    private final By fifthQuestionButton = By.id("accordion__heading-4");
    // локатор элемента 5-го выпадающего списка в разделе "Вопросы о важном"
    private final By fifthQuestionButtonList = By.id("accordion__panel-4");
    //локатор текстового содержимого элемента 5-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerFifthQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-4']/p");
    // локатор 6-го выпадающего списка в разделе "Вопросы о важном"
    private final By sixthQuestionButton = By.id("accordion__heading-5");
    // локатор элемента 6-го выпадающего списка в разделе "Вопросы о важном"
    private final By sixthQuestionButtonList = By.id("accordion__panel-5");
    //локатор текстового содержимого элемента 6-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerSixthQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-5']/p");
    // локатор 7-го выпадающего списка в разделе "Вопросы о важном"
    private final By seventhQuestionButton = By.id("accordion__heading-6");
    // локатор элемента 7-го выпадающего списка в разделе "Вопросы о важном"
    private final By seventhQuestionButtonList = By.id("accordion__panel-6");
    //локатор текстового содержимого элемента 7-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerSeventhQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-6']/p");
    // локатор 8-го выпадающего списка в разделе "Вопросы о важном"
    private final By eightQuestionButton = By.id("accordion__heading-7");
    // локатор элемента 8-го выпадающего списка в разделе "Вопросы о важном"
    private final By eightQuestionButtonList = By.id("accordion__panel-7");
    //локатор текстового содержимого элемента 8-го выпадающего списка в разделе "Вопросы о важном"
    private final By answerEightQuestion = By.xpath(".//div[@class='accordion']/div/div[@id = 'accordion__panel-7']/p");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // клик по кнопке "Заказать" в заголовке
    public void clickOrderButtonHeader() {
        driver.findElement(orderButtonHeader).click();
    }

    // клик по второй кнопке «Заказать» в блоке "Как это работает"
    public void clickOrderButtonSecond() {
        WebElement element = driver.findElement(orderButtonSecond);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(orderButtonSecond).click();
    }

    // клик по 1му выпадающему списку в разделе "Вопросы о важном"
    public void clickFirstQuestionButton() {
        WebElement element = driver.findElement(firstQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(firstQuestionButton).click();
    }
    //метод проверяет видимость элемента 1-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkFirstQuestionButtonListDisplayed() {
        return driver.findElement(firstQuestionButtonList).isDisplayed();
    }
    public String getAnswerFirstQuestion() { //получение текста элемента 1-го выпадающего списка
       String answer = driver.findElement(answerFirstQuestion).getText();
        return answer;
    }
    // клик по 2му выпадающему списку в разделе "Вопросы о важном"
    public void clickSecondQuestionButton() {
        WebElement element = driver.findElement(secondQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(secondQuestionButton).click();
    }
    //метод проверяет видимость элемента 2-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkSecondQuestionButtonListDisplayed() {
        return driver.findElement(secondQuestionButtonList).isDisplayed();
    }
    public String getAnswerSecondQuestion() { //получение текста элемента 2-го выпадающего списка
        String answer = driver.findElement(answerSecondQuestion).getText();
        return answer;
    }
    // клик по 3му выпадающему списку в разделе "Вопросы о важном"
    public void clickThirdQuestionButton() {
        WebElement element = driver.findElement(thirdQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(thirdQuestionButton).click();
    }
    //метод проверяет видимость элемента 3-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkThirdQuestionButtonListDisplayed() {
        return driver.findElement(thirdQuestionButtonList).isDisplayed();
    }
    public String getAnswerThirdQuestion() { //получение текста элемента 3-го выпадающего списка
        String answer = driver.findElement(answerThirdQuestion).getText();
        return answer;
    }
    // клик по 4му выпадающему списку в разделе "Вопросы о важном"
    public void clickFourthQuestionButton() {
        WebElement element = driver.findElement(fourthQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(fourthQuestionButton).click();
    }
    //метод проверяет видимость элемента 4-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkFourthQuestionButtonListDisplayed() {
        return driver.findElement(fourthQuestionButtonList).isDisplayed();
    }
    public String getAnswerFourthQuestion() { //получение текста элемента 4-го выпадающего списка
        String answer = driver.findElement(answerFourthQuestion).getText();
        return answer;
    }
    // клик по 5му выпадающему списку в разделе "Вопросы о важном"
    public void clickFifthQuestionButton() {
        WebElement element = driver.findElement(fifthQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(fifthQuestionButton).click();
    }
    //метод проверяет видимость элемента 5-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkFifthQuestionButtonListDisplayed() {
        return driver.findElement(fifthQuestionButtonList).isDisplayed();
    }
    public String getAnswerFifthQuestion() { //получение текста элемента 5-го выпадающего списка
        String answer = driver.findElement(answerFifthQuestion).getText();
        return answer;
    }
    // клик по 6му выпадающему списку в разделе "Вопросы о важном"
    public void clickSixthQuestionButton() {
        WebElement element = driver.findElement(sixthQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(sixthQuestionButton).click();
    }
    //метод проверяет видимость элемента 6-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkSixthQuestionButtonListDisplayed() {
        return driver.findElement(sixthQuestionButtonList).isDisplayed();
    }
    public String getAnswerSixthQuestion() { //получение текста элемента 6-го выпадающего списка
        String answer = driver.findElement(answerSixthQuestion).getText();
        return answer;
    }
    // клик по 7му выпадающему списку в разделе "Вопросы о важном"
    public void clickSeventhQuestionButton() {
        WebElement element = driver.findElement(seventhQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(seventhQuestionButton).click();
    }
    //метод проверяет видимость элемента 7-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkSeventhQuestionButtonListDisplayed() {
        return driver.findElement(seventhQuestionButtonList).isDisplayed();
    }
    public String getAnswerSeventhQuestion() { //получение текста элемента 7-го выпадающего списка
        String answer = driver.findElement(answerSeventhQuestion).getText();
        return answer;
    }
    // клик по 8му выпадающему списку в разделе "Вопросы о важном"
    public void clickEightQuestionButton() {
        WebElement element = driver.findElement(eightQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(eightQuestionButton).click();
    }
    //метод проверяет видимость элемента 8-го выпадающего списка в разделе "Вопросы о важном"
    public boolean checkEightQuestionButtonListDisplayed() {
        return driver.findElement(eightQuestionButtonList).isDisplayed();
    }
    public String getAnswerEightQuestion() { //получение текста элемента 8-го выпадающего списка
        String answer = driver.findElement(answerEightQuestion).getText();
        return answer;
    }
}