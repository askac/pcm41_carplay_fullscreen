package de.audi.app.terminalmode.pgen2;

import de.audi.app.terminalmode.AbstractTerminalModeConfiguration;
import de.audi.atip.base.IFrameworkAccess;

public class PGen2TMConfiguration
extends AbstractTerminalModeConfiguration {
    private final int screenOffsetX = Integer.parseInt(System.getProperty("terminalmode.screenoffsetx", this.isRightHandDrive() ? "506" : "134"));
    private final int screenOffsetY = Integer.parseInt(System.getProperty("terminalmode.screenoffsety", "55"));
    private final int touchpadX = Integer.parseInt(System.getProperty("terminalmode.touchpadx", "1440"));
    private final int touchpadY = Integer.parseInt(System.getProperty("terminalmode.touchpady", "540"));
    public PGen2TMConfiguration(IFrameworkAccess iFrameworkAccess) {
        super(iFrameworkAccess);
    }

    //@Override
    public boolean hasKnob() {
        return true;
    }

    //@Override
    public boolean hasTouchscreenHigh() {
        return true;
    }

    //@Override
    public String getScreenName() {
        return "Porsche";
    }

    //@Override
    public boolean isAutoConnect() {
        return false;
    }

    //@Override
    public boolean getStoreUserAcceptState() {
        return false;
    }

    //@Override
    public boolean shouldShowDisclaimerAtLeastOnce() {
        return true;
    }

    //@Override
    public boolean isKnobDirectionInverted() {
        return true;
    }

    //@Override
    public boolean usesOldMediaConnector() {
        return true;
    }

    //@Override
    public int getScreenOffsetX() {
        return isRightHandDrive() ? 0 : 114;
        //return this.screenOffsetX;
    }

    //@Override
    public int getScreenOffsetY() {
        return 55;
        //return this.screenOffsetY;
    }

    public int getScreenResolutionX() {
        return 1440;
        //return super.getScreenResolutionX();
    }

    public int getScreenResolutionY() {
        return 540;
        //return super.getScreenResolutionY();
    }

    public int getWindowResolutionX() {
        return 1326;
        //return super.getWindowResolutionX();
    }

    public int getWindowResolutionY() {
        return 480;
        //return super.getWindowResolutionY();
    }

    public int getTMWindowResolutionInXAxis() {
        return 1326;
        //return super.getTMWindowResolutionInXAxis();
    }

    //@Override
     public int getPhysicalDisplayHeight() {
        return 110;
        //return 97;
    }

    //@Override
    public int getPhysicalDisplayWidth() {
        return 295;
        //return 162;
    }

    //@Override
    public int getTouchPadResolutionX() {
        return this.touchpadX;
    }

    //@Override
    public int getTouchPadResolutionY() {
        return this.touchpadY;
    }

    //@Override
    public boolean isTouchScreenInputWidget() {
        return true;
    }

    //@Override
    public boolean hasBothPhoneMFLKeys() {
        return true;
    }

    //@Override
    public boolean supportsDeletionOfConnectedDevices() {
        return true;
    }

    //@Override
    public int getDSICarPlayScreenResolution() {
        return 3;
    }

    //@Override
    public int getCarPlayPhysicalDisplayHeight() {
        return 110;
    }

    //@Override
    public int getCarPlayPhysicalDisplayWidth() {
        return 295;
    }

    //@Override
    public boolean hasTwoVirtualButtonModels() {
        return false;
    }

    public boolean useDSIAndroidAuto2() {
        return true;
    }
}

