package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {

	FirefoxDriver driver;
		
		String iamneoUrl = "http://iamneo.ai";
		String facebookUrl = "https://www.facebook.com";

		public void invokeBrowser() {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SHYAD ANWAR\\OneDrive\\Desktop\\Driver\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();

			driver.manage().window().maximize();


			driver.get(iamneoUrl);


		}

		public void navigateCommands() {
			driver.navigate().to(facebookUrl);

			String currentUrl = driver.getCurrentUrl();
			driver.navigate().back();
			
			String urlFromwebpage = driver.getCurrentUrl();
			System.out.println(urlFromwebpage);
			

			driver.navigate().forward();

			driver.navigate().refresh();
		}

		public void closeBrowser(){
			driver.close();
			
		}

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
		ASpringappApplication selenium = new SpringappApplication();

			com.examly.springapp.invokeBrowser();
			com.examly.springapp.navigateCommands();
			com.examly.springapp.closeBrowser();
	}

}
