package de.audi.app.terminalmode;

import de.audi.atip.base.IFrameworkAccess;

public class AbstractTerminalModeConfiguration 
{
    public AbstractTerminalModeConfiguration (IFrameworkAccess iFrameworkAccess)
    {
        
    }
    public boolean isRightHandDrive() {
        return true;
    }
}