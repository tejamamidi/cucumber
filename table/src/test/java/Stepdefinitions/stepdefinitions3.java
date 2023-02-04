package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.Addcustomers;
import utils.loginpage;

public class stepdefinitions3 {
	public loginpage lp;
	public Addcustomers ad;
		 

		WebDriver driver;
		@Given("^I open browser with url \"([^\"]*)\"$")
		public void i_open_browser_with_url(String url) throws Throwable 
		{
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			lp= new loginpage(driver);
			driver.get(url);
		    
		}

		@Then("^it opens the browser$")
		public void it_opens_the_browser() throws Throwable {
		    lp.getpagetitle();
		    Assert.assertEquals("Your store. Login", lp.getpagetitle());
		}

		@When("^i enter send keys \"([^\"]*)\" And \"([^\"]*)\"$")
		public void i_enter_send_keys_And(String arg1, String arg2) throws Throwable {
		    lp.setusername(arg1);
		    lp.setpassword(arg2);
		   
		}

		@When("^i click login$")
		public void i_click_login() throws Throwable {
		   lp.loginbtn();
		}

		@Then("^see the dashboardpage$")
		public void see_the_dashboardpage() throws Throwable {
		   Assert.assertEquals("Dashboard / nopCommerce administration", lp.getpagetitle());
		}

		@When("^i click customers link And i click customers option \"([^\"]*)\"$")
		public void i_click_customers_link_And_i_click_customers_option(String arg1) throws Throwable 
		
		{
			ad = new Addcustomers(driver); 
			ad.customersmenu(arg1);
		}
		

		@When("^i click Add new button$")
		public void i_click_Add_new_button() throws Throwable {
			ad.Addbutton();
		}
		@When("^i set customer info$")
		public void i_set_customer_info(DataTable table) throws Throwable {
		  
		  ad.setemail(table.cell(1, 0));
		  ad.setfirstname(table.cell(1, 2));
		  ad.setgender(table.cell(1,4 ));
		  ad.setdob(table.cell(1, 5));
		  ad.setlastname(table.cell(1, 3));
		  ad.setpassword(table.cell(1, 1));
		  ad.setcompanyname(table.cell(1, 6));
		  ad.setcustomerroles(table.cell(1, 7));
		  ad.setvendors(table.cell(1, 8));
		}
		
		
		@When("^i enter all And  details click save button$")
		public void i_enter_all_details_And_click_save_button() throws Throwable {
		  ad.save(); 
		}

		@When("^i enter the sendkeys email \"([^\"]*)\"$")
		public void i_enter_the_sendkeys_email(String arg1) throws Throwable {
		    ad.Searchbyemail(arg1);
		}

}
