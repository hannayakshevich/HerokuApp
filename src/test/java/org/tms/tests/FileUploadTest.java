package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.FileUploadService;

public class FileUploadTest extends BaseTest{

    FileUploadService fileUploadService = new FileUploadService();

    @Test
    public void verifyUploadFile(){
        fileUploadService.verifyUploadFile();
        String actualTextUploadFile = fileUploadService.getTextFileUpload();
        String expectedTextUploadFile = "Locators and Selectors.pptx";
        Assert.assertEquals(actualTextUploadFile, expectedTextUploadFile, "File was uploaded");
    }
}
