package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAddress extends R5b implements C13662TeT {
    public static final int ADDRESS_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final LinkAddress DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int PREFIX_LENGTH_FIELD_NUMBER = 2;
    public int addressType_;
    public TAP data_ = TAP.A01;
    public int prefixLength_;

    static {
        LinkAddress linkAddress = new LinkAddress();
        DEFAULT_INSTANCE = linkAddress;
        R5b.A0B(linkAddress, LinkAddress.class);
    }
}
