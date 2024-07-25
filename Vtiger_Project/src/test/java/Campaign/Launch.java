package Campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) {

  WebDriver driver=new EdgeDriver();
  driver.get("https://www.flipkart.com");
	}

}
