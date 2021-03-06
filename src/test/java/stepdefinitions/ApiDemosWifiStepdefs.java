package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiDemosPage;
import utilities.Driver;

public class ApiDemosWifiStepdefs {
    ApiDemosPage api=new ApiDemosPage();
    @Given("Prefenceye tikla")
    public void prefenceyeTikla() {
        api.preference.click();

    }

    @And("Prefence dependencies tikla")
    public void prefenceDependenciesTikla() {
        api.prefence3.click();
    }

    @And("Wifi checkbox tikla")
    public void wifiCheckboxTikla() {
        api.wifiCheckBox.click();
    }

    @And("Wifi settingse tikla")
    public void wifiSettingseTikla() {
        api.wifiSettingButton.click();
    }

    @And("Wifi settingse {string}yazisini yazin.")
    public void wifiSettingseYazisiniYazin(String str) {
  api.wifiTextBox.sendKeys(str);
    }

    @Then("Ok tikla")
    public void okTikla() {
        api.okButton.click();
    }

    @Then("cikis yapar")
    public void cikisYapar() {
        Driver.closeDriver();
    }
}
