package com.facebook.jni;

import java.util.ArrayList;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    public static native ArrayList nativeGetArmFeatures();
}
