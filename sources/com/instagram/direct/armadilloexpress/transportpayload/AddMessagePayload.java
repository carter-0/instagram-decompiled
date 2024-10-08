package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFD;
import X.R5b;
import X.SQg;
import X.T5L;

public final class AddMessagePayload extends R5b implements C13662TeT {
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final AddMessagePayload DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static volatile C74232PrL PARSER;
    public int bitField0_;
    public AddMessageContent content_;
    public AddMessageMetadata metadata_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R5b, com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, AddMessagePayload.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "content_", "metadata_"});
            case 3:
                return new R5b();
            case 4:
                return new NFD();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (AddMessagePayload.class) {
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
