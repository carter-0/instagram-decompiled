package com.facebook.video.common.livestreaming;

import X.0qQ;
import X.0rw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51973G9u;
import X.C9588RdS;
import X.JTS;

public class LiveStreamingError {
    public final Throwable A00;
    public final String description;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final LiveStreamingError innerError;
    public final boolean isConnectivityLost;
    public final boolean isRecoverable;
    public final boolean isStreamTerminated;
    public final String reason;

    public LiveStreamingError(String str, String str2, Throwable th, int i, boolean z) {
        this.A00 = th;
        this.errorCode = i;
        this.domain = str;
        String message = th.getMessage();
        message = message == null ? "" : message;
        this.description = message;
        this.reason = message;
        this.fullDescription = str2;
        this.isRecoverable = false;
        this.isConnectivityLost = false;
        this.isStreamTerminated = false;
        Throwable cause = th.getCause();
        LiveStreamingError liveStreamingError = null;
        if (cause != null && !z) {
            String canonicalName = cause.getClass().getCanonicalName();
            String A0l = JTS.A0l(cause);
            0qQ.A07(A0l);
            liveStreamingError = new LiveStreamingError(canonicalName, A0l, cause, C9588RdS.A00(cause), true);
        }
        this.innerError = liveStreamingError;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\n        Error:");
        A1A.append(this.errorCode);
        A1A.append(", \n        Domain:");
        A1A.append(this.domain);
        A1A.append(", \n        Reason:");
        A1A.append(this.reason);
        A1A.append(", \n        Description:");
        A1A.append(this.description);
        A1A.append(", \n        Full Description:");
        A1A.append(this.fullDescription);
        A1A.append(", \n        isTransient:");
        A1A.append(this.isRecoverable);
        A1A.append(", \n        isConnectionLost:");
        A1A.append(this.isConnectivityLost);
        A1A.append(", \n        isStreamTerminated:");
        A1A.append(this.isStreamTerminated);
        String A0t = 0rw.A0t(AnonymousClass7TF.A0l("\n        ", A1A));
        LiveStreamingError liveStreamingError = this.innerError;
        if (liveStreamingError != null) {
            liveStreamingError.toString();
        }
        return A0t;
    }

    public LiveStreamingError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C51973G9u.A0r(3, str2, str3, str4);
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.description = str3;
        this.fullDescription = str4;
        this.isRecoverable = z;
        this.isConnectivityLost = z2;
        this.isStreamTerminated = z3;
        this.A00 = null;
        this.innerError = null;
    }
}
