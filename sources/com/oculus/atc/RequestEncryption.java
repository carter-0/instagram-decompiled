package com.oculus.atc;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;
import X.TAP;

public final class RequestEncryption extends R5b implements C13662TeT {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    public static final RequestEncryption DEFAULT_INSTANCE;
    public static final int ELLIPTICCURVE_FIELD_NUMBER = 3;
    public static final int KEYHINT_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SUPPORTEDPARAMETERS_FIELD_NUMBER = 4;
    public TAP challenge_;
    public C13982TnY keyHint_;
    public int keyTypeCase_ = 0;
    public Object keyType_;
    public TAP publicKey_;
    public int supportedParameters_;

    static {
        RequestEncryption requestEncryption = new RequestEncryption();
        DEFAULT_INSTANCE = requestEncryption;
        R5b.A0B(requestEncryption, RequestEncryption.class);
    }

    public RequestEncryption() {
        TAP tap = TAP.A01;
        this.publicKey_ = tap;
        this.challenge_ = tap;
        this.keyHint_ = R33.A02;
    }
}
