package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C13982TnY;
import X.C66580MXl;
import X.C74232PrL;
import X.NFG;
import X.R33;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Collection extends R5b implements C13662TeT {
    public static final Collection DEFAULT_INSTANCE;
    public static final int MEDIA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public int bitField0_;
    public C13982TnY media_ = R33.A02;
    public String name_ = "";

    static {
        Collection collection = new Collection();
        DEFAULT_INSTANCE = collection;
        R5b.A0B(collection, Collection.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "name_", "media_", Media.class});
            case 3:
                return new Collection();
            case 4:
                return new NFG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Collection.class) {
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
