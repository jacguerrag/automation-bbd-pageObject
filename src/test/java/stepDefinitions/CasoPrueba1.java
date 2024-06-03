package stepDefinitions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PaginaDeProductos;
import pageObjects.PaginaDelCarrito;
import pageObjects.PaginaInicioSesion;

public class CasoPrueba1 {
	WebDriver driver;
	PaginaInicioSesion inicioSesion;
	PaginaDeProductos paginaDeProductos;
	PaginaDelCarrito  paginaDelCarrito;
	double totalEsperado = 0.0;
	String CHROME_DRIVER;
	String CHROME_BIN;
	

	@Before
	public void setUp() {
		CHROME_DRIVER = System.getenv("CHROME_DRIVER");
    	CHROME_BIN = System.getenv("CHROME_BIN");  
    	System.out.println("CHROME_BIN : "+CHROME_BIN);
    	System.out.println("CHROME_BIN : "+CHROME_DRIVER);
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
        
    	ChromeOptions options = new ChromeOptions();
    	options.setBinary(CHROME_BIN);
        driver = new ChromeDriver(options);
        inicioSesion = new PaginaInicioSesion(driver);
//        paginaDeProductos = new PaginaDeProductos(driver);
//        paginaDelCarrito = new PaginaDelCarrito(driver);
    	driver.manage().window().maximize();
		
	}
	
	@Given("el usuario esta en la pagina de productos")
	public void el_usuario_esta_en_la_pagina_de_productos() {
		inicioSesion.enterUserName("standard_user");
		inicioSesion.enterPassword("secret_sauce");
		inicioSesion.clickLoginButton();
		
	}
	@When("el usuario agrega el producto {string} al carrito")
	public void el_usuario_agrega_el_producto_al_carrito(String producto) {
		System.out.println("Producto : "+producto);
	}
	
	@And("el usuario navega a la pagina del carrito")
	public void el_usuario_navega_a_la_pagina_del_carrito() {
		
	}
	
	@Then("el total en el carrito debe ser la suma de los precios de los productos agregados")
	public void el_total_en_el_carrito_debe_ser_la_suma_de_los_precios_de_los_productos_agregados() {
		
	}
	
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
