package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68400NFh;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class VideoExtraMetadata extends R5b implements C13662TeT {
    public static final VideoExtraMetadata DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int UPLOAD_MOS_CLIENT_SCORE_FIELD_NUMBER = 1;
    public int bitField0_;
    public float uploadMosClientScore_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R5b, com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, VideoExtraMetadata.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "uploadMosClientScore_"});
            case 3:
                return new R5b();
            case 4:
                return new C68400NFh();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (VideoExtraMetadata.class) {
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
