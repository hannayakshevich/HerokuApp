package org.tms.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.DynamicControlsService;

public class DynamicControlsTest extends BaseTest{

    DynamicControlsService dynamicControlsService = new DynamicControlsService();

    @Test
    public void verifyDeletionCheckBox(){
        dynamicControlsService.verifyDeletionCheckBox();
        int actualCountCheckBox = dynamicControlsService.finedCheckBox();
        Assert.assertEquals(actualCountCheckBox, 0, "CheckBox wasn't found");
    }
}
