package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class JoinAccessPoint extends R5b implements C13662TeT {
    public static final int BANDWIDTH_FIELD_NUMBER = 4;
    public static final JoinAccessPoint DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PASSPHRASE_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 3;
    public int bandwidth_;
    public String passphrase_ = "";
    public String ssid_ = "";
    public TAP uuid_ = TAP.A01;

    static {
        JoinAccessPoint joinAccessPoint = new JoinAccessPoint();
        DEFAULT_INSTANCE = joinAccessPoint;
        R5b.A0B(joinAccessPoint, JoinAccessPoint.class);
    }
}
