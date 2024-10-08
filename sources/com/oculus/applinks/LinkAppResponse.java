package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAppResponse extends R5b implements C13662TeT {
    public static final LinkAppResponse DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public TAP devicePublicKey_ = TAP.A01;
    public int error_;
    public int nonce_;

    static {
        LinkAppResponse linkAppResponse = new LinkAppResponse();
        DEFAULT_INSTANCE = linkAppResponse;
        R5b.A0B(linkAppResponse, LinkAppResponse.class);
    }
}
