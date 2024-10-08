package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68393NFa;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class PrivateReplyInfo extends R5b implements C13662TeT {
    public static final int COMMENT_ID_FIELD_NUMBER = 1;
    public static final PrivateReplyInfo DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int POST_LINK_FIELD_NUMBER = 2;
    public int bitField0_;
    public String commentId_ = "";
    public String postLink_ = "";

    static {
        PrivateReplyInfo privateReplyInfo = new PrivateReplyInfo();
        DEFAULT_INSTANCE = privateReplyInfo;
        R5b.A0B(privateReplyInfo, PrivateReplyInfo.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "commentId_", "postLink_"});
            case 3:
                return new PrivateReplyInfo();
            case 4:
                return new C68393NFa();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (PrivateReplyInfo.class) {
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
