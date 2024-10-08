package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68411NFs;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class TransportPayload extends R5b implements C13662TeT {
    public static final int ADD_FIELD_NUMBER = 1;
    public static final TransportPayload DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    public static final int FRANKING_FIELD_NUMBER = 4;
    public static final int IS_E2EE_ATTRIBUTED_FIELD_NUMBER = 6;
    public static final int OPEN_EB_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int SUPPLEMENT_FIELD_NUMBER = 3;
    public int bitField0_;
    public Franking franking_;
    public boolean isE2EeAttributed_;
    public boolean openEb_;
    public int transportPayloadCase_ = 0;
    public Object transportPayload_;

    static {
        TransportPayload transportPayload = new TransportPayload();
        DEFAULT_INSTANCE = transportPayload;
        R5b.A0B(transportPayload, TransportPayload.class);
    }

    public final AddMessagePayload A0L() {
        if (this.transportPayloadCase_ == 1) {
            return (AddMessagePayload) this.transportPayload_;
        }
        return AddMessagePayload.DEFAULT_INSTANCE;
    }

    public final SupplementMessagePayload A0M() {
        if (this.transportPayloadCase_ == 3) {
            return (SupplementMessagePayload) this.transportPayload_;
        }
        return SupplementMessagePayload.DEFAULT_INSTANCE;
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"transportPayload_", "transportPayloadCase_", "bitField0_", AddMessagePayload.class, DeleteMessagePayload.class, SupplementMessagePayload.class, "franking_", "openEb_", "isE2EeAttributed_"});
            case 3:
                return new TransportPayload();
            case 4:
                return new C68411NFs();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (TransportPayload.class) {
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
