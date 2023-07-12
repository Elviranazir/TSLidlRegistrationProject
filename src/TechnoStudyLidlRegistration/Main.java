package TechnoStudyLidlRegistration;

import MyMethods.MyMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lidl.com/register");
        WebElement firstName = driver.findElement(By.id("input0"));
        firstName.click();
        firstName.sendKeys("Elvira");
        WebElement lastName = driver.findElement(By.id("input1"));
        lastName.sendKeys("Nazir");
        WebElement email = driver.findElement(By.id ("input2"));
        email.sendKeys("elvira.nzr@gmail.com");
        WebElement confirmemail = driver.findElement(By.id("input3"));
        confirmemail.sendKeys("elvira.nzr@gmail.com");

        WebElement password = driver.findElement(By.id("input4"));
        password.sendKeys("Techno-B-8");



        WebElement phoneNumber =driver.findElement(By.id("input5"));
        phoneNumber.sendKeys("4044679532");
        WebElement zipcode = driver.findElement(By.id("input6"));
        zipcode.sendKeys("30004");
        WebElement birthday = driver.findElement(By.id("date-picker-dialog"));
        birthday.sendKeys("04/01/1995");
        WebElement adress = driver.findElement(By.id("input7"));
        adress.sendKeys("404 meadow forest ct");
        WebElement city = driver.findElement(By.id("input8"));
        city.sendKeys("Atlanta");
        WebElement state = driver.findElement(By.id("select0"));
        state.click();
        WebElement clickState = driver.findElement(By.id("select0"));
        Select select = new Select(clickState);
        select.selectByVisibleText("Georgia");
        clickState.click();
        WebElement element = driver.findElement(By.className("spinnie-container"));
        element.click();


        MyMethod.myWaight(5);
        driver.quit();
    }
}
