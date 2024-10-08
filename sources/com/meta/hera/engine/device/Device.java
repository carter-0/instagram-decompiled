package com.meta.hera.engine.device;

import X.C13494TbL;
import X.C13663TeU;
import X.R5n;
import X.T5R;

public final class Device extends R5n implements C13663TeU {
    public static final Device DEFAULT_INSTANCE;
    public static final int DEVICE_PERIPHERAL_STATE_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_HEARTBEAT_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C13494TbL PARSER = null;
    public static final int PHONE_PERIPHERAL_STATE_FIELD_NUMBER = 7;
    public static final int ROLE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 4;
    public int bitField0_;
    public String id_ = "";
    public long lastHeartbeatTimestampMs_;
    public String name_ = "";
    public int peripheralStateCase_ = 0;
    public Object peripheralState_;
    public int role_;
    public int status_;

    static {
        Device device = new Device();
        DEFAULT_INSTANCE = device;
        T5R.A03(Device.class, device);
    }
}
