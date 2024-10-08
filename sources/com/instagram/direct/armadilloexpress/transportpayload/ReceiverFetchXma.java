package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68396NFd;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class ReceiverFetchXma extends R5b implements C13662TeT {
    public static final int CONTENT_REF_FIELD_NUMBER = 1;
    public static final ReceiverFetchXma DEFAULT_INSTANCE;
    public static final int MEDIA_FIELD_NUMBER = 3;
    public static volatile C74232PrL PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public int bitField0_;
    public String contentRef_ = "";
    public Media media_;
    public String text_ = "";

    static {
        ReceiverFetchXma receiverFetchXma = new ReceiverFetchXma();
        DEFAULT_INSTANCE = receiverFetchXma;
        R5b.A0B(receiverFetchXma, ReceiverFetchXma.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "contentRef_", "text_", "media_"});
            case 3:
                return new ReceiverFetchXma();
            case 4:
                return new C68396NFd();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (ReceiverFetchXma.class) {
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
