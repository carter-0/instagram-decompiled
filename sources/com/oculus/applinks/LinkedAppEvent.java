package com.oculus.applinks;

import X.C13662TeT;
import X.C66580MXl;
import X.C68402NFj;
import X.C74232PrL;
import X.R5b;
import X.SQg;
import X.T5L;

public final class LinkedAppEvent extends R5b implements C13662TeT {
    public static final int CONNECTED_FIELD_NUMBER = 10;
    public static final LinkedAppEvent DEFAULT_INSTANCE;
    public static final int DISCONNECTED_FIELD_NUMBER = 11;
    public static volatile C74232PrL PARSER;
    public int eventCase_ = 0;
    public Object event_;

    static {
        LinkedAppEvent linkedAppEvent = new LinkedAppEvent();
        DEFAULT_INSTANCE = linkedAppEvent;
        R5b.A0B(linkedAppEvent, LinkedAppEvent.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\n\u000b\u0002\u0000\u0000\u0000\n<\u0000\u000b<\u0000", new Object[]{"event_", "eventCase_", LinkedAppConnectedEvent.class, LinkedAppDisconnectedEvent.class});
            case 3:
                return new LinkedAppEvent();
            case 4:
                return new C68402NFj();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (LinkedAppEvent.class) {
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
