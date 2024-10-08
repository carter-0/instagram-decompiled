package com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig;

public abstract class Sessionless {
    public abstract int IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(String str, String str2);

    public abstract boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(String str, String str2);

    private int IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalledJNI(String str, String str2) {
        return IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(str, str2);
    }

    private boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstallJNI(String str, String str2) {
        return IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(str, str2);
    }
}
