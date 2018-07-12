package mapAndComparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MapFromValueToKey {
	WebDriver d;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertekchicago-1/Desktop/seleniumDependecy/drivers/chromedriver");
		d = new ChromeDriver();
		d.manage().window().fullscreen();}
@Test
	public void sumOfMedals()  {
		d.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table");
		MapFromValueToKey name=new MapFromValueToKey();
	
		List<WebElement> country = d.findElements(
				By.xpath("(//table[@class='wikitable sortable plainrowheaders jquery-tablesorter'])/tbody/tr/th"));

	
		System.out.println(country.isEmpty());
		List<WebElement> silver = d.findElements(
				By.xpath("(//table[@class='wikitable sortable plainrowheaders jquery-tablesorter'])/tbody/tr/td[4]"));

		List<Integer> numOfMedals = new ArrayList<>();

		Map<String, Integer> medal = new HashMap<>();

		for (int i=0;i<10;i++) {

			medal.put(country.get(i).getText(), Integer.parseInt(silver.get(i).getText()));
			numOfMedals.add(Integer.parseInt(silver.get(i).getText()));

		}
	//System.out.println(medal);
		int countryNum2 = 0;
		int countryNum1 = 0;
		int num1 = 0;

		for (int i = 0; i < numOfMedals.size(); i++) {
			for (int j = 0; j < numOfMedals.size(); j++) {
				num1 = numOfMedals.get(i);
				if (num1 + numOfMedals.get(j) == 28 && i != j) {
					countryNum1 = num1;
					countryNum2 = numOfMedals.get(j);

				}
			}
		}
		String countrySt2 = (String) this.getKeyFromValue(medal, countryNum2);

		String countrySt = (String) this.getKeyFromValue(medal, countryNum1);
		
		List<String> twocountry = new ArrayList<>();
		twocountry.add(countrySt2);
		twocountry.add(countrySt);
		
	System.out.println(twocountry);

	}

	public Object getKeyFromValue(Map m, Object value) {
		for (Object o : m.keySet()) {
			if (m.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}
}
