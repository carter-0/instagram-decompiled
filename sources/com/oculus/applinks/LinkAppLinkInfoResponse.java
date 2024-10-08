package com.oculus.applinks;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;
import X.TAP;

public final class LinkAppLinkInfoResponse extends R5b implements C13662TeT {
    public static final int ADDRESSES_FIELD_NUMBER = 3;
    public static final int BUILDFLAVOR_FIELD_NUMBER = 8;
    public static final LinkAppLinkInfoResponse DEFAULT_INSTANCE;
    public static final int DEVICEIMAGEASSETURI_FIELD_NUMBER = 6;
    public static final int DEVICEMODELNAME_FIELD_NUMBER = 7;
    public static final int DEVICENAME_FIELD_NUMBER = 9;
    public static final int DEVICESERIAL_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int FIRMWAREVERSION_FIELD_NUMBER = 4;
    public static final int HARDWARETYPE_FIELD_NUMBER = 10;
    public static final int MACADDRESS_FIELD_NUMBER = 11;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public C13982TnY addresses_ = R33.A02;
    public TAP buildFlavor_;
    public TAP deviceImageAssetURI_;
    public TAP deviceModelName_;
    public TAP deviceName_;
    public TAP deviceSerial_;
    public int error_;
    public TAP firmwareVersion_;
    public TAP hardwareType_;
    public TAP macAddress_;
    public int nonce_;

    static {
        LinkAppLinkInfoResponse linkAppLinkInfoResponse = new LinkAppLinkInfoResponse();
        DEFAULT_INSTANCE = linkAppLinkInfoResponse;
        R5b.A0B(linkAppLinkInfoResponse, LinkAppLinkInfoResponse.class);
    }

    public LinkAppLinkInfoResponse() {
        TAP tap = TAP.A01;
        this.firmwareVersion_ = tap;
        this.deviceSerial_ = tap;
        this.deviceImageAssetURI_ = tap;
        this.deviceModelName_ = tap;
        this.buildFlavor_ = tap;
        this.deviceName_ = tap;
        this.hardwareType_ = tap;
        this.macAddress_ = tap;
    }
}
