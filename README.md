# TestProject

#Objective 1: Checkout and remove the product from cart

**Goal:** Test logging into the application(www.saucedemo.com) with a standard user.
*standard_user (password is on site)
*Add all the products to shopping cart
*Remove all the products from the cart


#Objective 2: Validate the product details

**Goal:** Need to check the product details with our locally provided details
The scenario in Objective requires at a very minimum the following data which can be found in the application:

*Exact Product title
*Exact Product description
*Exact Product price


#Objective 3: Invalid Username and password

**Goal:** User should not enter into application using invalid username and password
Add invalid username & password
Provide null values for username & password.


It's possible to test other scenarios by adding more to the JSON and Java POJO. Allows testing without having to change the data interface very much.
For a simple workflow the steps are the same. To handle multiple products, you just need to iterate over the products in the data and assertions. The data values are the only difference. Something like this is idea for using something like TestNG's DataProvider or some other means of iterating over it.

The other tests use the same page objects, but may do other types of assertions based on the test needs.
