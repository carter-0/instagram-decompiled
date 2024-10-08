package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class LinkAppLinkInfoRequest extends R5b implements C13662TeT {
    public static final LinkAppLinkInfoRequest DEFAULT_INSTANCE;
    public static final int LINKTYPE_FIELD_NUMBER = 3;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int REQUESTTYPE_FIELD_NUMBER = 4;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public int linkType_;
    public int nonce_;
    public int requestType_;
    public TAP serviceUUID_ = TAP.A01;

    static {
        LinkAppLinkInfoRequest linkAppLinkInfoRequest = new LinkAppLinkInfoRequest();
        DEFAULT_INSTANCE = linkAppLinkInfoRequest;
        R5b.A0B(linkAppLinkInfoRequest, LinkAppLinkInfoRequest.class);
    }
}
