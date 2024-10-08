package com.meta.hera.engine.device;

import X.C13494TbL;
import X.C13663TeU;
import X.C13983TnZ;
import X.R5n;
import X.R5p;
import X.T5R;

public final class DeviceState extends R5n implements C13663TeU {
    public static final DeviceState DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 1;
    public static volatile C13494TbL PARSER = null;
    public static final int SEARCH_REQUEST_ID_FIELD_NUMBER = 2;
    public C13983TnZ devices_ = R5p.A02;
    public int searchRequestId_;

    static {
        DeviceState deviceState = new DeviceState();
        DEFAULT_INSTANCE = deviceState;
        T5R.A03(DeviceState.class, deviceState);
    }
}
