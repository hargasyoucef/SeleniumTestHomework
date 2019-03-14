package search;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void search(){
        typeOnId("twotabsearchtextbox");
    }
    @Test
    public void search2(){

        typeOnCSS("#twotabsearchtextbox");
    }

    @Test
    public void search3()
    {
        System.out.println(getCurrentPageUrl());

    }
    @Test
    public void search4()
    {
        navigateForward();

    }
    }
