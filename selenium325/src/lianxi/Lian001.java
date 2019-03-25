package lianxi;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Lian001 {
	@Test
        public void open1() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//Application//chrome.exe");
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	String url="http://localhost:8080/examsys/index.thtml";
    	driver.get(url);
    	driver.findElement(By.name("username")).sendKeys("hujianming");
    	driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    	WebElement s=driver.findElement(By.name("usertype"));
    	Select s1=new Select(s);
    	s1.selectByIndex(2);
    	Thread.sleep(6000);
    	driver.findElement(By.className("tm_btn")).click();
    	Thread.sleep(2000);
    	driver.switchTo().frame("menu");
		WebElement aa=driver.findElement(By.xpath("/html/body/div/div[3]/h2/a"));//获取位置
		aa.click();//点击
		WebElement bb=driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a"));//获取位置
		bb.click();//点击
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("测试基础");
    	/*driver.findElement(By.id("btn_photo")).click();
    	WebElement ss1=driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tbody/tr[3]/td"));
    	Select ss=new Select(ss1);
    	ss.selectByIndex(1);
    	driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tbody/tr[3]/td")).sendKeys("开放");
    	driver.findElement(By.name("d_remark")).sendKeys("测试基础很基础");*/
    	driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();//点击提交按钮
        }
}
