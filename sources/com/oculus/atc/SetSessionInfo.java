package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class SetSessionInfo extends R5b implements C13662TeT {
    public static final SetSessionInfo DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int UUID_FIELD_NUMBER = 1;
    public TAP uuid_ = TAP.A01;

    static {
        SetSessionInfo setSessionInfo = new SetSessionInfo();
        DEFAULT_INSTANCE = setSessionInfo;
        R5b.A0B(setSessionInfo, SetSessionInfo.class);
    }
}
