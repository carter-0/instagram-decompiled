package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class NetworkAddress extends R5b implements C13662TeT {
    public static final int ADDRESS_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final NetworkAddress DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PREFIX_LENGTH_FIELD_NUMBER = 2;
    public int addressType_;
    public TAP data_ = TAP.A01;
    public int prefixLength_;

    static {
        NetworkAddress networkAddress = new NetworkAddress();
        DEFAULT_INSTANCE = networkAddress;
        R5b.A0B(networkAddress, NetworkAddress.class);
    }
}
