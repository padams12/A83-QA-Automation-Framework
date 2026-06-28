public class Homework16 {
}
@test

public void  registration Naviagation() {
    ChromeOptions options =newChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    }

   WebDriver driver = newChromeDriver(options);
   driver,manage().timeouts().implicitlyWait (Duration,of seconds(10));

   String url= "https:// go.koel.app";
   driver.get(url);

   Web Element registration= driver.findElement (By.css Selector ("[href = 'registration']"));
   registration.click();
   String registration = "https// go.koel.app/registration";
   Assert.assertEquals(driver.getCurrenturl();)
}