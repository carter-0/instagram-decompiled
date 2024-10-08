package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C13965TmS;
import X.C66580MXl;
import X.C68409NFq;
import X.C74232PrL;
import X.R30;
import X.R5b;
import X.SQg;
import X.T5L;

public final class StaticPhoto extends R5b implements C13662TeT {
    public static final StaticPhoto DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int MEDIA_TRANSPORT_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int SCAN_LENGTHS_FIELD_NUMBER = 4;
    public static final int THUMBNAIL_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public int bitField0_;
    public int height_;
    public CommonMediaTransport mediaTransport_;
    public int scanLengthsMemoizedSerializedSize = -1;
    public C13965TmS scanLengths_ = R30.A02;
    public Thumbnail thumbnail_;
    public int width_;

    static {
        StaticPhoto staticPhoto = new StaticPhoto();
        DEFAULT_INSTANCE = staticPhoto;
        R5b.A0B(staticPhoto, StaticPhoto.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004'\u0005ဉ\u0003", new Object[]{"bitField0_", "mediaTransport_", "height_", "width_", "scanLengths_", "thumbnail_"});
            case 3:
                return new StaticPhoto();
            case 4:
                return new C68409NFq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (StaticPhoto.class) {
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
