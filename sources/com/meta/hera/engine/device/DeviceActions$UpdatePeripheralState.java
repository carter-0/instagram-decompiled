package com.meta.hera.engine.device;

import X.C13494TbL;
import X.C13663TeU;
import X.R5n;
import X.T5R;

public final class DeviceActions$UpdatePeripheralState extends R5n implements C13663TeU {
    public static final DeviceActions$UpdatePeripheralState DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int DEVICE_PERIPHERAL_STATE_FIELD_NUMBER = 2;
    public static volatile C13494TbL PARSER = null;
    public static final int PHONE_PERIPHERAL_STATE_FIELD_NUMBER = 3;
    public int deltaCase_ = 0;
    public Object delta_;
    public String deviceId_ = "";

    static {
        DeviceActions$UpdatePeripheralState deviceActions$UpdatePeripheralState = new DeviceActions$UpdatePeripheralState();
        DEFAULT_INSTANCE = deviceActions$UpdatePeripheralState;
        T5R.A03(DeviceActions$UpdatePeripheralState.class, deviceActions$UpdatePeripheralState);
    }
}
