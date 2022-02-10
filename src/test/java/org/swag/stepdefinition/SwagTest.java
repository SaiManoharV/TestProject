package org.swag.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.swag.commonactions.CommonAction;
import org.swag.locators.SwagLocators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SwagTest extends CommonAction {

	CommonAction ca = new CommonAction();
	SwagLocators sl = new SwagLocators();
	String actual;
	String expected;

	@Given("Launches application and Login")
	public void launches_application_and_Login() throws FileNotFoundException, IOException, InterruptedException {
		
		ca.insertText(sl.getUname(), ca.getproperty("username"));
		ca.insertText(sl.getPwd(), ca.getproperty("password"));
		ca.click(sl.getLoginbtn());
		ca.eletobewait();

	}

	@Given("Add the product to the cart")
	public void add_the_product_to_the_cart() throws InterruptedException {
		actual = sl.getProductvalue().getText();
		System.out.println("add" +actual);
		ca.click(sl.getItem1());
		ca.click(sl.getItem2());
		ca.click(sl.getItem3());
		ca.click(sl.getItem4());
		ca.click(sl.getItem5());
		ca.click(sl.getItem6());
		ca.eletobewait();
	}

	@Given("Remove the products from cart") 
	  public void remove_the_products_from_cart() throws InterruptedException {
	  
	  actual=sl.getProductvalue().getText(); 
	  ca.click(sl.getRemoveItem1()); 
	  ca.click(sl.getRemoveItem2()); 
	  ca.click(sl.getRemoveItem3()); 
	  ca.click(sl.getRemoveItem4());
	  ca.click(sl.getRemoveItem5()); 
	  ca.click(sl.getRemoveItem6());
	  ca.eletobewait(); 
	  }
	 

	@Given("Launches application and Login using valid credentials")
	public void launches_application_and_Logins() throws FileNotFoundException, IOException, InterruptedException {
		
		ca.insertText(sl.getUname(), ca.getproperty("username"));
		ca.insertText(sl.getPwd(), ca.getproperty("password"));
		ca.click(sl.getLoginbtn());
		ca.eletobewait();
	}

	public List<String> getAllProductTitle()
	{
		List<String> productTitle=new ArrayList();
		productTitle.add(sl.getProductTitle1().getText());
		productTitle.add(sl.getProductTitle2().getText());
		productTitle.add(sl.getProductTitle3().getText());
		productTitle.add(sl.getProductTitle4().getText());
		productTitle.add(sl.getProductTitle5().getText());
		productTitle.add(sl.getProductTitle6().getText());
		return productTitle;
	}
	
	@Given("check each item as correct title")
	public void check_each_item_as_correct_title() throws FileNotFoundException, IOException, InterruptedException {
		
		List<String> itemTitles = getAllProductTitle();
		for(int i=0; i<itemTitles.size(); i++) {
			actual = itemTitles.get(i);
			ca.eletobewait();
			expected = ca.getproperty("name"+i);
			Assert.assertEquals(expected, actual);
			System.out.println(expected + " value is found same in add to page page");
		}
    }

	public List<String> getAllProductDescription()
	{
		List<String> productDescription =new ArrayList();
		productDescription.add(sl.getProductDescription1().getText());
		productDescription.add(sl.getProductDescription2().getText());
		productDescription.add(sl.getProductDescription3().getText());
		productDescription.add(sl.getProductDescription4().getText());
		productDescription.add(sl.getProductDescription5().getText());
		productDescription.add(sl.getProductDescription6().getText());
		return productDescription;
	}
	@Given("check each item as correct description")
	public void check_each_item_as_correct_description() throws FileNotFoundException, IOException, InterruptedException {
          
		List<String> itemDescription = getAllProductDescription();
		for(int i=0; i<itemDescription.size(); i++) {
			actual = itemDescription.get(i);
			ca.eletobewait();
			expected = ca.getproperty("description"+i);
			Assert.assertEquals(expected, actual);
			System.out.println(expected + " value is found same in add to page page");
		}
		
		

	}
    
	public List<String> getAllProductPrice()
	{
		List<String> productPrice =new ArrayList();
		productPrice.add(sl.getProductPrice1().getText());
		productPrice.add(sl.getProductPrice2().getText());
		productPrice.add(sl.getProductPrice3().getText());
		productPrice.add(sl.getProductPrice4().getText());
		productPrice.add(sl.getProductPrice5().getText());
		productPrice.add(sl.getProductPrice6().getText());
		return productPrice;
	}
	
	@Given("check each item as correct price")
	public void check_each_item_as_correct_price() throws FileNotFoundException, IOException, InterruptedException {
        
		List<String> itemPrice = getAllProductPrice();
		for(int i=0; i<itemPrice.size(); i++) {
			actual = itemPrice.get(i);
			ca.eletobewait();
			expected = ca.getproperty("price"+i);
			//System.out.println("actual " +actual + "expected " +expected);
			Assert.assertEquals(expected, actual);
			System.out.println(expected + " value is found same in add to page page");
		}

	} 

	
	  @Given("Launches application and enters invalid user credentials") 
	  public void launches_application_and_Login_using_invalid_credentials() throws FileNotFoundException, IOException, InterruptedException {
		      
		      ca.insertText(sl.getUname(), ca.getproperty("invalidname"));
	          ca.insertText(sl.getPwd(), ca.getproperty("invalidpassword"));
	          ca.click(sl.getLoginbtn()); 
	          ca.eletobewait(); 
	          
	  }
	  
	  @Given("Launches application and try to login without providing values") 
	  public void launches_application_and_try_to_login_without_providing_values() throws FileNotFoundException, IOException, InterruptedException {
		 
	          ca.insertText(sl.getUname(), ca.getproperty("nullname"));
	          ca.insertText(sl.getPwd(), ca.getproperty("nullpassword"));
	          ca.click(sl.getLoginbtn()); 
	          ca.eletobewait(); 
	          
	  }
	 

}
