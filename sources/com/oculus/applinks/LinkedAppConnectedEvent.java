package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkedAppConnectedEvent extends R5b implements C13662TeT {
    public static final LinkedAppConnectedEvent DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 1;
    public TAP serviceUUID_ = TAP.A01;

    static {
        LinkedAppConnectedEvent linkedAppConnectedEvent = new LinkedAppConnectedEvent();
        DEFAULT_INSTANCE = linkedAppConnectedEvent;
        R5b.A0B(linkedAppConnectedEvent, LinkedAppConnectedEvent.class);
    }
}
