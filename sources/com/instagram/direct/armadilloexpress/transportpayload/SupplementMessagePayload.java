package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68413NFu;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class SupplementMessagePayload extends R5b implements C13662TeT {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final SupplementMessagePayload DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int TARGET_MESSAGE_OTID_FIELD_NUMBER = 1;
    public static final int TARGET_MESSAGE_WA_SERVER_TIME_SEC_FIELD_NUMBER = 4;
    public static final int TARGET_WA_THREAD_ID_FIELD_NUMBER = 5;
    public static final int UNIQUING_KEY_FOR_SUPPLEMENTAL_DATA_FIELD_NUMBER = 2;
    public int bitField0_;
    public SupplementMessageContent content_;
    public String targetMessageOtid_ = "";
    public String targetMessageWaServerTimeSec_ = "";
    public String targetWaThreadId_ = "";
    public String uniquingKeyForSupplementalData_ = "";

    static {
        SupplementMessagePayload supplementMessagePayload = new SupplementMessagePayload();
        DEFAULT_INSTANCE = supplementMessagePayload;
        R5b.A0B(supplementMessagePayload, SupplementMessagePayload.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "targetMessageOtid_", "uniquingKeyForSupplementalData_", "content_", "targetMessageWaServerTimeSec_", "targetWaThreadId_"});
            case 3:
                return new SupplementMessagePayload();
            case 4:
                return new C68413NFu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (SupplementMessagePayload.class) {
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
