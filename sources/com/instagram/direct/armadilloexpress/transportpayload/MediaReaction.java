package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFW;
import X.R5b;
import X.SQg;
import X.T5L;

public final class MediaReaction extends R5b implements C13662TeT {
    public static final MediaReaction DEFAULT_INSTANCE;
    public static final int MEDIA_ID_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 2;
    public int bitField0_;
    public String mediaId_ = "";
    public Reaction reaction_;

    static {
        MediaReaction mediaReaction = new MediaReaction();
        DEFAULT_INSTANCE = mediaReaction;
        R5b.A0B(mediaReaction, MediaReaction.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "mediaId_", "reaction_"});
            case 3:
                return new MediaReaction();
            case 4:
                return new NFW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (MediaReaction.class) {
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
