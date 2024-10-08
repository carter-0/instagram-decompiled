package com.facebook.common.dextricks;

import android.app.ActivityManager;

public class DexOptimizationMessageHandler$Api16PlusUtil {
    public static int getMyImportance() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance;
    }
}
