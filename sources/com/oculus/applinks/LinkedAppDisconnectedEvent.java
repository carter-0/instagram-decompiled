package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkedAppDisconnectedEvent extends R5b implements C13662TeT {
    public static final LinkedAppDisconnectedEvent DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 1;
    public TAP serviceUUID_ = TAP.A01;

    static {
        LinkedAppDisconnectedEvent linkedAppDisconnectedEvent = new LinkedAppDisconnectedEvent();
        DEFAULT_INSTANCE = linkedAppDisconnectedEvent;
        R5b.A0B(linkedAppDisconnectedEvent, LinkedAppDisconnectedEvent.class);
    }
}
