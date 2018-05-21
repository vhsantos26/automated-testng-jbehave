package ui.pages.google.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.org.commons.selenium.elements.Button;
import com.org.commons.selenium.elements.Input;
import com.org.commons.utils.Page;

public class GoogleSearchPage extends Page {

	public GoogleSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.CSS, using = "#lst-ib")
	public Input searchField;

	@FindBy(how = How.CSS, using = "input[name=btnK]")
	public Button searchButton;

	@Override
	public boolean isAt() {
		return driver.getTitle().equals("Google");
	}

}
