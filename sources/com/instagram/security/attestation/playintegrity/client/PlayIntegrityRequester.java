package com.instagram.security.attestation.playintegrity.client;

import X.02m;
import X.C13652TeJ;

public final class PlayIntegrityRequester {
    public final C13652TeJ A00;
    public final 02m A01;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDi, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = X.C66130MDi.A01(r5, r11)
            if (r0 == 0) goto L_0x002a
            r7 = r11
            X.MDi r7 = (X.C66130MDi) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r7.A01 = r2
        L_0x0015:
            java.lang.Object r3 = r7.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A01
            r2 = 1
            r6 = 533736699(0x1fd02cfb, float:8.816584E-20)
            if (r0 == 0) goto L_0x0035
            if (r0 != r2) goto L_0x0030
            int r4 = r7.A00
            java.lang.Object r7 = r7.A02
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester r7 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester) r7
            goto L_0x006e
        L_0x002a:
            X.MDi r7 = new X.MDi
            r7.<init>(r9, r11, r5)
            goto L_0x0015
        L_0x0030:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0035:
            X.0eS.A00(r3)
            X.TeJ r1 = r9.A00
            if (r10 == 0) goto L_0x0093
            X.Qxs r0 = new X.Qxs
            r0.<init>(r10)
            X.9GD r1 = r1.EHU(r0)
            X.0qQ.A07(r1)
            X.Sd3 r0 = new X.Sd3
            r0.<init>(r1)
            X.Q2S r1 = X.Q2T.A00(r0)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r4 = r0.nextInt()
            X.02m r0 = r9.A01     // Catch:{ QpI -> 0x0083 }
            r0.markerStart(r6, r4)     // Catch:{ QpI -> 0x0083 }
            r7.A02 = r9     // Catch:{ QpI -> 0x0083 }
            r7.A00 = r4     // Catch:{ QpI -> 0x0083 }
            r7.A01 = r2     // Catch:{ QpI -> 0x0083 }
            java.lang.Object r3 = X.C70357O3j.A00(r1, r7)     // Catch:{ QpI -> 0x0083 }
            if (r3 != r8) goto L_0x006c
            return r8
        L_0x006c:
            r7 = r9
            goto L_0x0071
        L_0x006e:
            X.0eS.A00(r3)     // Catch:{ QpI -> 0x0081 }
        L_0x0071:
            X.02m r2 = r7.A01     // Catch:{ QpI -> 0x0081 }
            r0 = 2
            r2.markerEnd(r6, r4, r0)     // Catch:{ QpI -> 0x0081 }
            r1 = 533740763(0x1fd03cdb, float:8.8192103E-20)
            java.lang.String r0 = "success"
            r2.A0i(r1, r0)     // Catch:{ QpI -> 0x0081 }
            return r3
        L_0x0081:
            r3 = move-exception
            goto L_0x0085
        L_0x0083:
            r3 = move-exception
            r7 = r9
        L_0x0085:
            X.02m r2 = r7.A01
            r2.markerEnd(r6, r4, r5)
            r1 = 533740510(0x1fd03bde, float:8.819047E-20)
            java.lang.String r0 = "fail"
            r2.A0i(r1, r0)
            throw r3
        L_0x0093:
            java.lang.String r0 = "Null nonce"
            java.lang.NullPointerException r3 = X.AnonymousClass7TE.A11(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public PlayIntegrityRequester(C13652TeJ teJ, 02m r2) {
        this.A00 = teJ;
        this.A01 = r2;
    }
}
