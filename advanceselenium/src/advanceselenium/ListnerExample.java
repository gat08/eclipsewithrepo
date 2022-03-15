package advanceselenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerExample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Testcase starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test suit starts here....");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test suit ends here....");
	}

}
