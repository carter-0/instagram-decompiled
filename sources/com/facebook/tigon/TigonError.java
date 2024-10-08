package com.facebook.tigon;

import X.0qQ;
import X.AnonymousClass3J1;
import com.facebook.tigon.iface.TigonErrorCode;

public final class TigonError {
    public static final AnonymousClass3J1 Companion = new Object();
    public static final TigonError None = new TigonError(TigonErrorCode.NONE, "", 0, "");
    public final String analyticsDetail;
    public final TigonErrorCode category;
    public final int domainErrorCode;
    public final String errorDomain;

    public TigonError(TigonErrorCode tigonErrorCode, String str, int i, String str2) {
        0qQ.A0B(str2, 4);
        this.category = tigonErrorCode;
        this.errorDomain = str;
        this.domainErrorCode = i;
        this.analyticsDetail = str2;
    }
}
