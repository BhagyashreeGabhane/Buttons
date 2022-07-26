package Jquary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/button/");
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//this button is having button tag WITGET
		d.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")).click();
		//d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//this button is having input tag WIDGET
		d.findElement(By.xpath("//input[@class='ui-button ui-corner-all ui-widget']")).click();
		
		//this button is having "a" tag  WIDGET
	    d.findElement(By.xpath("//a[@class='ui-button ui-corner-all ui-widget']")).click();
	   
	    //this button is having "button" tag css button
		d.findElement(By.xpath("//button[@class='ui-button ui-widget ui-corner-all']")).click();
		
		//this button is having "input" tag css button
		d.findElement(By.xpath("//input[@class='ui-button ui-widget ui-corner-all']")).click();
		
		//this button is having "a" tag css button
		d.findElement(By.xpath("//a[@class='ui-button ui-widget ui-corner-all']")).click();
				
	
				
	}

}
