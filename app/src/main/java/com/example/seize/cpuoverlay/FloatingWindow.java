package com.example.seize.cpuoverlay;

import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import wei.mark.standout.StandOutWindow;
import wei.mark.standout.constants.StandOutFlags;
import wei.mark.standout.ui.Window;

/**
 * Created by Rifat Rashid on 7/13/2016.
 */
public class FloatingWindow extends StandOutWindow{
    /**
     * Return the name of every window in this implementation. The name will
     * appear in the default implementations of the system window decoration
     * title and notification titles.
     *
     * @return The name.
     */
    @Override
    public String getAppName() {
        return "CPU Overlay";
    }

    /**
     * Return the icon resource for every window in this implementation. The
     * icon will appear in the default implementations of the system window
     * decoration and notifications.
     *
     * @return The icon.
     */
    @Override
    public int getAppIcon() {
        return android.R.drawable.ic_menu_close_clear_cancel;
    }

    @Override
    public void createAndAttachView(int id, FrameLayout frame) {
        //create a new layout from body.xml
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.floating_window_layout, frame, true);
    }

    //the window will be centered
    @Override
    public StandOutLayoutParams getParams(int id, Window window) {
        return new StandOutLayoutParams(id, 250, 300, StandOutLayoutParams.CENTER, StandOutLayoutParams.CENTER);
    }

    @Override
    public int getFlags(int id){
        return  super.getFlags(id) | StandOutFlags.FLAG_BODY_MOVE_ENABLE | StandOutFlags.FLAG_WINDOW_FOCUSABLE_DISABLE;
    }

    @Override
    public String getPersistentNotificationMessage(int id){
        return "Click to close the SimpleWindow";
    }

    @Override
    public Intent getPersistentNotificationIntent(int id){
        return StandOutWindow.getCloseIntent(this, FloatingWindow.class, id);
    }
}
