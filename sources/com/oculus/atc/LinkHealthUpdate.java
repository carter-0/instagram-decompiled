package com.oculus.atc;

import X.C13662TeT;
import X.C66580MXl;
import X.C68403NFk;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;
import X.TAP;

public final class LinkHealthUpdate extends R5b implements C13662TeT {
    public static final LinkHealthUpdate DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static volatile C74232PrL PARSER = null;
    public static final int RSSI_FIELD_NUMBER = 2;
    public static final int UUID_FIELD_NUMBER = 1;
    public int event_;
    public int rssi_;
    public TAP uuid_ = TAP.A01;

    static {
        LinkHealthUpdate linkHealthUpdate = new LinkHealthUpdate();
        DEFAULT_INSTANCE = linkHealthUpdate;
        R5b.A0B(linkHealthUpdate, LinkHealthUpdate.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\f", new Object[]{"uuid_", "rssi_", "event_"});
            case 3:
                return new LinkHealthUpdate();
            case 4:
                return new C68403NFk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (LinkHealthUpdate.class) {
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
