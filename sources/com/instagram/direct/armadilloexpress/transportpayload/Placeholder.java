package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C71829OrW;
import X.C74232PrL;
import X.NFY;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Placeholder extends R5b implements C13662TeT {
    public static final Placeholder DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PLACEHOLDER_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public int placeholderType_;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.direct.armadilloexpress.transportpayload.Placeholder, X.R5b] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, Placeholder.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "placeholderType_", C71829OrW.A00});
            case 3:
                return new R5b();
            case 4:
                return new NFY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Placeholder.class) {
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
