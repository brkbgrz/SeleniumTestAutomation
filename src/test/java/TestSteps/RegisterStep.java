package TestSteps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.UUID;

public class RegisterStep extends BaseStep {
    String uuid = UUID.randomUUID().toString();

    @Given("^a web browser is at the automationpractice home page$")
    public void aWebBrowserIsAtAutomationpracticeTheHomePage() throws Exception {
        geturl();
        checkUrlIsCurrent(PageUrl.mainUrl);

    }

    @When("^the user click sign in button$")
    public void theUserClickSignInButton() {
        findElementClick("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]",Pather.xPath);
    }

    @Then("^user sees the AUTHENTICATION page$")
    public void userSeesTheAUTHENTICATIONPage() throws Exception {
        checkUrlIsCurrent(PageUrl.loginUrl);
        waitElement(findElement("//*[@id=\"center_column\"]",Pather.xPath),TimeOut.LOW);
    }

    @And("^User enters account creation wrong email address$")
    public void userEntersAccountCreationWrongEmailAddress() {
        findElement("email_create",Pather.id).sendKeys("test@test112233");
    }

    @And("^click on create account button wrong scenario$")
    public void clickOnCreateAccountButtonWrongScenario() {
        findElementClick("//*[@id=\"SubmitCreate\"]",Pather.xPath);
    }

    @Then("^user sees the error message$")
    public void userSeesTheErrorMessage() {
        waitElement(findElement("create_account_error",Pather.id),TimeOut.LOW);
    }
    @And("^User enters account creation email address$")
    public void userEntersAccountCreationEmailAddress() {
        findElement("email_create",Pather.id).sendKeys("test@test112233.com");
    }

    @And("^click on create account button$")
    public void clickOnCreateAccountButton() {
        findElementClick("//*[@id=\"SubmitCreate\"]",Pather.xPath);
    }

    @Then("^user sees the create an account page$")
    public void userSeesTheCreateAnAccountPage() {
        waitElement(findElement("//*[@id=\"noSlide\"]",Pather.xPath),TimeOut.LOW);
    }

    @And("^user sees the personal information$")
    public void userSeesThePersonalInformation() {
        waitElement(findElement("customer_firstname",Pather.id),TimeOut.LOW);
    }

    @And("^user clicks title$")
    public void userClicksTitle() {
        findElementClick("//*[@id=\"uniform-id_gender1\"]",Pather.xPath);
    }

    @And("^user enters the First Name$")
    public void userEntersTheFirstName() {
        PageScrolldown();
        waitElement(findElement("customer_firstname",Pather.id),TimeOut.LOW);
        findElement("customer_firstname",Pather.id).sendKeys("Berke");
    }

    @And("^user enter the Last name$")
    public void userEnterTheLastName() {
        waitElement( findElement("customer_lastname",Pather.id),TimeOut.LOW);
        findElement("customer_lastname",Pather.id).sendKeys("Bagiroz");
    }

    @And("^user enters the Password$")
    public void userEntersThePassword() {
        waitElement( findElement("passwd",Pather.id),TimeOut.LOW);
        findElement("passwd",Pather.id).sendKeys("zaq12wsx");
    }

    @Then("^user sees the your adress$")
    public void userSeesTheYourAdress() {
        waitElement(findElement("//*[@id=\"account-creation_form\"]/div[2]",Pather.xPath),TimeOut.LOW);
    }

    @And("^user enters the First Name to adress$")
    public void userEntersTheFirstNameToAdress() {
        findElement("firstname",Pather.id).sendKeys("Berke");
    }

    @And("^user enters the Last Name to adress$")
    public void userEntersTheLastNameToAdress() {
        findElement("lastname",Pather.id).sendKeys("Bagiroz");

    }

    @And("^user enters the Address$")
    public void userEntersTheAddress() {
        findElement("address1",Pather.id).sendKeys("Test address1");
    }

    @And("^user enters the City$")
    public void userEntersTheCity() {
        findElement("city",Pather.id).sendKeys("Los Angeles");
    }


    @And("^user selects the State$")
    public void userSelectsTheState() {
        findElement("id_state",Pather.id).click();
        findElement("//*[@id=\"id_state\"]/option[6]",Pather.xPath).click();
    }

    @And("^user enters the Zip/Post Code$")
    public void userEntersTheZipPostCode() {
        findElement("postcode",Pather.id).sendKeys("34140");

    }

    @And("^user selects the Country$")
    public void userSelectsTheCountry() {
        findElement("id_country",Pather.id).click();
        //findElement("//*[@id=\"id_country\"]/option[2]",Pather.id).click();
    }

    @And("^user enters the Mobile Phone$")
    public void userEntersTheMobilePhone() {
        findElement("phone_mobile",Pather.id).sendKeys("905522281935");
    }

    @And("^user enters the City Assign an address alias for future reference\\.$")
    public void userEntersTheCityAssignAnAddressAliasForFutureReference() {
        waitElement(findElement("alias",Pather.id),TimeOut.LOW);
    }

    @And("^user click register button$")
    public void userClickRegisterButton() {
        findElement("submitAccount",Pather.id).click();
    }

    @Then("^user sees the My account page$")
    public void userSeesTheMyAccountPage() throws Exception {
        checkUrlIsCurrent(PageUrl.loginUrl);

    }

    @And("^user returns to homepage$")
    public void userReturnsToHomepage() {
        findElement("//*[@id=\"columns\"]/div[1]/a/i",Pather.xPath).click();
    }
    @Given("^User sees dresses category on home page$")
    public void userSeesDressesCategoryOnHomePage() throws Exception {
        checkUrlIsCurrent(PageUrl.mainUrl);
    }

    @When("^user clicks on dresses category and opens dropdown$")
    public void userClicksOnDressesCategoryAndOpensDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement("//*[@id=\"block_top_menu\"]/ul/li[2]/a", Pather.xPath)).build().perform();
    }

    @And("^User clicks on the subcategory summer dresses$")
    public void userClicksOnTheSubcategorySummerDresses() throws Exception {
        findElement("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a",Pather.xPath).click();
        checkUrlIsCurrent(PageUrl.productUrl);
    }

    @And("^user selects a product$")
    public void userSelectsAProduct() {
        waitElement(findElement("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div",Pather.xPath).click();

    }

    @And("^user adds product to cart$")
    public void userAddsProductToCart() {
        waitElement(findElement("add_to_cart",Pather.id),TimeOut.LOW);
        findElement("add_to_cart",Pather.id).click();
    }


    @And("^user clicks continue shopping button$")
    public void userClicksContinueShoppingButton() {

        findElement("//*[@id=\"header\"]/div[1]",Pather.xPath).click();
        //waitElement(findElement("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]",Pather.xPath),TimeOut.LOW);
        //findElement("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span[title()='Continue shopping']",Pather.xPath).click();
    }

    @Then("^user clicks search$")
    public void userClicksSearch() {
        findElement("//*[@id=\"search_query_top\"]",Pather.xPath).click();
    }

    @And("^The user types the word they want to search\\.$")
    public void theUserTypesTheWordTheyWantToSearch() {
        waitElement(findElement("//*[@id=\"search_query_top\"]",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"search_query_top\"]",Pather.xPath).sendKeys("summer");
    }

    @And("^user clicks the search button$")
    public void userClicksTheSearchButton() {
        waitElement(findElement("//*[@id=\"searchbox\"]/button",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"searchbox\"]/button",Pather.xPath).click();
        PageScrolldown();
    }
    @And("^user selects a productTwo$")
    public void userSelectsAProductTwo()  {
        findElement("//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div",Pather.xPath).click();

    }

    @And("^user adds productTwo to cart$")
    public void userAddsProductTwoToCart() {
        waitElement(findElement("//*[@id=\"add_to_cart\"]/button",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"add_to_cart\"]/button",Pather.xPath).click();
    }


    @And("^user clicks proceed to checkout button$")
    public void userClicksProceedToCheckoutButton() {
        waitElement(findElement("//*[@id=\"product\"]",Pather.xPath),TimeOut.LOW);
        driver.get("http://automationpractice.com/index.php?controller=order");

    }
    @Given("^a web browser is at the cart page$")
    public void aWebBrowserIsAtTheCartPage() throws Exception {
        checkUrlIsCurrent(PageUrl.cartUrl);
    }

    @When("^user checks for added products$")
    public void userChecksForAddedProducts() {

    }

    @And("^user checks the name of their added product$")
    public void userChecksTheNameOfTheirAddedProduct() {
    }

    @And("^user checks the number of products added$")
    public void userChecksTheNumberOfProductsAdded() {
    }

    @And("^user checks the price of their added products$")
    public void userChecksThePriceOfTheirAddedProducts() {
    }

    @And("^user clicks proceed the checkout button$")
    public void userClicksProceedTheCheckoutButton() {
        findElement("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]",Pather.xPath).click();
        PageScrolldown();
        PageScrolldown();
        PageScrolldown();
        waitElement(findElement("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]",Pather.xPath),TimeOut.LOW);

        //driver.get("http://automationpractice.com/index.php?controller=order&step=1");
    }

    @Then("^user sees address page$")
    public void userSeesAddressPage() throws Exception {

    }
    @And("^user clicks proceed the checkout buttonn$")
    public void userClicksProceedTheCheckoutButtonn() {
        PageScrolldown();
        PageScrolldown();
        waitElement(findElement("/html/body/div/div[2]/div/div[3]/div/form/p/button",Pather.xPath),TimeOut.LOW);
        findElement("/html/body/div/div[2]/div/div[3]/div/form/p/button",Pather.xPath).click();
    }

    @And("^user Choose a shipping option$")
    public void userChooseAShippingOption() {
    }

    @And("^user clicks terms of service checkbox$")
    public void userClicksTermsOfServiceCheckbox() {
        waitElement(findElement("cgv",Pather.id),TimeOut.LOW);
        findElement("cgv",Pather.id).click();

    }

    @And("^user clicks proceed the checkout buttonTwo$")
    public void userClicksProceedTheCheckoutButtonTwo() {

        waitElement(findElement("/html/body/div/div[2]/div/div[3]/div/div/form/p/buttont",Pather.xPath),TimeOut.LOW);
        findElement("/html/body/div/div[2]/div/div[3]/div/div/form/p/button",Pather.xPath).click();
        //driver.get("http://automationpractice.com/index.php?controller=order&multi-shipping=");
    }

    @And("^user choose any payment method$")
    public void userChooseAnyPaymentMethod() {
        PageScrolldown();
        waitElement(findElement("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a",Pather.xPath).click();
    }

    @And("^user clicks ı confirm my order button$")
    public void userClicksIConfirmMyOrderButton() {
        PageScrolldown();
        waitElement(findElement("//*[@id=\"cart_navigation\"]/button",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"cart_navigation\"]/button",Pather.xPath).click();
    }
    @Then("^user sees checkout result$")
    public void userSeesCheckoutResult(){
        Order.setResult(findElement("//*[@id=\"center_column\"]/div",Pather.xPath).getAttribute("value"));
    }
    @And("^user clicks on my user account$")
    public void userClicksOnMyUserAccount() {
        waitElement(findElement("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a",Pather.xPath),TimeOut.LOW);
        findElement("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a",Pather.xPath).click();
    }
    @Given("^a web browser is at the my account page$")
    public void aWebBrowserIsAtTheMyAccountPage() throws Exception {
        checkUrlIsCurrent(PageUrl.myAccountUrl);
    }

    @Then("^user clicks Order history and details button$")
    public void userClicksOrderHistoryAndDetailsButton() {
        findElement("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a",Pather.xPath).click();
        findElement("//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]",Pather.xPath).click();
        waitElement(findElement("//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]",Pather.xPath),TimeOut.LOW);
        driver.quit();
    }
    //@And("^user check order referance$")
    //  String orderReferance = findElement("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a",Pather.xPath).getAttribute("value");
    //  if(orderReferance!=null) {
    //   if (Order.getResult().contains(orderReferance)){
    //orderReferance İs Found
    //  }else {
    //     throw new Exception("Order Referance Is Not Found");
    //   }
    // }else {
    //     throw new Exception("Order Referance Is Not Found");
    //  }
    //  }

}
