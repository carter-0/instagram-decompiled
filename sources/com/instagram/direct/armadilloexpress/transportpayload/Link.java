package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NFT;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Link extends R5b implements C13662TeT {
    public static final Link DEFAULT_INSTANCE;
    public static final int LINK_CONTEXT_FIELD_NUMBER = 2;
    public static volatile C74232PrL PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public int bitField0_;
    public LinkContext linkContext_;
    public String text_ = "";

    static {
        Link link = new Link();
        DEFAULT_INSTANCE = link;
        R5b.A0B(link, Link.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "text_", "linkContext_"});
            case 3:
                return new Link();
            case 4:
                return new NFT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Link.class) {
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
