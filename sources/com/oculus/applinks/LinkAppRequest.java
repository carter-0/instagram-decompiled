package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAppRequest extends R5b implements C13662TeT {
    public static final int APPPUBLICKEY_FIELD_NUMBER = 3;
    public static final int BUNDLEIDENTIFIER_FIELD_NUMBER = 4;
    public static final LinkAppRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public TAP appPublicKey_;
    public String bundleIdentifier_ = "";
    public int nonce_;
    public TAP serviceUUID_;

    static {
        LinkAppRequest linkAppRequest = new LinkAppRequest();
        DEFAULT_INSTANCE = linkAppRequest;
        R5b.A0B(linkAppRequest, LinkAppRequest.class);
    }

    public LinkAppRequest() {
        TAP tap = TAP.A01;
        this.serviceUUID_ = tap;
        this.appPublicKey_ = tap;
    }
}
