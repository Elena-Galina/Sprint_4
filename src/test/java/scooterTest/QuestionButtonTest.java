package scooterTest;

import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import static org.junit.Assert.assertTrue;

// Задание 1
public class QuestionButtonTest extends BeforeAfterTest{

    @Test //тест проверяет появление элемента 1-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickFirstQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstQuestionButton();
        boolean isDisplayed = mainPage.checkFirstQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 1-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfFirstQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedFirstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        mainPage.clickFirstQuestionButton();
        mainPage.getAnswerFirstQuestion();
        Assert.assertEquals(expectedFirstAnswer, mainPage.getAnswerFirstQuestion());
    }
    @Test //тест проверяет появление элемента 2-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickSecondQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSecondQuestionButton();
        boolean isDisplayed = mainPage.checkSecondQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 2-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfSecondQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        mainPage.clickSecondQuestionButton();
        mainPage.getAnswerSecondQuestion();
        Assert.assertEquals(expectedSecondAnswer, mainPage.getAnswerSecondQuestion());
    }
    @Test //тест проверяет появление элемента 3-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickThirdQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickThirdQuestionButton();
        boolean isDisplayed = mainPage.checkThirdQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 3-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfThirdQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        mainPage.clickThirdQuestionButton();
        mainPage.getAnswerThirdQuestion();
        Assert.assertEquals(expectedThirdAnswer, mainPage.getAnswerThirdQuestion());
    }
    @Test //тест проверяет появление элемента 4-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickFourthQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFourthQuestionButton();
        boolean isDisplayed = mainPage.checkFourthQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 4-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfFourthQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        mainPage.clickFourthQuestionButton();
        mainPage.getAnswerFourthQuestion();
        Assert.assertEquals(expectedFourthAnswer, mainPage.getAnswerFourthQuestion());
    }
    @Test //тест проверяет появление элемента 5-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickFifthQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFifthQuestionButton();
        boolean isDisplayed = mainPage.checkFifthQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 5-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfFifthQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        mainPage.clickFifthQuestionButton();
        mainPage.getAnswerFifthQuestion();
        Assert.assertEquals(expectedFifthAnswer, mainPage.getAnswerFifthQuestion());
    }
    @Test //тест проверяет появление элемента 6-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickSixthQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSixthQuestionButton();
        boolean isDisplayed = mainPage.checkSixthQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 6-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfSixthQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedSixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        mainPage.clickSixthQuestionButton();
        mainPage.getAnswerSixthQuestion();
        Assert.assertEquals(expectedSixthAnswer, mainPage.getAnswerSixthQuestion());
    }
    @Test //тест проверяет появление элемента 7-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickSeventhQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSeventhQuestionButton();
        boolean isDisplayed = mainPage.checkSeventhQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 7-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfSeventhQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedSeventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        mainPage.clickSeventhQuestionButton();
        mainPage.getAnswerSeventhQuestion();
        Assert.assertEquals(expectedSeventhAnswer, mainPage.getAnswerSeventhQuestion());
    }
    @Test //тест проверяет появление элемента 8-го выпадающего списка в разделе «Вопросы о важном» при нажатии на стрелочку
    public void clickEighthQuestionButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickEightQuestionButton();
        boolean isDisplayed = mainPage.checkEightQuestionButtonListDisplayed();
        assertTrue(isDisplayed);
    }
    @Test //тест проверяет появление элемента 8-го выпадающего списка с соответствующим тестом (в разделе «Вопросы о важном» при нажатии на стрелочку)
    public void checkListOfEightQuestionButton() {
        MainPage mainPage = new MainPage(driver);
        String expectedEighthAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        mainPage.clickEightQuestionButton();
        mainPage.getAnswerEightQuestion();
        Assert.assertEquals(expectedEighthAnswer, mainPage.getAnswerEightQuestion());
    }
}
