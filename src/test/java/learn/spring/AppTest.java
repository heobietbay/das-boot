package learn.spring;

import learn.spring.controller.HomeController;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    @org.junit.Test
    public void testApp()
    {
        HomeController homeController = new HomeController();
        assertEquals("Das boot, reporting for duty!",homeController.home());
    }
}
