package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class CreateSoftApNetwork extends R5b implements C13662TeT {
    public static final int BANDWIDTH_FIELD_NUMBER = 9;
    public static final int BAND_FIELD_NUMBER = 3;
    public static final int CHANNEL_FIELD_NUMBER = 4;
    public static final int COUNTRYCODE_FIELD_NUMBER = 6;
    public static final int CREDENTIALS_FIELD_NUMBER = 8;
    public static final CreateSoftApNetwork DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int UUID_FIELD_NUMBER = 7;
    public int band_;
    public int bandwidth_;
    public int channel_;
    public String countryCode_ = "";
    public SoftApCredentials credentials_;
    public boolean hidden_;
    public TAP uuid_ = TAP.A01;

    static {
        CreateSoftApNetwork createSoftApNetwork = new CreateSoftApNetwork();
        DEFAULT_INSTANCE = createSoftApNetwork;
        R5b.A0B(createSoftApNetwork, CreateSoftApNetwork.class);
    }
}
