package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C71827OrU;
import X.C74232PrL;
import X.NFK;
import X.R5b;
import X.SQg;
import X.T5L;

public final class DeviceAdminMessage extends R5b implements C13662TeT {
    public static final DeviceAdminMessage DEFAULT_INSTANCE;
    public static final int DEVICE_ADMIN_MESSAGE_TYPE_FIELD_NUMBER = 1;
    public static final int DEVICE_NAME_FIELD_NUMBER = 2;
    public static volatile C74232PrL PARSER;
    public int bitField0_;
    public int deviceAdminMessageType_;
    public String deviceName_ = "";

    static {
        DeviceAdminMessage deviceAdminMessage = new DeviceAdminMessage();
        DEFAULT_INSTANCE = deviceAdminMessage;
        R5b.A0B(deviceAdminMessage, DeviceAdminMessage.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "deviceAdminMessageType_", C71827OrU.A00, "deviceName_"});
            case 3:
                return new DeviceAdminMessage();
            case 4:
                return new NFK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (DeviceAdminMessage.class) {
                    prL = PARSER;
                    if (prL == null) {
                        SQg sQg = T5L.A01;
                        prL = C66580MXl.A0K(DEFAULT_INSTANCE);
                        PARSER = prL;
                    }
                }
                return prL;
            default:
                throw C66580MXl.A11();
        }
    }
}
