package com.facebook.common.dextricks;

import android.os.Build;

public class DexStore$PreviewSdkHelper {
    public static boolean isPreviewSdk() {
        if (Build.VERSION.PREVIEW_SDK_INT != 0) {
            return true;
        }
        return false;
    }
}
