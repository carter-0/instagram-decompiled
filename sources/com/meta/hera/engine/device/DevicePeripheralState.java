package com.meta.hera.engine.device;

import X.C13494TbL;
import X.C13663TeU;
import X.R5n;
import X.T5R;

public final class DevicePeripheralState extends R5n implements C13663TeU {
    public static final DevicePeripheralState DEFAULT_INSTANCE;
    public static final int DEVICE_BATTERY_STATE_FIELD_NUMBER = 4;
    public static final int DEVICE_CAMERA_ERROR_STATE_FIELD_NUMBER = 6;
    public static final int DEVICE_PEAK_POWER_STATE_FIELD_NUMBER = 5;
    public static final int DEVICE_THERMAL_STATE_FIELD_NUMBER = 3;
    public static final int GLASSES_HINGE_STATE_FIELD_NUMBER = 1;
    public static final int GLASSES_MOUNT_STATE_FIELD_NUMBER = 2;
    public static volatile C13494TbL PARSER;
    public int bitField0_;
    public int deviceBatteryState_;
    public int deviceCameraErrorState_;
    public int devicePeakPowerState_;
    public int deviceThermalState_;
    public int glassesHingeState_;
    public int glassesMountState_;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.R5n, com.meta.hera.engine.device.DevicePeripheralState] */
    static {
        ? r5n = new R5n();
        DEFAULT_INSTANCE = r5n;
        T5R.A03(DevicePeripheralState.class, r5n);
    }
}
