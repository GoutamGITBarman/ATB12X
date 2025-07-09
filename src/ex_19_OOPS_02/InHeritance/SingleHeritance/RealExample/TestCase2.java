package ex_19_OOPS_02.InHeritance.SingleHeritance.RealExample;

public class TestCase2 extends CommonToAllTest {
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}
