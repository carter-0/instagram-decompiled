package com.google.android.play.core.review;

import X.AnonymousClass7TE;
import X.C66584MXp;
import android.app.PendingIntent;

public final class zza extends ReviewInfo {
    public final PendingIntent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ReviewInfo) {
                zza zza = (zza) ((ReviewInfo) obj);
                if (!this.A00.equals(zza.A00) || this.A01 != zza.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A00.hashCode() ^ 1000003) * 1000003;
        int i = 1231;
        if (true != this.A01) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.A00.toString();
        boolean z = this.A01;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ReviewInfo{pendingIntent=");
        A1A.append(obj);
        A1A.append(", isNoOp=");
        return C66584MXp.A0b(A1A, z);
    }

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.A00 = pendingIntent;
            this.A01 = z;
            return;
        }
        throw AnonymousClass7TE.A11("Null pendingIntent");
    }
}
