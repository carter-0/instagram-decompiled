package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAppDeviceIdentityResponse extends R5b implements C13662TeT {
    public static final LinkAppDeviceIdentityResponse DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public TAP devicePublicKey_;
    public int error_;
    public int nonce_;
    public TAP serviceUUID_;

    static {
        LinkAppDeviceIdentityResponse linkAppDeviceIdentityResponse = new LinkAppDeviceIdentityResponse();
        DEFAULT_INSTANCE = linkAppDeviceIdentityResponse;
        R5b.A0B(linkAppDeviceIdentityResponse, LinkAppDeviceIdentityResponse.class);
    }

    public LinkAppDeviceIdentityResponse() {
        TAP tap = TAP.A01;
        this.serviceUUID_ = tap;
        this.devicePublicKey_ = tap;
    }
}
