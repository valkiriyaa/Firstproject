package com.instagram;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstClass extends WebDriverSettings{

    @Test
    public void firstTest() {
        driver.get("https://www.instagram.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Instagram"));

        //WebElement elName = driver.findElement(By.xpath("//div[@class='rgFsT ']//div[@class='gr27e']//div p[class='izU2O']"));
        WebElement elName = driver.findElement(By.xpath("//p[text='Есть аккаунт? ']"));
                ////div[@class='gr27e']//p[class='izU2O']")).findElement(By.tagName("a")
    }

}
