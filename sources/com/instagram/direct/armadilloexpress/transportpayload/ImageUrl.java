package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFR;
import X.R5b;
import X.SQg;
import X.T5L;

public final class ImageUrl extends R5b implements C13662TeT {
    public static final ImageUrl DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static volatile C74232PrL PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    public int bitField0_;
    public int height_;
    public String url_ = "";
    public int width_;

    static {
        ImageUrl imageUrl = new ImageUrl();
        DEFAULT_INSTANCE = imageUrl;
        R5b.A0B(imageUrl, ImageUrl.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "url_", "width_", "height_"});
            case 3:
                return new ImageUrl();
            case 4:
                return new NFR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (ImageUrl.class) {
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
