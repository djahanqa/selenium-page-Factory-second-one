package reporting;

import base.ScriptBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;
import org.testng.internal.Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ListenerOld extends ScriptBase implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Calendar calendar=  Calendar.getInstance();
        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName= result.getName();
        if (result.isSuccess()){
                File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                try {
                    String reportDirectory = new
                            File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/successScreenshots";
                    File destFile=new
                            File((String) reportDirectory + "/" + methodName + "_"+formater.format(calendar.getTime())+".png");

                    Utils.copyFile(srcFile,destFile);
                    Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><image src='"+destFile.getAbsolutePath()+"'height='100' width'100'/></a>");

                }catch (Exception e){
            }
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Calendar calendar=  Calendar.getInstance();
        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName= result.getName();
        if (result.getStatus()==ITestResult.FAILURE){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                String reportDirectory = new
                        File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/FailureScreenshots";
                File destFile=new
                        File((String) reportDirectory + "/" + methodName + "_"+formater.format(calendar.getTime())+".png");

                Utils.copyFile(srcFile,destFile);
                Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><image src='"+destFile.getAbsolutePath()+"'height='100' width'100'/></a>");

            }catch (Exception e){
            }
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Override
    public void onTestStart(ITestContext result) {

    }
}
