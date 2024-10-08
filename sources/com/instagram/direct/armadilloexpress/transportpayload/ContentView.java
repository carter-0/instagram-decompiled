package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFI;
import X.R5b;
import X.SQg;
import X.T5L;

public final class ContentView extends R5b implements C13662TeT {
    public static final ContentView DEFAULT_INSTANCE;
    public static final int MIMETYPE_FIELD_NUMBER = 4;
    public static final int OBJECT_ID_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int REPLAYED_FIELD_NUMBER = 3;
    public static final int SCREENSHOTTED_FIELD_NUMBER = 2;
    public static final int SEEN_FIELD_NUMBER = 1;
    public int bitField0_;
    public String mimetype_ = "";
    public String objectId_ = "";
    public boolean replayed_;
    public boolean screenshotted_;
    public boolean seen_;

    static {
        ContentView contentView = new ContentView();
        DEFAULT_INSTANCE = contentView;
        R5b.A0B(contentView, ContentView.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "seen_", "screenshotted_", "replayed_", "mimetype_", "objectId_"});
            case 3:
                return new ContentView();
            case 4:
                return new NFI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (ContentView.class) {
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
