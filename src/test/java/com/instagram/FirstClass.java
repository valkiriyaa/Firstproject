package com.instagram;

import javafx.scene.control.Tab;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import sun.awt.SunHints;

import java.awt.*;

public class FirstClass extends WebDriverSettings{
    WebElement popupWin = null;
    @Test
    public void firstTest() {
        try {
            driver.get("https://www.instagram.com/");
            WebElement elName = null;
            WebElement setLogin = null;
            WebElement passVal = null;
            //String title = driver.getTitle();
            //Assert.assertTrue(title.equals("Instagram"));
            //Actions builder = new Actions(driver);
            Thread.sleep(1000);
            elName = driver.findElementByXPath("//a[text()='Вход']");
            elName.click();
            Thread.sleep(2000);

            setLogin = driver.findElementByXPath("//input[@aria-label=\"Номер телефона, имя пользователя или эл. адрес\"]");
            setLogin.sendKeys("valkiriya__");
            passVal = driver.findElement(By.xpath("//input[@aria-label=\"Пароль\"]"));
            passVal.sendKeys("Pцукер");
            driver.findElementByXPath("//button[@class='sqdOP  L3NKy   y3zKF     ']").click();
            Thread.sleep(2000);

            //Закрытие всплывающего окна. Как сделать проверку на наличие этого окна??
            driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']")).click();



        }catch(Exception e){
            System.out.println(e);
        }
    }
    /*
    public boolean hasPopupWin() {
        System.out.println("метод boolean");
        popupWin = driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']"));
        return true;
    }
    public void secondTest() {
        System.out.println(hasPopupWin());
        if(hasPopupWin()) {
            popupWin.click();
        }
    }
    */

}
