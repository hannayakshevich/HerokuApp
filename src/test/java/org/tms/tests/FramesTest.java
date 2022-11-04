package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.FramesService;

public class FramesTest extends BaseTest{

    FramesService framesService = new FramesService();

    @Test
    public void getFrameText(){
        framesService.openFrame();
        String actualFrameText = framesService.getFrameText();
        String expectedFrameText = "Your content goes here.";
        Assert.assertEquals(actualFrameText, expectedFrameText, "frame was opened");
    }
}
