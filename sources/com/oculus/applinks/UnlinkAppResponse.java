package com.oculus.applinks;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;

public final class UnlinkAppResponse extends R5b implements C13662TeT {
    public static final UnlinkAppResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public int error_;
    public int nonce_;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.oculus.applinks.UnlinkAppResponse, X.R5b] */
    static {
        ? r5b = new R5b();
        DEFAULT_INSTANCE = r5b;
        R5b.A0B(r5b, UnlinkAppResponse.class);
    }
}
