package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;

public final class SoftApCredentials extends R5b implements C13662TeT {
    public static final SoftApCredentials DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public String password_ = "";
    public String ssid_ = "";

    static {
        SoftApCredentials softApCredentials = new SoftApCredentials();
        DEFAULT_INSTANCE = softApCredentials;
        R5b.A0B(softApCredentials, SoftApCredentials.class);
    }
}
