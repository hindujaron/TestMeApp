package MyDemoPath.CaseStudy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class FinalScenario {

public static WebDriver driver;
ExtentHtmlReporter htmlReporter;
ExtentReports extent;
ExtentTest logger;


@BeforeTest
public void startReportBeforeTest()
{
 driver=Scenario1.getDriver("chrome");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-reports/"+new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yy").format(new Date())+".html");
  extent = new ExtentReports();
  extent.attachReporter(htmlReporter);
  extent.setSystemInfo("Host Name", "GFTNexGen TestingStream");
  extent.setSystemInfo("Environment", "Automation Testing - Selenium");
  extent.setSystemInfo("User Name", "Hemangi Mungad");
  htmlReporter.config().setDocumentTitle("Report Title");
  htmlReporter.config().setTheme(Theme.DARK);
 
}

@AfterMethod
public void getResult(ITestResult result) throws IOException{
 if(result.getStatus() == ITestResult.FAILURE){
  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
  TakesScreenshot snapshot=(TakesScreenshot)driver;
  File src=snapshot.getScreenshotAs(OutputType.FILE);
  String path=System.getProperty("user.dir") +"/extent-reports/snapshots/"+result.getName()+".png";
  FileUtils.copyFile(src, new File(path));
  logger.addScreenCaptureFromPath(path,result.getName());
  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
  }
 else if(result.getStatus() == ITestResult.SKIP){
  logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
 }
}
@AfterTest
public void endReport(){
 extent.flush();
 driver.close();
}
}