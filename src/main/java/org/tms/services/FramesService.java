package org.tms.services;

import org.tms.pages.Frames;

public class FramesService {

    private static final String WEB_PAGE_FRAMES = "http://the-internet.herokuapp.com/frames";
    Frames frames = new Frames();

    public void openFrame(){
        frames.openPageFrame(WEB_PAGE_FRAMES);
        frames.openFrame();

    }

    public String getFrameText(){
        return (frames.getFrameText());
    }
}
