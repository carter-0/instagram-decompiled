package com.facebook.msys.mcp.applicationinfoplugin;

import X.0JC;

public abstract class Sessionless {
    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersion();

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceId();

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessName();

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersionJNI() {
        return "352.0.0.38.100";
    }

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceIdJNI() {
        return null;
    }

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessNameJNI() {
        String str = 0JC.A00().A01;
        if (str == null) {
            return null;
        }
        return str;
    }
}
