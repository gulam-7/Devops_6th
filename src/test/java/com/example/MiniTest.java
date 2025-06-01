package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniTest {
    public void simpleTest(){
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://www.google.com");
            System.out.println("Successfully Opened:" + driver.getTitle());
        }
        finally{
            driver.quit();
        }
    }
    
}
