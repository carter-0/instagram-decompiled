package com.facebook.mobileconfig;

public class MobileConfigNativeFileRepository {
    public static String TAG = "MobileConfigNativeFileRepository";
    public static boolean isNativeBridgeInitialized;

    public static native void registerNativeBridge();

    public static synchronized void registerFileRepository() {
        synchronized (MobileConfigNativeFileRepository.class) {
            if (!isNativeBridgeInitialized) {
                registerNativeBridge();
                isNativeBridgeInitialized = true;
            }
        }
    }
}
