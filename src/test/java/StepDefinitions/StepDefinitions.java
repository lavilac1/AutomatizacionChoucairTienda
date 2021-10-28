package StepDefinitions;

import Functions.CreateDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    private static Properties prop = new Properties();
    private static InputStream in = CreateDriver.class.getResourceAsStream("../test.properties");


    WebDriver driver;
    /** Inicializo el log **/
    private static Logger log = Logger.getLogger(StepDefinitions.class);


    public  StepDefinitions(){
        driver= Hooks.driver;
    }


    @Given("^I go to site (.*)")
    public void Igotosite(String URL)  {
        log.info("Navigate to: " + URL);
        driver.get(URL);
    }


    @Given("abrir pagina de la tienda")
    public void abrirPaginaDeLaTienda() throws IOException {
        prop.load(in);
        String url = prop.getProperty("MainAppUrlBase");
        log.info("Navigate to: " + url);
        driver.get(url);
    }

    @When("Ingresar texto {}")
    public void ingresarTextoSearch(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("search_query_top"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("Presionar boton lupa")
    public void presionarBotonLupa() {
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
    }

    @Then("El resultado debe ser {}")
    public void elResultadoDebeSerResultado(String resultado) {
        driver.getPageSource().contains("resultado");
        driver.close();

    }

    @When("clic en contact us")
    public void clicEnContactUs() {
        WebElement searchButton = driver.findElement(By.id("contact-link"));
        searchButton.click();
    }

    @And("seleccionar en Subject Heading {}")
    public void seleccionarEnSubjectHeadingKeyswords(String resultado) {
        Select drpCountry = new Select (driver.findElement(By.id("id_contact")));
        drpCountry.selectByValue(resultado);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar Email {}")
    public void ingresarEmailEmail(String texto ) {
        WebElement locationTextBox = driver.findElement(By.id("email"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar Order {}")
    public void ingresarOrderOrder(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("id_order"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar un mensaje {}")
    public void ingresarUnMensajeMessage(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("message"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("clic en sign in")
    public void clicEnSignIn() {
        WebElement signbutton = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signbutton.click();
    }

    @And("clic en create an account")
    public void clicEnCreateAnAccount() {
        WebElement account = driver.findElement(By.id("SubmitCreate"));
        account.click();
    }

    @And("Sleccionar title")
    public void sleccionarTitle() {
        WebElement radio1 = driver.findElement(By.id("id_gender2"));
        radio1.click();
    }

    @And("ingresar un nombre {}")
    public void ingresarUnNombreNombre(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("customer_firstname"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar un apellido {}")
    public void ingresarUnApellidoApellido(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("customer_lastname"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar un password {}")
    public void ingresarUnPasswordPassword(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("passwd"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar día nacimiento {}")
    public void ingresarDíaNacimientoDia(String valor) {
        Select drpCountry = new Select (driver.findElement(By.id("days")));
        drpCountry.selectByValue(valor);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar mes nacimiento {}")
    public void ingresarMesNacimientoMes(String valor) {
        Select drpCountry = new Select (driver.findElement(By.id("months")));
        drpCountry.selectByValue(valor);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar año nacimiento {}")
    public void ingresarAñoNacimientoAno(String valor) {
        Select drpCountry = new Select (driver.findElement(By.id("years")));
        drpCountry.selectByValue(valor);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar capañia {}")
    public void ingresarCapañiaCompania(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("company"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar direccion {}")
    public void ingresarDireccionDireccion(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("address1"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar ciudad {}")
    public void ingresarCiudadCiudad(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("city"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("seleccionar estado {}")
    public void seleccionarEstadoEstado(String valor) {
        Select drpCountry = new Select (driver.findElement(By.id("id_state")));
        drpCountry.selectByValue(valor);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar codigo postal {}")
    public void ingresarCodigoPostalPostal(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("postcode"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar informacion adicional {}")
    public void ingresarInformacionAdicionalAdicional(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("other"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar telefono casa {}")
    public void ingresarTelefonoCasaTel(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("phone"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar celular {}")
    public void ingresarCelularCel(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("phone_mobile"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("limpiar alias")
    public void limpiarAlias() {
        WebElement alias = driver.findElement(By.id("alias"));
        alias.clear();
    }

    @And("ingresar alias {}")
    public void ingresarAliasAlias(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("alias"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("clic en registrar")
    public void clicEnRegistrar() {
        WebElement account = driver.findElement(By.id("submitAccount"));
        account.click();
    }

    @And("ingresar registro email {}")
    public void ingresarregistroemail(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("email_create"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar correo {}")
    public void ingresarCorreoEmail(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("email"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("ingresar contraseña {}")
    public void ingresarContraseñaOrder(String texto) {
        WebElement locationTextBox = driver.findElement(By.id("passwd"));
        locationTextBox.sendKeys(texto);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("clic en el botonsign in")
    public void clicEnElBotonsignIn() {
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();
    }

    @And("clic en historial de ordenes")
    public void clicEnHistorialDeOrdenes() {
        WebElement link = driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]"));
        link.click();
    }

    @And("clic en historial creditos")
    public void clicEnHistorialCreditos() {
        WebElement link = driver.findElement(By.className("icon-ban-circle"));
        link.click();
    }

    @And("clic en mis direcciones")
    public void clicEnMisDirecciones() {
        WebElement link = driver.findElement(By.xpath("//span[contains(text(),'My addresses')]"));
        link.click();
    }

    @And("clic en mi informacion")
    public void clicEnMiInformacion() {
        WebElement link = driver.findElement(By.xpath("//span[contains(text(),'My personal information')]"));
        link.click();
    }

    @And("clic en mi lista")
    public void clicEnMiLista() {
        WebElement link = driver.findElement(By.xpath("//span[contains(text(),'My wishlists')]"));
        link.click();
    }

    @And("clic en regresar")
    public void clicEnRegresar() {
        WebElement link = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[1]/a[2]"));
        link.click();

    }
}
