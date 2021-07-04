package org.mouse.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebMouseAction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarav\\eclipse-workspace\\ChromeDrivers\\src\\org\\chromedrivers\\chromedriver.exe");
	WebDriver  mouseaction= new ChromeDriver();	
	mouseaction.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjwnPOEBhA0EiwA609ReX292HTrZHofjvPQqcqIiSb-kc6xtFtD9gu1oXuV_BQrjZnHuW7_TxoCzH0QAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwnPOEBhA0EiwA609ReX292HTrZHofjvPQqcqIiSb-kc6xtFtD9gu1oXuV_BQrjZnHuW7_TxoCzH0QAvD_BwE");
mouseaction.manage().window().maximize();

Actions s = new Actions(mouseaction);
	WebElement searchBar = mouseaction.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
searchBar.sendKeys("RealMe Moblies");

WebElement searchButton = mouseaction.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
Thread.sleep(3000);	
Robot r =new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	}
}
////*[@id="container"]/div/div[2]/div/div/div/div[1]/a[3]