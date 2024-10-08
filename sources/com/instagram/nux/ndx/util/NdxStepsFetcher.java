package com.instagram.nux.ndx.util;

import X.0qQ;
import com.instagram.common.session.UserSession;
import com.instagram.nux.ndx.api.NDXIGStepsAPI;

public final class NdxStepsFetcher {
    public final UserSession A00;
    public final NDXIGStepsAPI A01;
    public final Integer A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.nux.ndx.api.NDXIGStepsAPI, java.lang.Object] */
    public /* synthetic */ NdxStepsFetcher(UserSession userSession, Integer num) {
        ? obj = new Object();
        0qQ.A0B(num, 2);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r2 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(int r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 17
            boolean r0 = X.ME6.A02(r3, r8)
            if (r0 == 0) goto L_0x0064
            r5 = r8
            X.ME6 r5 = (X.ME6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r3) goto L_0x0071
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003e
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            if (r2 == 0) goto L_0x003c
        L_0x0036:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            return r2
        L_0x003e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006c
            X.0gF r0 = X.C60340gF.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "NDX IG Server Step Fetch Error"
            X.0wb.A03(r0, r1)
            goto L_0x0036
        L_0x004e:
            X.0eS.A00(r1)
            com.instagram.nux.ndx.api.NDXIGStepsAPI r2 = r6.A01
            com.instagram.common.session.UserSession r1 = r6.A00
            java.lang.Integer r0 = r6.A02
            java.lang.String r0 = X.C49048EoS.A00(r0)
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r1, r0, r5, r7)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0064:
            r0 = 42
            X.ME6 r5 = new X.ME6
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0016
        L_0x006c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFetcher.A00(int, X.4D7):java.lang.Object");
    }
}
