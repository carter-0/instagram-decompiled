package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFS;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Like extends R5b implements C13662TeT {
    public static final Like DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.direct.armadilloexpress.transportpayload.Like, X.R5b] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, Like.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
            case 3:
                return new R5b();
            case 4:
                return new NFS();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Like.class) {
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
