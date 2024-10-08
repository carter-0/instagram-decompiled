package com.android.webview.chromium.membrane;

import X.Pxe;

public class AppHostedChromiumLoader {
    public static final String IMPL_CLASS_NAME = "com.android.webview.chromium.AppHostedChromiumImpl";

    public static AppHostedChromium fromClassLoader(ClassLoader classLoader) {
        try {
            return (AppHostedChromium) classLoader.loadClass(IMPL_CLASS_NAME).newInstance();
        } catch (ClassNotFoundException e) {
            throw Pxe.A0u("Provider implementation not found", e);
        } catch (IllegalAccessException | InstantiationException e2) {
            throw Pxe.A0u("Failed to initialize provider", e2);
        }
    }
}
