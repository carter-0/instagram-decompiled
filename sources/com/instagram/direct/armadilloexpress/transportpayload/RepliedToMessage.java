package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68397NFe;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class RepliedToMessage extends R5b implements C13662TeT {
    public static final RepliedToMessage DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int REPLIED_TO_MESSAGE_COLLECTION_ITEM_ID_FIELD_NUMBER = 3;
    public static final int REPLIED_TO_MESSAGE_OTID_FIELD_NUMBER = 1;
    public static final int REPLIED_TO_MESSAGE_WA_SERVER_TIME_SEC_FIELD_NUMBER = 2;
    public int bitField0_;
    public String repliedToMessageCollectionItemId_ = "";
    public String repliedToMessageOtid_ = "";
    public String repliedToMessageWaServerTimeSec_ = "";

    static {
        RepliedToMessage repliedToMessage = new RepliedToMessage();
        DEFAULT_INSTANCE = repliedToMessage;
        R5b.A0B(repliedToMessage, RepliedToMessage.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "repliedToMessageOtid_", "repliedToMessageWaServerTimeSec_", "repliedToMessageCollectionItemId_"});
            case 3:
                return new RepliedToMessage();
            case 4:
                return new C68397NFe();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (RepliedToMessage.class) {
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
