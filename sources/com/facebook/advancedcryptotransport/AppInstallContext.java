package com.facebook.advancedcryptotransport;

import X.MZ7;

public class AppInstallContext {
    public static volatile boolean mIsApplicationFirstRunOnUpgrade;
    public static volatile boolean sShouldFailSendWithEmptyDeviceListEncryptionError;

    public static boolean isApplicationFirstRunOnUpgrade() {
        return mIsApplicationFirstRunOnUpgrade;
    }

    public static boolean shouldFailNextSendWithEmptyDeviceListEncryptionError() {
        boolean z = sShouldFailSendWithEmptyDeviceListEncryptionError;
        sShouldFailSendWithEmptyDeviceListEncryptionError = false;
        return z;
    }

    public static boolean shouldSimulateFutureVersion() {
        return false;
    }

    static {
        MZ7.A00();
    }
}
