package com.oculus.applinks;

import X.C13662TeT;
import X.C66580MXl;
import X.C68401NFi;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;
import X.TAP;

public final class EnableTrust extends R5b implements C13662TeT {
    public static final EnableTrust DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    public TAP identifier_;
    public TAP signature_;

    static {
        EnableTrust enableTrust = new EnableTrust();
        DEFAULT_INSTANCE = enableTrust;
        R5b.A0B(enableTrust, EnableTrust.class);
    }

    public EnableTrust() {
        TAP tap = TAP.A01;
        this.identifier_ = tap;
        this.signature_ = tap;
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"identifier_", "signature_"});
            case 3:
                return new EnableTrust();
            case 4:
                return new C68401NFi();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (EnableTrust.class) {
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
