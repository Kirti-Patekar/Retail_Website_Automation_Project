package stepDefinition;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;

public class RetailWebsiteStepDefinition {
	
	WebDriver driver = Hooks.driver;
	
	@Given("Admin is on Login page")
	public void admin_is_on_Login_page() {
	    try {
			driver.get("http://retailm1.upskills.in/admin/");
			Thread.sleep(500);
			String currentretUrl = driver.getCurrentUrl();
			//System.out.println(currentretUrl);
			if(currentretUrl.contains("http://retailm1.upskills.in/admin/index.php?route=sale/return&token=")) {
				System.out.println("Admin is able to load login page");
			}
			else {
				System.out.println("Admin is not able to load login page");
				Assert.fail();
			}
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to load login page"+ex);
		    Assert.fail();
		}
	    
	}
	
	@When("Admin enter username and password")
	public void admin_enter_username_and_password() {
	    try {
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to enter username and password"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on Login button")
	public void admin_clicks_on_Login_button() {
	    try {
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to clicks on Login button"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Admin is successfully logged in")
	public void verify_if_admin_is_successfully_logged_in() {
	   try {
			String currentUrl = driver.getCurrentUrl();
			//System.out.println(currentUrl);
			if(currentUrl.contains("http://retailm1.upskills.in/admin/index.php?route=common/dashboard&token")) {
				System.out.println("Admin is able login into the website");
			}
			else {
				System.out.println("Admin is not able login into the website");
			    Assert.fail();
			}
		}
		catch(Exception ex) {
			System.out.println("Admin is not able login into the website"+ex);
		    Assert.fail();
		}
	}

	@When("click on menu")
	public void click_on_menu() {
	    try {
	    	driver.findElement(By.id("button-menu")).click();
	    	Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to clcik on menu"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin clicks on Sales dropdown")
	public void admin_clicks_on_Sales_dropdown() {
	    try {
			driver.findElement(By.linkText("Sales")).click();
			Thread.sleep(500);
			//driver.findElement(By.xpath("//*[@id='menu-sale']/ul/li[3]/a")).click();
			//driver.findElement(By.xpath("//li[@id = 'menu-sale']//ul//li//a[contains(text(),'Returns')]")).click();
			//driver.findElement(By.xpath("//span[contains(text(),'sales')]")).click();
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to click on Sales dropdown"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin clicks on Return option")
	public void admin_clicks_on_Return_option() {
	    try {
			//driver.findElement(By.linkText("Returns")).click();
			//driver.findElement(By.xpath("('//li[@id='menu-sale']')[2]"))
			/*driver.navigate().to("http://retailm1.upskills.in/admin/index.php?route=sale/return&token");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();*/
			
	    	driver.findElement(By.xpath("//li[@id = 'menu-sale']/ul/li/a[contains(text(),'Returns')]")).click();
	    	Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to click on Return option"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin in on Product Return page")
	public void verify_if_Admin_in_on_Product_Return_page() {
	    try {
			String currentretUrl = driver.getCurrentUrl();
			//System.out.println(currentretUrl);
			if(currentretUrl.contains("http://retailm1.upskills.in/admin/index.php?route=sale/return&token")) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Admin is not able to navigate on Product Return page");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to navigate on Product Return page"+ex);
		    Assert.fail();
	    }
	}
	
	
	
	//*************************************************************ReturnID*************************************************************
	@Given("Admin is on Product Return Page")
	public void admin_is_on_Product_Return_Page() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			String currentretUrl = driver.getCurrentUrl();
			System.out.println(currentretUrl);
			if(currentretUrl.contains("http://retailm1.upskills.in/admin/index.php?route=sale/return&token")) {
				System.out.println("Admin is navigated to Product Return page");
			}
			else {
				System.out.println("Admin is not able to navigate on Product Return page");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to navigate on Product Return page"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin enter valid input {string} into ReturnID")
	public void admin_enter_valid_input_into_ReturnID(String  ValidReturnIDInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_return_id']")).sendKeys(ValidReturnIDInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into ReturnID"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin Clicks on filter button")
	public void admin_Clicks_on_filter_button() {
	    // Write code here that turns the phrase above into concrete actions
		try {
	    	driver.findElement(By.id("button-filter")).click();
	    	Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to click on filter button"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin is able to see record based on the given input {string} in ReturnID")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_ReturnID(String ValidReturnIDInput) {
		try {
			String tabledata = driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
			System.out.println(tabledata);
			Thread.sleep(500);
			if(tabledata.equals(ValidReturnIDInput)) {
				System.out.println("Admin is able to see record based on the given input in ReturnID");
			}
			else {
				System.out.println("Admin is not able to see record based on the given valid input in ReturnID");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to see record based on the given valid input in ReturnID"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin enter invalid input {string} into ReturnID")
	public void admin_enter_invalid_input_into_ReturnID(String InvalidReturnIDInput) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			driver.findElement(By.xpath("//input[@name='filter_return_id']")).clear();
			driver.findElement(By.xpath("//input[@name='filter_return_id']")).sendKeys(InvalidReturnIDInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into ReturnID"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin is not able to see any record")
	public void verify_if_Admin_is_not_able_to_see_any_record() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			String msg = driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),'No results')]")).getText();
			System.out.println(msg);
			Thread.sleep(500);
			if(msg.contains("No results")) {
				System.out.println("Admin is not able to see any record for invalid data");
			}
			else {
				System.out.println("Admin is able to see any record for invalid data");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is able to see any record for invalid data"+ex);
		    Assert.fail();
	    }
	}
	
	
	//*************************************************************OrderID*************************************************************
	@When("Admin enter valid input {string} into OrderID")
	public void admin_enter_valid_input_into_OrderID(String ValidOrderIDInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_order_id']")).sendKeys(ValidOrderIDInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into OrderID"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin is able to see record based on the given input {string} in OrderID")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_OrderID(String ValidOrderIDInput) {
		try {
			String tabledata = driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
			System.out.println(tabledata);
			Thread.sleep(500);
			if(tabledata.equals(ValidOrderIDInput)) {
				System.out.println("Admin is not able to see record based on the given valid input n OrderID");
			}
			else {
				System.out.println("Admin is not able to see record based on the given valid input n OrderID");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to see record based on the given valid input n OrderID"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin enter invalid input {string} into OrderID")
	public void admin_enter_invalid_input_into_OrderID(String InvalidOrderIDInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_order_id']")).clear();
			driver.findElement(By.xpath("//input[@name='filter_order_id']")).sendKeys(InvalidOrderIDInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into OrderID"+ex);
		    Assert.fail();
	    }
	}
	
	
	
	//*************************************************************CustomerName*************************************************************
	@When("Admin enter valid input {string} into CustomerName")
	public void admin_enter_valid_input_into_CustomerName(String ValidCustomerNameInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_customer']")).sendKeys(ValidCustomerNameInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into CustomerName"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin is able to see record based on the given input {string} in CustomerName")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_CustomerName(String ValidCustomerNameInput) {
		try {
			String tabledata = driver.findElement(By.xpath("//table/tbody/tr/td[4]")).getText();
			System.out.println(tabledata);
			Thread.sleep(500);
			if(tabledata.equals(ValidCustomerNameInput)) {
				System.out.println("Admin is able to see record based on the given valid input in CustomerName");
			}
			else {
				System.out.println("Admin is not able to see record based on the given valid input in CustomerName");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to see record based on the given valid input in CustomerName"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin enter invalid input {string} into CustomerName")
	public void admin_enter_invalid_input_into_CustomerName(String InvalidCustomerNameInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_customer']")).clear();
			driver.findElement(By.xpath("//input[@name='filter_customer']")).sendKeys(InvalidCustomerNameInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into CustomerName"+ex);
		    Assert.fail();
	    }
	}
	
	
	//*************************************************************ProductName*************************************************************
	@When("Admin enter valid input {string} into ProductName")
	public void admin_enter_valid_input_into_ProductName(String ValidProductNameInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_product']")).sendKeys(ValidProductNameInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into ProductName"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin is able to see record based on the given input {string} in ProductName")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_ProductName(String ValidProductNameInput) {
		try {
			String tabledata = driver.findElement(By.xpath("//table/tbody/tr/td[5]")).getText();
			System.out.println(tabledata);
			Thread.sleep(500);
			if(tabledata.equals(ValidProductNameInput)) {
				System.out.println("Admin is able to see record based on the given valid input in ProductName");
			}
			else {
				System.out.println("Admin is not able to see record based on the given valid input in ProductName");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to see record based on the given valid input in ProductName"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin enter invalid input {string} into ProductName")
	public void admin_enter_invalid_input_into_ProductName(String InvalidProductNameInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_product']")).clear();
			driver.findElement(By.xpath("//input[@name='filter_product']")).sendKeys(InvalidProductNameInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into ProductName"+ex);
		    Assert.fail();
	    }
	}
	
	
	//*************************************************************ModelName*************************************************************
	@When("Admin enter valid input {string} into ModelName")
	public void admin_enter_valid_input_into_ModelName(String ValidModelNameInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_model']")).sendKeys(ValidModelNameInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into ModelName"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if Admin is able to see record based on the given input {string} in ModelName")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_ModelName(String ValidModelNameInput) {
		try {
			String tabledata = driver.findElement(By.xpath("//table/tbody/tr/td[6]")).getText();
			System.out.println(tabledata);
			Thread.sleep(500);
			if(tabledata.equals(ValidModelNameInput)) {
				System.out.println("Admin is able to see record based on the given valid input in ModelName");
			}
			else {
				System.out.println("Admin is not able to see record based on the given valid input in ModelName");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to see record based on the given valid input in ModelName"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin enter invalid input {string} into ModelName")
	public void admin_enter_invalid_input_into_ModelName(String InvalidModelNameInput) {
		try {
			driver.findElement(By.xpath("//input[@name='filter_model']")).clear();
			driver.findElement(By.xpath("//input[@name='filter_model']")).sendKeys(InvalidModelNameInput);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter input into ModelName"+ex);
		    Assert.fail();
	    }
	}
	
	
	
	//*************************************************************ReturnStatus*************************************************************
	@When("Admin select one option {string} from the ReturnStatus dropdown")
	public void admin_select_one_option_from_the_ReturnStatus_dropdown(String ValidReturnStatusInput) {
		try {
			Select dropdown = new Select(driver.findElement(By.id("input-return-status")));
			dropdown.selectByVisibleText(ValidReturnStatusInput);
			Thread.sleep(500);
		}
		catch(Exception ex) {
	    	System.out.println("Admin is not able to select option from the ReturnStatus dropdown"+ex);
		    Assert.fail();
		}
		
	}

	@Then("Verify if Admin is able to see selected option {string} in ReturnStatus")
	public void verify_if_Admin_is_able_to_see_selected_option_in_ReturnStatus(String ValidReturnStatusInput) {
		try {
			Select select = new Select(driver.findElement(By.xpath("//select[@name='filter_return_status_id']")));
			WebElement option = select.getFirstSelectedOption();
			String retstatus = option.getText();
			System.out.println(retstatus);
			Thread.sleep(500);
			if(retstatus.equals(ValidReturnStatusInput)) {
				System.out.println("Admin is able to see selected option in ReturnStatus");
			}
			else {
				System.out.println("Admin is not able to see selected option in ReturnStatus");
			    Assert.fail();
			}
		}
		catch(Exception ex) {
	    	System.out.println("Admin is not able to see selected option in ReturnStatus"+ex);
		    Assert.fail();
		    }
	}

	@Then("Verify if Admin is able to see record based on the selected option {string} in ReturnStatus")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_selected_option_in_ReturnStatus(String ValidReturnStatusInput) {
		try {
			String tabledata = driver.findElement(By.xpath("//table/tbody/tr/td[7]")).getText();
			System.out.println(tabledata);
			Thread.sleep(500);
			if(tabledata.equals(ValidReturnStatusInput)) {
				System.out.println("Admin is able to see record based on the selected option in ReturnStatus");
			}
			else {
				System.out.println("Admin is not able to see record based on the selected option in ReturnStatus");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to see record based on the selected option in ReturnStatus"+ex);
		    Assert.fail();
	    }
	}
	
	@When("Admin enters intial of {string}")
	public void admin_enters_intial_of(String ValidReturnStatusInput) {
		try {
			WebElement testDropDown = driver.findElement(By.id("input-return-status"));  
			Select dropdown = new Select(testDropDown); 
			dropdown.selectByValue("*");  
			char i = ValidReturnStatusInput.charAt(0);
			String fchar= Character.toString(i);
		    System.out.println(i);
		    System.out.println(fchar);
		    driver.findElement(By.xpath("//select[@name='filter_return_status_id']")).sendKeys(fchar);
		    Thread.sleep(500);
		}
		catch(Exception ex){
			System.out.println("Admin is not able to enters intial "+ex);
		    Assert.fail();
		}
		
	    
	}

	@When("Clicks on enter button")
	public void clicks_on_enter_button() {
		try {
			driver.findElement(By.id("input-return-status")).sendKeys(Keys.ENTER);
			driver.findElement(By.id("input-return-status")).sendKeys(Keys.ENTER);
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to clicks on enter button");
		    Assert.fail();
		}
		
	}

	@Then("Verify if Admin is able to see selected option {string} in ReturnStatus if initial letter is entered")
	public void verify_if_Admin_is_able_to_see_selected_option_in_ReturnStatus_if_initial_letter_is_entered(String ValidReturnStatusInput) {
		try {
			Select select = new Select(driver.findElement(By.xpath("//select[@name='filter_return_status_id']")));
			WebElement option = select.getFirstSelectedOption();
			String retstatus = option.getText();
			System.out.println(retstatus);
			Thread.sleep(500);
			if(retstatus.equals(ValidReturnStatusInput)) {
				System.out.println("Admin is able to see selected option in ReturnStatus if initial letter is entered");
			}
			else {
				System.out.println("Admin is not able to see selected option in ReturnStatus if initial letter is entered");
			    Assert.fail();
			}
		}
		catch(Exception ex) {
	    	System.out.println("Admin is not able to see selected option in ReturnStatus if initial letter is entered"+ex);
		    Assert.fail();
		    }
	}
	
	
	
	//*************************************************************DateAdded*************************************************************
	@When("Admin enter valid input {string} in DateAdded field")
	public void admin_enter_valid_input_in_DateAdded_field(String ValidDateInput) {
		try{
			//System.out.println(ValidDateInput);
			driver.findElement(By.xpath("//input[@name='filter_date_added']")).sendKeys(ValidDateInput);
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to enter input in DateAdded field"+ex);
		    Assert.fail();
		}

	}

	@Then("Verify if Admin is able to see record based on the given input {string} in DateAdded field")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_DateAdded_field(String ValidDateInput) {
		try{
			
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr/td[8]")).getText();
			//System.out.println(str1); //dd/mm/yyyy
			String substr1 = str1.substring(6);
			//System.out.println(sub1str1);
			String substr2 = str1.substring(3,5);
			//System.out.println(sub2str1);
			String substr3 = str1.substring(0,2);
			//System.out.println(sub3str1);
			String date= substr1+"-"+substr2+"-"+substr3;
			Thread.sleep(500);
			System.out.println(date);
			System.out.println(ValidDateInput);
			if(date.equals(ValidDateInput)) {
				System.out.println("Pass");
			}
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to see record based on the given input in Date added field"+ex);
		    Assert.fail();
		}

	}

	@When("Admin enter invalid input {string} in DateAdded field")
	public void admin_enter_invalid_input_in_DateAdded_field(String InvalidDateInput) {
		try{
			//System.out.println(ValidDateInput);
			driver.findElement(By.xpath("//input[@name='filter_date_added']")).sendKeys(InvalidDateInput);
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to enter input in DateAdded field"+ex);
		    Assert.fail();
		}
	}

	
	//*************************************************************DateModified*************************************************************
	@When("Admin enter invalid input {string} in DateModified field")
	public void admin_enter_invalid_input_in_DateModified_field(String InvalidDateInput) {
		try{
			driver.findElement(By.xpath("//input[@name='filter_date_modified']")).sendKeys(InvalidDateInput);
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to enter input in DateModified field"+ex);
		    Assert.fail();
		}
		
	}

	@When("Admin enter valid input {string} in DateModified field")
	public void admin_enter_valid_input_in_DateModified_field(String ValidDateInput) {
		try{
			//System.out.println(ValidDateInput);
			driver.findElement(By.xpath("//input[@name='filter_date_modified']")).sendKeys(ValidDateInput);
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to enter input in DateModified field"+ex);
		    Assert.fail();
		}
		
	}

	@Then("Verify if Admin is able to see record based on the given input {string} in DateModified field")
	public void verify_if_Admin_is_able_to_see_record_based_on_the_given_input_in_DateModified_field(String ValidDateInput) {
		try{
			
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr/td[9]")).getText();
			//System.out.println(str1); //dd/mm/yyyy
			String substr1 = str1.substring(6);
			//System.out.println(sub1str1);
			String substr2 = str1.substring(3,5);
			//System.out.println(sub2str1);
			String substr3 = str1.substring(0,2);
			//System.out.println(sub3str1);
			String date= substr1+"-"+substr2+"-"+substr3;
			Thread.sleep(500);
			System.out.println(date);
			System.out.println(ValidDateInput);
			if(date.equals(ValidDateInput)) {
				System.out.println("Pass");
			}
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to see record based on the given input in DateModified field"+ex);
		    Assert.fail();
		}
		
	}

	
	//*************************************************************Checkbox*************************************************************
	@When("Admin clicks on the checkbox of a row {string}")
	public void admin_clicks_on_the_checkbox_of_a_row(String row) {
	    try {
	    	driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[1]/input")).click();
	    	Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Not able to click on" + row + "th checkbox" +ex);
			Assert.fail();
	    }
	}

	@Then("Verify if the checkbox of row {string} is checked")
	public void verify_if_the_checkbox_of_row_is_checked(String row) {
		try {
			boolean val= driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[1]/input")).isSelected();
			Thread.sleep(500);
			System.out.println(row + "th row " + val);
			if(val == true) {
				System.out.println(row + "th row checkbox is checked");
			}
	    }
	    catch(Exception ex) {
	    	System.out.println(row + "th row checkbox is not checked " +ex);
			Assert.fail();
	    }
	}

	@Then("Verify if the checkbox of row {string} is unchecked")
	public void verify_if_the_checkbox_of_row_is_unchecked(String row) {
		try {
			boolean val= driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[1]/input")).isSelected();
			System.out.println(row + "th row " + val);
			Thread.sleep(500);
			if(val == false) {
				System.out.println(row + "th row checkbox is unchecked");
			}
	    }
	    catch(Exception ex) {
	    	System.out.println(row + "th row checkbox is not unchecked " +ex);
			Assert.fail();
	    }
	}

	@When("Admin clicks on the checkbox of the table header")
	public void admin_clicks_on_the_checkbox_of_the_table_header() {
	    try {
	    	driver.findElement(By.xpath("//table/thead/tr/td[1]/input")).click();
	    	Thread.sleep(500);
	    	//System.out.println(driver.findElement(By.xpath("//table/thead/tr/td[1]/input")).isSelected());
	    }
	    catch(Exception ex) {
	    	System.out.println("Not able to click on checkbox" +ex);
			Assert.fail();
	    }
	}

	@Then("Verify if the checkboxes in every row is checked")
	public void verify_if_the_checkboxes_in_every_row_is_checked() {
	    try {
	    	List<WebElement> listOfElements = driver.findElements(By.xpath("//input[@name='selected[]']"));
	    	Thread.sleep(500);
	    	int size = listOfElements.size();
			int count = 0;
			for(int i=1 ; i <= listOfElements.size() ; i++) {
				
				boolean val= driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/input")).isSelected();
				System.out.println(val);
				if(val == true) {
					count++;
				}				
			}
			System.out.println(size);
			System.out.println(count);
			if(size == count) {
				System.out.println("All checkbox checked when clicked on table header checkbox");
			}
			else {
				System.out.println("Not all checkbox checked when clicked on table header checkbox");
				Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Not all checkbox checked when clicked on table header checkbox" +ex);
			Assert.fail();
	    }
	}
	
	
	
	
	//*************************************************************TableView*************************************************************
	@Then("Verify if admin is able to see all columns {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string} of the tabel")
	public void verify_if_admin_is_able_to_see_all_columns_and_of_the_tabel(String column1, String column2, String column3, String column4, String column5, String column6, String column7, String column8, String column9, String column10) {
	    try{
	    	String ActualColumn1Name = driver.findElement(By.xpath("//table/thead/tr/td[1]")).getText();
	    	String ActualColumn2Name = driver.findElement(By.xpath("//table/thead/tr/td[2]")).getText();
		    String ActualColumn3Name = driver.findElement(By.xpath("//table/thead/tr/td[3]")).getText();
		    String ActualColumn4Name = driver.findElement(By.xpath("//table/thead/tr/td[4]")).getText();
		    String ActualColumn5Name = driver.findElement(By.xpath("//table/thead/tr/td[5]")).getText();
		    String ActualColumn6Name = driver.findElement(By.xpath("//table/thead/tr/td[6]")).getText();
		    String ActualColumn7Name = driver.findElement(By.xpath("//table/thead/tr/td[7]")).getText();
		    String ActualColumn8Name = driver.findElement(By.xpath("//table/thead/tr/td[8]")).getText();
		    String ActualColumn9Name = driver.findElement(By.xpath("//table/thead/tr/td[9]")).getText();
		    String ActualColumn10Name = driver.findElement(By.xpath("//table/thead/tr/td[10]")).getText();
		    Thread.sleep(500);
		    if(ActualColumn1Name.equals(column1) && ActualColumn2Name.equals(column2) && ActualColumn3Name.equals(column3) && ActualColumn4Name.equals(column4) && ActualColumn5Name.equals(column5) && ActualColumn6Name.equals(column6) && ActualColumn7Name.equals(column7) && ActualColumn8Name.equals(column8) && ActualColumn9Name.equals(column9) && ActualColumn10Name.equals(column10) ) {
		    	System.out.println("Admin is able to see all columns");
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Admin is not able to see all columns"+ex);
		    Assert.fail();
		}
	    
	}
	
	@When("Admin clicks on table header column Return ID")
	public void admin_clicks_on_table_header_column_Return_ID() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[2]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Return ID"+ex);
		    Assert.fail();
		}
		
	}

	@Then("Verify if Return ID column get sorted in Ascending Order")
	public void verify_if_Return_ID_column_get_sorted_in_Ascending_Order() {
	    try {
	    	int num1= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText());
		    //System.out.println(num1);
		    int num2= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
		    //System.out.println(num2);
		    Thread.sleep(500);
		    if(num1 <= num2) {
		    	System.out.println("Return ID column sorted in Ascending Order");
		    }
		    else {
		    	System.out.println("Return ID column not sorted in Ascending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Return ID column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
		
	}

	@Then("Verify if Return ID column get sorted in Descending Order")
	public void verify_if_Return_ID_column_get_sorted_in_Descending_Order() {
		try{
			int num1= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText());
			//System.out.println(num1);
		    int num2= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
		    //System.out.println(num2);
		    Thread.sleep(500);
		    if(num1 >= num2) {
		    	System.out.println("Return ID column sorted in Descending Order");
		    }
		    else {
		    	System.out.println("Return ID column not sorted in Descending Order");
			    Assert.fail();
		    }
		}
		catch(Exception ex) {
			System.out.println("Return ID column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
		
	}

	@When("Admin clicks on table header column Order ID")
	public void admin_clicks_on_table_header_column_Order_ID() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[3]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Return ID"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Order ID column get sorted in Ascending Order")
	public void verify_if_Order_ID_column_get_sorted_in_Ascending_Order() {
		try {
	    	int num1= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText());
		    //System.out.println(num1);
		    int num2= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());
		    //System.out.println(num2);
		    Thread.sleep(500);
		    if(num1 <= num2) {
		    	System.out.println("Order ID column sorted in Ascending Order");
		    }
		    else {
		    	System.out.println("Order ID column not sorted in Ascending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Order ID column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Order ID column get sorted in Descending Order")
	public void verify_if_Order_ID_column_get_sorted_in_Descending_Order() {
		try {
	    	int num1= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText());
		    //System.out.println(num1);
		    int num2= Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());
		    //System.out.println(num2);
		    Thread.sleep(500);
		    if(num1 >= num2) {
		    	System.out.println("Order ID column sorted in Descending Order");
		    }
		    else {
		    	System.out.println("Order ID column not sorted in Descending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Order ID column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on table header column Customer")
	public void admin_clicks_on_table_header_column_Customer() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[4]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Customer"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Customer column get sorted in Ascending Order")
	public void verify_if_Customer_column_get_sorted_in_Ascending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
		    //System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num <= 0) {
		    	System.out.println("Customer column sorted in Ascending Order");
		    }
		    else {
		    	System.out.println("Customer column not sorted in Ascending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Customer column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Customer column get sorted in Descending Order")
	public void verify_if_Customer_column_get_sorted_in_Descending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num >= 0) {
		    	System.out.println("Customer column sorted in Descending Order");
		    }
		    else {
		    	System.out.println("Customer column not sorted in Descending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Customer column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on table header column Product")
	public void admin_clicks_on_table_header_column_Product() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[5]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Product"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Product column get sorted in Ascending Order")
	public void verify_if_Product_column_get_sorted_in_Ascending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num <= 0) {
		    	System.out.println("Product column sorted in Ascending Order");
		    }
		    else {
		    	System.out.println("Product column not sorted in Ascending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Product column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Product column get sorted in Descending Order")
	public void verify_if_Product_column_get_sorted_in_Descending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num >= 0) {
		    	System.out.println("Product column sorted in Descending Order");
		    }
		    else {
		    	System.out.println("Product column not sorted in Descending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Product column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on table header column Model")
	public void admin_clicks_on_table_header_column_Model() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[6]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Model"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Model column get sorted in Ascending Order")
	public void verify_if_Model_column_get_sorted_in_Ascending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[6]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num <= 0) {
		    	System.out.println("Model column sorted in Ascending Order");
		    }
		    else {
		    	System.out.println("Model column not sorted in Ascending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Model column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Model column get sorted in Descending Order")
	public void verify_if_Model_column_get_sorted_in_Descending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[6]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num >= 0) {
		    	System.out.println("Model column sorted in Descending Order");
		    }
		    else {
		    	System.out.println("Model column not sorted in Descending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Model column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on table header column Status")
	public void admin_clicks_on_table_header_column_Status() {
	    try {
			driver.findElement(By.xpath("//table/thead/tr/td[7]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Status"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Status column get sorted in Ascending Order")
	public void verify_if_Status_column_get_sorted_in_Ascending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[7]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num <= 0) {
		    	System.out.println("Status column sorted in Ascending Order");
		    }
		    else {
		    	System.out.println("Status column not sorted in Ascending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Status column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Status column get sorted in Descending Order")
	public void verify_if_Status_column_get_sorted_in_Descending_Order() {
		try {
	    	String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]")).getText();
	    	//System.out.println(str1);
		    String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[7]")).getText();
		    //System.out.println(str2);
		    int num= str1.compareTo(str2);
		    //System.out.println(num);
		    Thread.sleep(500);
		    if(num >= 0) {
		    	System.out.println("Status column sorted in Descending Order");
		    }
		    else {
		    	System.out.println("Status column not sorted in Descending Order");
			    Assert.fail();
		    }
	    }
	    catch(Exception ex) {
			System.out.println("Status column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on table header column Date Added")
	public void admin_clicks_on_table_header_column_Date_Added() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[8]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Date Added"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Date Added column get sorted in Ascending Order")
	public void verify_if_Date_Added_column_get_sorted_in_Ascending_Order() {
		try{
			String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]")).getText();
			//System.out.println(str1); //dd/mm/yyyy
			int sub1str1 = Integer.parseInt(str1.substring(6));
			//System.out.println(sub1str1);
			int sub2str1 = Integer.parseInt(str1.substring(3,5));
			//System.out.println(sub2str1);
			int sub3str1 = Integer.parseInt(str1.substring(0,2));
			//System.out.println(sub3str1);
			String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[8]")).getText();
			//System.out.println(str2);
			int sub1str2 = Integer.parseInt(str2.substring(6));
			//System.out.println(sub1str2);
			int sub2str2 = Integer.parseInt(str2.substring(3,5));
			//System.out.println(sub2str2);
			int sub3str2 = Integer.parseInt(str2.substring(0,2));
			//System.out.println(sub3str2);
			Thread.sleep(500);
			if(sub1str1 < sub1str2) {
				//System.out.println(sub1str1);
				//System.out.println(sub1str2);
				System.out.println("Date Added column sorted in Ascending Order");
			}
			else if(sub1str1 == sub1str2) {
				if(sub2str1 < sub2str2) {
					//System.out.println(sub2str1);
					//System.out.println(sub2str2);
					System.out.println("Date Added column sorted in Ascending Order");
				}
				else if(sub2str1 == sub2str2) {
					if(sub3str1 < sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Added column sorted in Ascending Order");
					}
					else if(sub3str1 == sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Added column sorted in Ascending Order");
					}
				}
				
			}
			else {
				System.out.println("Date Added column not sorted in Ascending Order");
			}
		}
		catch(Exception ex) {
			System.out.println("Date Added column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Date Added column get sorted in Descending Order")
	public void verify_if_Date_Added_column_get_sorted_in_Descending_Order() {
		try{
			String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]")).getText();
			//System.out.println(str1); //dd/mm/yyyy
			int sub1str1 = Integer.parseInt(str1.substring(6));
			//System.out.println(sub1str1);
			int sub2str1 = Integer.parseInt(str1.substring(3,5));
			//System.out.println(sub2str1);
			int sub3str1 = Integer.parseInt(str1.substring(0,2));
			//System.out.println(sub3str1);
			String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[8]")).getText();
			//System.out.println(str2);
			int sub1str2 = Integer.parseInt(str2.substring(6));
			//System.out.println(sub1str2);
			int sub2str2 = Integer.parseInt(str2.substring(3,5));
			//System.out.println(sub2str2);
			int sub3str2 = Integer.parseInt(str2.substring(0,2));
			//System.out.println(sub3str2);
			Thread.sleep(500);
			if(sub1str1 > sub1str2) {
				//System.out.println(sub1str1);
				//System.out.println(sub1str2);
				System.out.println("Date Added column sorted in Descending Order");
			}
			else if(sub1str1 == sub1str2) {
				if(sub2str1 > sub2str2) {
					//System.out.println(sub2str1);
					//System.out.println(sub2str2);
					System.out.println("Date Added column sorted in Descending Order");
				}
				else if(sub2str1 == sub2str2) {
					if(sub3str1 > sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Added column sorted in Descending Order");
					}
					else if(sub3str1 == sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Added column sorted in Descending Order");
					}
				}
			}
			else {
				System.out.println("Date Added column not sorted in Descending Order");
			}
		}
		catch(Exception ex) {
			System.out.println("Date Added column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}

	@When("Admin clicks on table header column Date Modified")
	public void admin_clicks_on_table_header_column_Date_Modified() {
		try {
			driver.findElement(By.xpath("//table/thead/tr/td[9]/a")).click();
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to click on table header column Date Modified"+ex);
		    Assert.fail();
		}
	}
	
	@Then("Verify if Date Modified column get sorted in Ascending Order")
	public void verify_if_Date_Modified_column_get_sorted_in_Ascending_Order() {
		try{
			String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[9]")).getText();
			//System.out.println(str1); //dd/mm/yyyy
			int sub1str1 = Integer.parseInt(str1.substring(6));
			//System.out.println(sub1str1);
			int sub2str1 = Integer.parseInt(str1.substring(3,5));
			//System.out.println(sub2str1);
			int sub3str1 = Integer.parseInt(str1.substring(0,2));
			//System.out.println(sub3str1);
			String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[9]")).getText();
			//System.out.println(str2);
			int sub1str2 = Integer.parseInt(str2.substring(6));
			//System.out.println(sub1str2);
			int sub2str2 = Integer.parseInt(str2.substring(3,5));
			//System.out.println(sub2str2);
			int sub3str2 = Integer.parseInt(str2.substring(0,2));
			//System.out.println(sub3str2);
			Thread.sleep(500);
			if(sub1str1 < sub1str2) {
				//System.out.println(sub1str1);
				//System.out.println(sub1str2);
				System.out.println("Date Modified column sorted in Ascending Order");
			}
			else if(sub1str1 == sub1str2) {
				if(sub2str1 < sub2str2) {
					//System.out.println(sub2str1);
					//System.out.println(sub2str2);
					System.out.println("Date Modified column sorted in Ascending Order");
				}
				else if(sub2str1 == sub2str2) {
					if(sub3str1 < sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Modified column sorted in Ascending Order");
					}
					else if(sub3str1 == sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Modified column sorted in Ascending Order");
					}
				}
				
			}
			else {
				System.out.println("Date Modified column not sorted in Ascending Order");
			}
		}
		catch(Exception ex) {
			System.out.println("Date Modified column not sorted in Ascending Order"+ex);
		    Assert.fail();
		}
	}

	@Then("Verify if Date Modified column get sorted in Descending Order")
	public void verify_if_Date_Modified_column_get_sorted_in_Descending_Order() {
		try{
			String str1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[9]")).getText();
			//System.out.println(str1); //dd/mm/yyyy
			int sub1str1 = Integer.parseInt(str1.substring(6));
			//System.out.println(sub1str1);
			int sub2str1 = Integer.parseInt(str1.substring(3,5));
			//System.out.println(sub2str1);
			int sub3str1 = Integer.parseInt(str1.substring(0,2));
			//System.out.println(sub3str1);
			String str2= driver.findElement(By.xpath("//table/tbody/tr[2]/td[9]")).getText();
			//System.out.println(str2);
			int sub1str2 = Integer.parseInt(str2.substring(6));
			//System.out.println(sub1str2);
			int sub2str2 = Integer.parseInt(str2.substring(3,5));
			//System.out.println(sub2str2);
			int sub3str2 = Integer.parseInt(str2.substring(0,2));
			//System.out.println(sub3str2);
			Thread.sleep(500);
			if(sub1str1 > sub1str2) {
				//System.out.println(sub1str1);
				//System.out.println(sub1str2);
				System.out.println("Date Modified column sorted in Descending Order");
			}
			else if(sub1str1 == sub1str2) {
				if(sub2str1 > sub2str2) {
					//System.out.println(sub2str1);
					//System.out.println(sub2str2);
					System.out.println("Date Modified column sorted in Descending Order");
				}
				else if(sub2str1 == sub2str2) {
					if(sub3str1 > sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Modified column sorted in Descending Order");
					}
					else if(sub3str1 == sub3str2) {
						//System.out.println(sub3str1);
						//System.out.println(sub3str2);
						System.out.println("Date Modified column sorted in Descending Order");
					}
				}
			}
			else {
				System.out.println("Date Modified column not sorted in Descending Order");
			}
		}
		catch(Exception ex) {
			System.out.println("Date Modified column not sorted in Descending Order"+ex);
		    Assert.fail();
		}
	}
	
	
	//*************************************************************EditReturnProduct*************************************************************
	@When("Admin clicks on edit option of a row {string}")
	public void admin_clicks_on_edit_option_of_a_row(String row) {
		try {
	    	driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[10]/a")).click();
	    	Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to clicks on edit option of a row" + row +ex);
		    Assert.fail();
	    }
	}


	@Then("Verify if Admin is on Edit Product Return Page")
	public void verify_if_Admin_is_on_Edit_Product_Return_Page() {
		try {
			String currentUrl = driver.getCurrentUrl();
			//System.out.println(currentUrl);
			Thread.sleep(500);
			if(currentUrl.contains("http://retailm1.upskills.in/admin/index.php?route=sale/return/edit&token")) {
				System.out.println("Admin is able to navigate to Edit Product Return Page");
			}
			else {
				System.out.println("Admin is not able to navigate to Edit Product Return Page");
			    Assert.fail();
			}
		}
		catch(Exception ex) {
			System.out.println("Admin is not able to navigate to Edit Product Return Page"+ex);
		    Assert.fail();
		}
	}

	@When("Admin enter {string},{string},{string},{string},{string},{string},{string}")
	public void admin_enter(String OrderID, String FirstName, String LastName, String Email, String Telephone, String Product, String Model) {
		try {
			driver.findElement(By.xpath("//input[@name='order_id']")).clear();
			driver.findElement(By.xpath("//input[@name='order_id']")).sendKeys(OrderID);
			driver.findElement(By.xpath("//input[@name='firstname']")).clear();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
			driver.findElement(By.xpath("//input[@name='lastname']")).clear();
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
			driver.findElement(By.xpath("//input[@name='email']")).clear();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@name='telephone']")).clear();
			driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(Telephone);
			driver.findElement(By.xpath("//input[@name='product']")).clear();
			driver.findElement(By.xpath("//input[@name='product']")).sendKeys(Product);
			driver.findElement(By.xpath("//input[@name='model']")).clear();
			driver.findElement(By.xpath("//input[@name='model']")).sendKeys(Model);
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to enter data in above fields"+ex);
		    Assert.fail();
	    }
	}

	@When("Admin clicks on save button")
	public void admin_clicks_on_save_button() {
		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(500);
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to click on Save button"+ex);
		    Assert.fail();
	    }
	}

	@Then("Verify if admin is navigated to Product Return Page")
	public void verify_if_admin_is_navigated_to_Product_Return_Page() {
		try {
			String currentretUrl = driver.getCurrentUrl();
			//System.out.println(currentretUrl);
			Thread.sleep(500);
			if(currentretUrl.contains("http://retailm1.upskills.in/admin/index.php?route=sale/return&token")) {
				System.out.println("Admin is able to navigate on Product Return page");
			}
			else {
				System.out.println("Admin is not able to navigate on Product Return page");
			    Assert.fail();
			}
	    }
	    catch(Exception ex) {
	    	System.out.println("Admin is not able to navigate on Product Return page"+ex);
		    Assert.fail();
	    }
	}

	
	//*************************************************************Pagination*************************************************************
	@Then("Verify if their is pagination in the webpage")
	public void verify_if_their_is_pagination_in_the_webpage() {
		try {
			boolean value = driver.findElement(By.xpath("//ul[@class = 'pagination']")).isDisplayed();
			Thread.sleep(500);
			   if(value)
			   {
				   System.out.println("Their is pagination in the webpage");
			   }
			   else
			   {
				   System.out.println("Their is no pagination in the webpage");
				   Assert.fail();
			   } 
		}
		catch(Exception ex) {
			System.out.println("Their is no pagination in the webpage"+ex);
		    Assert.fail();
		}
		
	}
	
	@Then("Verify if their is pagination after every {int} records")
	public void verify_if_their_is_pagination_after_every_records(Integer int1) {
		try {
			List<WebElement> listOfElements = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
			int size = listOfElements.size();
			Thread.sleep(500);
			if(size == int1)
			   {
				   System.out.println("User can see pagination after every 25 records");
			   }
			   else
			   {
				   System.out.println("User can not see pagination after every 25 records");
				   Assert.fail();
			   }
		}
		catch(Exception ex) {
			System.out.println("User can not see pagination after every 25 records"+ex);
		    Assert.fail();
		}
		
	    
	}
	
}
