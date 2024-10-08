package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFC;
import X.R5b;
import X.SQg;
import X.T5L;

public final class AddMessageMetadata extends R5b implements C13662TeT {
    public static final AddMessageMetadata DEFAULT_INSTANCE;
    public static final int EPHEMERALITY_PARAMS_FIELD_NUMBER = 5;
    public static final int FORWARDING_PARAMS_FIELD_NUMBER = 4;
    public static volatile C74232PrL PARSER = null;
    public static final int PRIVATE_REPLY_INFO_FIELD_NUMBER = 2;
    public static final int REPLIED_TO_MESSAGE_FIELD_NUMBER = 3;
    public static final int SEND_SILENTLY_FIELD_NUMBER = 1;
    public int bitField0_;
    public EphemeralityParams ephemeralityParams_;
    public ForwardingParams forwardingParams_;
    public PrivateReplyInfo privateReplyInfo_;
    public RepliedToMessage repliedToMessage_;
    public boolean sendSilently_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R5b, com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, AddMessageMetadata.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "sendSilently_", "privateReplyInfo_", "repliedToMessage_", "forwardingParams_", "ephemeralityParams_"});
            case 3:
                return new R5b();
            case 4:
                return new NFC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (AddMessageMetadata.class) {
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
