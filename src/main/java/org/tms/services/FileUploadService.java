package org.tms.services;

import org.tms.pages.FileUpload;

public class FileUploadService {

    protected FileUpload fileUpload = new FileUpload();
    private static final String WEB_PAGE_UPLOAD_FILE = "http://the-internet.herokuapp.com/upload";



    public void verifyUploadFile(){
        fileUpload.openPageFileUpload(WEB_PAGE_UPLOAD_FILE);
        fileUpload.fileUpload();

    }

    public String getTextFileUpload(){
        return (fileUpload.getFileText());
    }
}
