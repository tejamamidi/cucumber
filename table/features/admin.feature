@tag
Feature: Title of your feature
  I want to use this template for my feature file

  

  @tag1
  Scenario: login
  Given I open browser with url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then it opens the browser
    When i enter send keys "admin@yourstore.com" And "admin"
    When i click login
    Then see the dashboardpage

  @tag2
  Scenario: Add customer
   Given I open browser with url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then it opens the browser
    When i enter send keys "admin@yourstore.com" And "admin"
    When i click login
    Then see the dashboardpage
    
    When i click customers link And i click customers option "customers"
    When i click Add new button
    When i set customer info
      | Email                   | Password     | firstname | lastname | Gender | Date of birth | companyname | customer roles | vendor  |
      | durgatejam814@gmail.com | 14221A0387a@ | durga     | teja     | Male   | 04/08/1997    | teja        | Administrators  | Vendor 1 |
    
   When i enter all And  details click save button
  @tag3
  Scenario: search the customer
   Given I open browser with url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    Then it opens the browser
    When i enter send keys "admin@yourstore.com" And "admin"
    When i click login
    
    Then see the dashboardpage
    When i click customers link And i click customers option "customers"
    When i enter the sendkeys email "durgam799@gmail.com"
    