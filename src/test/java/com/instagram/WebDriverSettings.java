package com.instagram;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Дарья/Desktop/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("start");
    }
 //   @After
 //   public void close() {
   //     driver.quit();
   //     System.out.println("finish");
  //  }
}
