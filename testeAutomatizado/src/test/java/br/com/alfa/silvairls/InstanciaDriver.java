package br.com.alfa.silvairls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Silvair L. Sores on 04/05/19.
 */
public class InstanciaDriver {

    public static WebDriver getDriver() {

        WebDriver driver = null;

        final String OS = System.getProperty("os.name").toLowerCase();

        String urlDriver = OS.contains("win") ? "src/test/resources/chromedriver.exe" : "src/test/resources/chromedriver";

        System.setProperty("webdriver.chrome.driver", urlDriver);

        try{
            driver = new ChromeDriver();
        }catch (Exception e){
            System.out.println("Erro ao instanciar o driver");
        }

        return driver;

    }

}