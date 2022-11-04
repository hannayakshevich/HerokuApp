package org.tms.services;

import org.tms.pages.ContextMenu;

public class ContextMenuService {

    protected ContextMenu contextMenu = new ContextMenu();
    private static final String WEB_PAGE_CONTEXT_MENU = "http://the-internet.herokuapp.com/context_menu";

    public void openAlertMenu(){
        contextMenu.openPageContextMenu(WEB_PAGE_CONTEXT_MENU);
        contextMenu.openAlert();
    }

    public String getAlertText(){
        return contextMenu.getAlertText();
    }

}
