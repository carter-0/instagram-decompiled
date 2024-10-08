package com.instagram.pendingmedia.service.upload.armadilloexpress;

import X.C2373637i;
import X.C2373837k;
import X.MU6;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class RenderVideoStep implements MU6 {
    public final UserSession A00;
    public final C2373837k A01;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[Catch:{ all -> 0x0076 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 13
            boolean r0 = X.C66147MDz.A02(r3, r10)
            if (r0 == 0) goto L_0x002a
            r6 = r10
            X.MDz r6 = (X.C66147MDz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A04
            X.1Hj r7 = X.1Hj.A02
            int r2 = r6.A00
            r5 = 2
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r1) goto L_0x0035
            if (r2 != r5) goto L_0x0030
            java.lang.Object r3 = r6.A01
            X.136 r3 = (X.136) r3
            goto L_0x006d
        L_0x002a:
            X.MDz r6 = new X.MDz
            r6.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0035:
            java.lang.Object r3 = r6.A03
            X.136 r3 = (X.136) r3
            java.lang.Object r9 = r6.A02
            java.lang.Object r1 = r6.A01
            X.0eS.A00(r0)
            goto L_0x0050
        L_0x0041:
            X.0eS.A00(r0)
            X.136 r3 = X.C63536Kyl.A00
            X.C66147MDz.A00(r8, r9, r3, r6, r1)
            java.lang.Object r0 = X.136.A00(r6, r3)
            if (r0 == r7) goto L_0x007d
            r1 = r8
        L_0x0050:
            r0 = 8
            X.MJ4 r2 = new X.MJ4     // Catch:{ all -> 0x0076 }
            r2.<init>(r0, r9, r1)     // Catch:{ all -> 0x0076 }
            r6.A01 = r3     // Catch:{ all -> 0x0076 }
            r6.A02 = r4     // Catch:{ all -> 0x0076 }
            r6.A03 = r4     // Catch:{ all -> 0x0076 }
            r6.A00 = r5     // Catch:{ all -> 0x0076 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x0076 }
            X.ImM r0 = new X.ImM     // Catch:{ all -> 0x0076 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = X.1Eo.A00(r6, r1, r0)     // Catch:{ all -> 0x0076 }
            if (r0 != r7) goto L_0x0070
            return r7
        L_0x006d:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0078 }
        L_0x0070:
            X.L28 r0 = (X.L28) r0     // Catch:{ all -> 0x0078 }
            r3.A05(r4)
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0079
        L_0x0078:
            r0 = move-exception
        L_0x0079:
            r3.A05(r4)
            throw r0
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "RenderVideoStep";
    }

    public RenderVideoStep(UserSession userSession, Context context) {
        this.A00 = userSession;
        this.A01 = C2373637i.A00(context, userSession);
    }
}
