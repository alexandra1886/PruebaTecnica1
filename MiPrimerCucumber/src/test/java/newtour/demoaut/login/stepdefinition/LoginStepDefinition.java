package newtour.demoaut.login.stepdefinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	
	WebDriver Driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdrive.chrome.driver", "/MiPrimerCucumber/chromedriver.exe");
		
		Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		
				
	}
		
	
	@Given("se debe montrar la URL correcta y el boton inicio de sesion")
		public void seDebeMontrarLaURLCorrectaYElBotonInicioDeSesion() {
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.get("https://www.advantageonlineshopping.com/#/");
		Driver.findElement(By.id("menuUser")).click();
	    Driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
	    Driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*String ActualTitle = Driver.getTitle();
		String ExpectedTitle = " Advantage Shopping";
		System.out.print(ExpectedTitle);
		System.out.print(ActualTitle);
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		*/
		
		
	}

	@When("se debe registrar el usuario")
	public void seDebeIngresarUsuarioYContrasena() {
	   
		   Driver.findElement(By.name("usernameRegisterPage")).click();
		   Driver.findElement(By.name("usernameRegisterPage")).sendKeys("saenz123");
		   Driver.findElement(By.name("emailRegisterPage")).clear();
		   Driver.findElement(By.name("emailRegisterPage")).sendKeys("easuv@hotmail.com");
		   Driver.findElement(By.name("passwordRegisterPage")).clear();
		   Driver.findElement(By.name("passwordRegisterPage")).sendKeys("DEenz123");
		   Driver.findElement(By.name("confirm_passwordRegisterPage")).clear();
		   Driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("DEenz123");
		   Driver.findElement(By.name("first_nameRegisterPage")).click();
		   Driver.findElement(By.name("first_nameRegisterPage")).clear();
		   Driver.findElement(By.name("first_nameRegisterPage")).sendKeys("yury");
		   Driver.findElement(By.name("last_nameRegisterPage")).clear();
		   Driver.findElement(By.name("last_nameRegisterPage")).sendKeys("herrera");
		   Driver.findElement(By.name("phone_numberRegisterPage")).clear();
		   Driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3145267365");
		   Driver.findElement(By.name("countryListboxRegisterPage")).click();
		   //new Select(driver.findElement(By.name("countryListboxRegisterPage"))).selectByVisibleText("Colombia");
		   Driver.findElement(By.name("countryListboxRegisterPage")).click();
		   Driver.findElement(By.name("cityRegisterPage")).click();
		   Driver.findElement(By.name("cityRegisterPage")).clear();
		   Driver.findElement(By.name("cityRegisterPage")).sendKeys("Bogota");
		   Driver.findElement(By.name("addressRegisterPage")).click();
		   Driver.findElement(By.name("addressRegisterPage")).clear();
		   Driver.findElement(By.name("addressRegisterPage")).sendKeys("calle 100");
		   Driver.findElement(By.name("i_agree")).click();
		   Driver.findElement(By.id("register_btnundefined")).click();
		   Driver.close();
		  
			
	}
	
	
	@Then("al dar clic en el boton ok debe cerrar la pagina")
	public void alDarClicEnElBotonOkDebeIngresarALaUrl() {
		
		
	}
	
	@Given("se debe ingresar a la URL")
	public void ingresamosALaUrl() {
		
		 Driver.get("https://www.advantageonlineshopping.com/#/");
		 Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Driver.findElement(By.id("menuUser")).click();
		    Driver.findElement(By.name("username")).click();
		  
		    Driver.findElement(By.name("username")).clear();
		    Driver.findElement(By.name("username")).sendKeys("alexandra154");
		    Driver.findElement(By.name("password")).clear();
		    Driver.findElement(By.name("password")).sendKeys("SAenz123");
		    Driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		    Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
	
	
	
}
	@When("seleccionamos producto")
	public void seleccionamosProducto() {
		 Driver.get("https://www.advantageonlineshopping.com/#/category/Tablets/3");
		    Driver.findElement(By.id("16")).click();
		    Driver.findElement(By.name("save_to_cart")).click();
		    Driver.findElement(By.id("checkOutPopUp")).click();
		    Driver.findElement(By.id("next_btn")).click();
	}
		    @Then("cerramos la pag")
			public void cerramosPagina() {
		    	Driver.close();
		
		
}}
