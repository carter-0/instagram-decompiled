package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAppRegisterRequest extends R5b implements C13662TeT {
    public static final int APPPUBLICKEY_FIELD_NUMBER = 2;
    public static final LinkAppRegisterRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public TAP appPublicKey_ = TAP.A01;
    public int nonce_;

    static {
        LinkAppRegisterRequest linkAppRegisterRequest = new LinkAppRegisterRequest();
        DEFAULT_INSTANCE = linkAppRegisterRequest;
        R5b.A0B(linkAppRegisterRequest, LinkAppRegisterRequest.class);
    }
}
