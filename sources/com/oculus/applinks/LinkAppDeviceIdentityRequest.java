package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAppDeviceIdentityRequest extends R5b implements C13662TeT {
    public static final LinkAppDeviceIdentityRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public int nonce_;
    public TAP serviceUUID_ = TAP.A01;

    static {
        LinkAppDeviceIdentityRequest linkAppDeviceIdentityRequest = new LinkAppDeviceIdentityRequest();
        DEFAULT_INSTANCE = linkAppDeviceIdentityRequest;
        R5b.A0B(linkAppDeviceIdentityRequest, LinkAppDeviceIdentityRequest.class);
    }
}
