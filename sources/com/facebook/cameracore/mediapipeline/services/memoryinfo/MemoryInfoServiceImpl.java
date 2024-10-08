package com.facebook.cameracore.mediapipeline.services.memoryinfo;

import X.0qQ;
import X.C60960kU;
import android.app.ActivityManager;
import android.content.Context;

public final class MemoryInfoServiceImpl {
    public final long getAvailableMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context context = C60960kU.A00;
        0qQ.A07(context);
        Object systemService = context.getSystemService("activity");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }
}
