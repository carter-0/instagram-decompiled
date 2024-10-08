package com.facebook.mediastreaming.opt.transport;

import X.0qQ;
import X.C51973G9u;

public final class TransportError {
    public final String description;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final boolean isConnectionLost;
    public final boolean isStreamTerminated;
    public final boolean isTransient;
    public final String reason;

    public TransportError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 2);
        C51973G9u.A0r(3, str2, str3, str4);
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.description = str3;
        this.fullDescription = str4;
        this.isTransient = z;
        this.isConnectionLost = z2;
        this.isStreamTerminated = z3;
    }
}
