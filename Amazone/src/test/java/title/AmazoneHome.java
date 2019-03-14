package title;

import Base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazoneHome extends CommonAPI {
    @Test
    public void test(){
        String tittle = driver.getTitle();
        System.out.println(tittle);
        Assert.assertEquals(tittle, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }


}
