package reporting.ExtentsReporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentsManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter()
    {
        if (extent == null) {
            String workingDir = System.getProperty("user.dir");
           // extent = new ExtentReports(workingDir+"/ExtentReports/ExtentReportResults.htm", true);
            extent=new ExtentReports(workingDir+"/ExtentReports/ExtentReportResults.htm",true);

        }
        return extent;
    }
}