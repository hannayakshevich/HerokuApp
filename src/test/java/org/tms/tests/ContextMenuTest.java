package org.tms.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.ContextMenuService;


public class ContextMenuTest extends BaseTest{

    ContextMenuService contextMenuService = new ContextMenuService();

    @Test
    public void checkAlertTextTest(){
       contextMenuService.openAlertMenu();
       String actualAlertText = String.valueOf(contextMenuService.getAlertText());
       String expectedAlertText = "You selected a context menu";
       Assert.assertEquals(actualAlertText, expectedAlertText);
    }


}
