package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68407NFo;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class RavenContent extends R5b implements C13662TeT {
    public static final RavenContent DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int STATIC_PHOTO_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 2;
    public int bitField0_;
    public int ravenContentCase_ = 0;
    public Object ravenContent_;

    static {
        RavenContent ravenContent = new RavenContent();
        DEFAULT_INSTANCE = ravenContent;
        R5b.A0B(ravenContent, RavenContent.class);
    }

    public final StaticPhoto A0L() {
        if (this.ravenContentCase_ == 1) {
            return (StaticPhoto) this.ravenContent_;
        }
        return StaticPhoto.DEFAULT_INSTANCE;
    }

    public final Video A0M() {
        if (this.ravenContentCase_ == 2) {
            return (Video) this.ravenContent_;
        }
        return Video.DEFAULT_INSTANCE;
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"ravenContent_", "ravenContentCase_", "bitField0_", StaticPhoto.class, Video.class});
            case 3:
                return new RavenContent();
            case 4:
                return new C68407NFo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (RavenContent.class) {
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
