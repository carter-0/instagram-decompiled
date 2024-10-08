package com.facebook.cameracore.ardelivery.util.hardwarebackend.chipset;

import X.0KC;
import X.0dV;
import com.facebook.jni.HybridData;
import java.util.HashMap;
import java.util.Map;

public final class ChipsetInfoUtil {
    public static ChipsetInfoUtil THE_ONE;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native String[] nativeGetVulkanInfo();

    static {
        try {
            0dV.A0C("chipset");
        } catch (UnsatisfiedLinkError e) {
            0KC.A0G("ChipsetInfoUtil", "Unsatisfied link error when loading chipset native library", e);
        }
    }

    public Map getVulkanInfo() {
        String[] nativeGetVulkanInfo = nativeGetVulkanInfo();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < nativeGetVulkanInfo.length; i += 2) {
            hashMap.put(nativeGetVulkanInfo[i], nativeGetVulkanInfo[i + 1]);
        }
        return hashMap;
    }
}
