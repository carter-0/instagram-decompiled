package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68395NFc;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Reaction extends R5b implements C13662TeT {
    public static final Reaction DEFAULT_INSTANCE;
    public static final int EMOJI_FIELD_NUMBER = 3;
    public static volatile C74232PrL PARSER = null;
    public static final int REACTION_STATUS_FIELD_NUMBER = 2;
    public static final int REACTION_TYPE_FIELD_NUMBER = 1;
    public static final int SUPER_REACT_TYPE_FIELD_NUMBER = 4;
    public int bitField0_;
    public String emoji_ = "";
    public String reactionStatus_ = "";
    public String reactionType_ = "";
    public String superReactType_ = "";

    static {
        Reaction reaction = new Reaction();
        DEFAULT_INSTANCE = reaction;
        R5b.A0B(reaction, Reaction.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "reactionType_", "reactionStatus_", "emoji_", "superReactType_"});
            case 3:
                return new Reaction();
            case 4:
                return new C68395NFc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Reaction.class) {
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
