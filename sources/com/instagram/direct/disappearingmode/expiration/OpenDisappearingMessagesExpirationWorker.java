package com.instagram.direct.disappearingmode.expiration;

import X.0nV;
import X.1Eo;
import X.AnonymousClass4D7;
import X.C66162MFz;
import android.content.Context;
import androidx.work.CoroutineWorker;
import com.instagram.common.session.UserSession;

public final class OpenDisappearingMessagesExpirationWorker extends CoroutineWorker {
    public final long A00;
    public final Context A01;
    public final UserSession A02;
    public final 0nV A03;

    public final Object A03(AnonymousClass4D7 r5) {
        return 1Eo.A00(r5, this.A03, new C66162MFz(this, (AnonymousClass4D7) null, 30));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        if (java.lang.Long.valueOf(r1) != null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OpenDisappearingMessagesExpirationWorker(android.content.Context r6, androidx.work.WorkerParameters r7) {
        /*
            r5 = this;
            X.AnonymousClass7TG.A1O(r6, r7)
            r5.<init>(r6, r7)
            r5.A01 = r6
            X.3tw r1 = r7.A02
            r0 = 954(0x3ba, float:1.337E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r4 = r1.A03(r0)
            r3 = 0
            if (r4 == 0) goto L_0x0026
            X.08y r2 = X.09i.A0A
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r4)
            com.instagram.common.session.UserSession r3 = r2.A07(r1)
        L_0x0026:
            r5.A02 = r3
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = 1481080718(0x58477f8e, float:8.7740263E14)
            X.0nV r0 = X.JTP.A0U(r1, r0)
            r5.A03 = r0
            if (r3 == 0) goto L_0x0049
            X.0Tu r2 = X.0Tu.A05
            r0 = 36607140135638544(0x820e0000071610, double:3.2138410546750274E-306)
            long r1 = X.182.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x0049
        L_0x0046:
            r5.A00 = r1
            return
        L_0x0049:
            r1 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.disappearingmode.expiration.OpenDisappearingMessagesExpirationWorker.<init>(android.content.Context, androidx.work.WorkerParameters):void");
    }
}
