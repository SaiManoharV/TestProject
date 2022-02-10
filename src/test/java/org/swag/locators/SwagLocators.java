package org.swag.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.swag.commonactions.CommonAction;


public class SwagLocators extends CommonAction {

    public SwagLocators() {
        PageFactory.initElements(CommonAction.driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement uname;
    
    @FindBy(id = "password")
    private WebElement pwd;
    
    @FindBy(id = "login-button")
    private WebElement loginbtn;
    
    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    private WebElement item1;
    
    @FindBy(xpath ="(/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button)")
	private WebElement item2;
    
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]") 
	private WebElement item3;
   
    @FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    private WebElement item4;
    
    @FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
    private WebElement item5;
    
    @FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
    private WebElement item6;
    
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
    private WebElement removeItem1;
    
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-bike-light\"]")
    private WebElement removeItem2;
    
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")
    private WebElement removeItem3;
    
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-fleece-jacket\"]")
    private WebElement removeItem4;
    
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-onesie\"]")
    private WebElement removeItem5;
    
    @FindBy(xpath="//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")
    private WebElement removeItem6;
	
	@FindBy(className = "shopping_cart_link")
    private WebElement cartlink;
    
    @FindBy(xpath ="//div[text()='QTY']//parent::div//following-sibling::div/a/div")
    private WebElement getcartproductvalue;
    
    @FindBy(xpath ="(//a/div)[1]")
    private WebElement productvalue;

    @FindBy(id="back-to-products")
    private WebElement backtopdct;

    @FindBy(tagName = "h3")
    private WebElement erromsg;
    
    @FindBy(xpath ="/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    private WebElement productTitle1;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div")
    private WebElement productDescription1;
    
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")
    private WebElement productPrice1;
    
    @FindBy(xpath="//*[@id=\"item_0_title_link\"]/div")
    private WebElement productTitle2;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div")
    private WebElement productDescription2;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")
    private WebElement productPrice2;
    
    @FindBy(xpath="//*[@id=\"item_1_title_link\"]/div")
    private WebElement productTitle3;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div")
    private WebElement productDescription3;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")
    private WebElement productPrice3;
    
    @FindBy(xpath="//*[@id=\"item_5_title_link\"]/div")
    private WebElement productTitle4;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div")
    private WebElement productDescription4;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")
    private WebElement productPrice4;
    
    @FindBy(xpath="//*[@id=\"item_2_title_link\"]/div")
    private WebElement productTitle5;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div")
    private WebElement productDescription5;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")
    private WebElement productPrice5;
    
    @FindBy(xpath="//*[@id=\"item_3_title_link\"]/div")
    private WebElement productTitle6;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div")
    private WebElement productDescription6;
    
    @FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
    private WebElement productPrice6;
    
	public WebElement getItem1() {
		return item1;
	}

	public WebElement getItem2() {
		return item2;
	}
	
	public WebElement getItem3() {
		return item3;
	}

	public WebElement getItem4() {
		return item4;
	}

    public WebElement getItem5() {
		return item5;
	}

	public WebElement getItem6() {
		return item6;
	}

    public WebElement getRemoveItem1() {
			return removeItem1;
		}

	public WebElement getRemoveItem2() {
			return removeItem2;
		}

    public WebElement getRemoveItem3() {
			return removeItem3;
		}

    public WebElement getRemoveItem4() {
			return removeItem4;
		}

	public WebElement getRemoveItem5() {
			return removeItem5;
		}

	public WebElement getRemoveItem6() {
			return removeItem6;
		}

    public WebElement getProductPrice1() {
		return productPrice1;
	    }

	public WebElement getProductTitle1() {
		return productTitle1;
	}
	
	public WebElement getProductDescription1() {
		return productDescription1;
	}
	public WebElement getProductTitle2() {
		return productTitle2;
	}

	public WebElement getProductDescription2() {
		return productDescription2;
	}

	public WebElement getProductPrice2() {
		return productPrice2;
	}

	public WebElement getProductTitle3() {
		return productTitle3;
	}

	public WebElement getProductDescription3() {
		return productDescription3;
	}

	public WebElement getProductPrice3() {
		return productPrice3;
	}

	public WebElement getProductTitle4() {
		return productTitle4;
	}

	public WebElement getProductDescription4() {
		return productDescription4;
	}

	public WebElement getProductPrice4() {
		return productPrice4;
	}

    public WebElement getProductTitle5() {
		return productTitle5;
	}

	public WebElement getProductDescription5() {
		return productDescription5;
	}

    public WebElement getProductPrice5() {
		return productPrice5;
	}

    public WebElement getProductTitle6() {
		return productTitle6;
	}

	public WebElement getProductDescription6() {
		return productDescription6;
	}

	public WebElement getProductPrice6() {
		return productPrice6;
	}

    public WebElement getUname() {
		return uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

    public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getGetcartproductvalue() {
		return getcartproductvalue;
	}
	public WebElement getProductvalue() {
		return productvalue;
	}
	
	
}
