package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ZCP on 2018/9/13.
 */
public class test1 {
    @BeforeMethod
    public void bef(){
        Fangfa.fangfa.Before();
    }

    @Test
    public  void Test1() throws InterruptedException {
        Fangfa.fangfa.GetUrl("http://baidu.com");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void Af(){
        Fangfa.fangfa.Afer();
    }
}
