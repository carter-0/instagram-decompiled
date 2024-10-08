package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class CreateWifiDirectNetwork extends R5b implements C13662TeT {
    public static final int BAND_FIELD_NUMBER = 1;
    public static final CreateWifiDirectNetwork DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int UUID_FIELD_NUMBER = 2;
    public int band_;
    public TAP uuid_ = TAP.A01;

    static {
        CreateWifiDirectNetwork createWifiDirectNetwork = new CreateWifiDirectNetwork();
        DEFAULT_INSTANCE = createWifiDirectNetwork;
        R5b.A0B(createWifiDirectNetwork, CreateWifiDirectNetwork.class);
    }
}
