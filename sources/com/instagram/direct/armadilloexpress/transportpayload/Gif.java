package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFQ;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Gif extends R5b implements C13662TeT {
    public static final Gif DEFAULT_INSTANCE;
    public static final int GIF_SIZE_FIELD_NUMBER = 7;
    public static final int GIF_URL_FIELD_NUMBER = 6;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int IS_RANDOM_FIELD_NUMBER = 8;
    public static final int IS_STICKER_FIELD_NUMBER = 4;
    public static final int MEDIA_TRANSPORT_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int STICKER_ID_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public int bitField0_;
    public int gifSize_;
    public String gifUrl_ = "";
    public int height_;
    public boolean isRandom_;
    public boolean isSticker_;
    public CommonMediaTransport mediaTransport_;
    public String stickerId_ = "";
    public int width_;

    static {
        Gif gif = new Gif();
        DEFAULT_INSTANCE = gif;
        R5b.A0B(gif, Gif.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bဇ\u0007", new Object[]{"bitField0_", "mediaTransport_", "height_", "width_", "isSticker_", "stickerId_", "gifUrl_", "gifSize_", "isRandom_"});
            case 3:
                return new Gif();
            case 4:
                return new NFQ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Gif.class) {
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
