import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

@Test
    public void startTrello(){
  //  System.setProperty("..."); драйвер не в корне проэкта
    wd = new ChromeDriver(); //открыть браузер
    wd.navigate().to("https://trello.com/"); //открыть апликацию
    wd.navigate().back();
    wd.navigate().forward();
    wd.navigate().refresh();

    wd.close();//закрыть апликацию
    wd.quit(); //закрыть браузер

}
}
