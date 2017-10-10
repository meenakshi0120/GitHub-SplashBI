package com.eis.splashbi.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
	
	public void valuesSlectingHavingDevTag(WebDriver driver){
		String actual = "Benefits Oracle E-Business Suite : Benefits";
        List<WebElement> element = driver.findElements(By.xpath(".//*[@id='avail1-top']/div"));
        System.out.println(element.size());
        int k =1;
        boolean loop = true;
        for(WebElement we : element){
        	if(loop) {
    		     if (we.getAttribute("title").replace("\n", " ").equals(actual)){
    		    	System.out.println(we.getAttribute("title").replace("\n", " "));
       		        driver.findElement(By.xpath(".//*[@id='avail1-top']/div["+k+"]/a")).click();
       		        loop = false;
       		        break;
				}
                	
			}
                k++;
        }       
	}
}
