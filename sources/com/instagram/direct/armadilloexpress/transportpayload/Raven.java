package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68394NFb;
import X.C69515Nmx;
import X.C71830OrX;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Raven extends R5b implements C13662TeT {
    public static final int CONTENT_FIELD_NUMBER = 2;
    public static final Raven DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int VIEW_MODE_FIELD_NUMBER = 1;
    public int bitField0_;
    public RavenContent content_;
    public int viewMode_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.R5b, com.instagram.direct.armadilloexpress.transportpayload.Raven] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, Raven.class);
    }

    public final C69515Nmx A0L() {
        int i = this.viewMode_;
        if (i != 0) {
            if (i == 1) {
                return C69515Nmx.RAVEN_VIEW_MODEL_ONCE;
            }
            if (i == 2) {
                return C69515Nmx.RAVEN_VIEW_MODEL_REPLAYABLE;
            }
            if (i == 3) {
                return C69515Nmx.RAVEN_VIEW_MODEL_PERMANENT;
            }
        }
        return C69515Nmx.RAVEN_VIEW_MODEL_UNSPECIFIED;
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "viewMode_", C71830OrX.A00, "content_"});
            case 3:
                return new R5b();
            case 4:
                return new C68394NFb();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Raven.class) {
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
