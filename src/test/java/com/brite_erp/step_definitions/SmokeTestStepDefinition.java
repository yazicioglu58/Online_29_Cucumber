package com.brite_erp.step_definitions;

import com.brite_erp.pages.Menu;
import com.brite_erp.utilities.ApplicationConstants;
import com.brite_erp.utilities.BrowserUtils;
import com.brite_erp.utilities.Driver;
import com.brite_erp.utilities.Pages;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SmokeTestStepDefinition {

  protected Pages pages=new Pages();
//    @Given("^user on the purchases page$")
//    public void user_on_the_purchases_page() throws Throwable {
//      pages.login().open();
//        pages.chooseERP().rightERP.click();
//        pages.login().login();
//        pages.purchasesMain().purchaseInMenu.click();
//
//    }

    @Then("^title of the page should be \"([^\"]*)\"$")
    public void title_of_the_page_should_be(String purchasesTitle) throws Throwable {

      switch (purchasesTitle)
      {
        case "Requests for Quotation - Odoo":
          pages.purchasesMain().titleRequestForQuotationPage.click();
          BrowserUtils.wait(2);
          Assert.assertEquals(Driver.getDriver().getTitle(),purchasesTitle);
          break;

        case "Purchase Orders - Odoo":
          pages.purchasesMain().titlePurchaseOrders.click();
          BrowserUtils.wait(5);
          Assert.assertEquals(purchasesTitle,Driver.getDriver().getTitle());
          break;

        case "Vendors - Odoo":
          pages.purchasesMain().titleVendors.click();
          BrowserUtils.wait(5);
          Assert.assertEquals(purchasesTitle,Driver.getDriver().getTitle());
          break;

        case "Products - Odoo":
          pages.purchasesMain().titleProducts.click();
          BrowserUtils.wait(5);
          Assert.assertEquals(Driver.getDriver().getTitle(),purchasesTitle);
          break;

        case "Incoming Products - Odoo":
          pages.purchasesMain().titleIncomingProducts.click();
          BrowserUtils.wait(5);
          Assert.assertEquals(Driver.getDriver().getTitle(),purchasesTitle);
          break;

        case "Vendor Bills - Odoo":
          pages.purchasesMain().titleVendorBills.click();
          BrowserUtils.wait(5);
          Assert.assertEquals(Driver.getDriver().getTitle(),purchasesTitle);
          break;

        case "Purchase Analysis - Odoo":
          pages.purchasesMain().titleReporting.click();
          BrowserUtils.wait(5);
          Assert.assertEquals(Driver.getDriver().getTitle(),purchasesTitle);
          break;

          default:
            System.out.println("Wrong Title");

      }


    }

}
