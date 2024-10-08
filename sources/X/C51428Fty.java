package X;

import java.util.List;

/* renamed from: X.Fty  reason: case insensitive filesystem */
public final class C51428Fty implements Runnable {
    public final /* synthetic */ C49964FGx A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ List A02;

    public C51428Fty(C49964FGx fGx, 0lg r2, List list) {
        this.A00 = fGx;
        this.A01 = r2;
        this.A02 = list;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0079 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            X.FGx r7 = r0.A00
            X.0lg r6 = r0.A01
            java.util.List r12 = r0.A02
            java.lang.String r5 = "add_active_fb_account_end"
            java.lang.String r4 = "facebook_active_session"
            X.02m r1 = r7.A01
            java.lang.String r15 = "qplLogger"
            if (r1 == 0) goto L_0x00a1
            r3 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_active_fb_account_start"
            r1.markerPoint(r3, r0)
            X.8s5 r1 = X.C368108s5.A03     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.8sI r0 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.util.List r0 = X.C49964FGx.A04(r7, r6, r1, r0)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            r9 = 0
        L_0x002b:
            boolean r0 = r14.hasNext()     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r14.next()     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.9Gr r0 = (X.C376139Gr) r0     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.lang.String r1 = "uid"
            X.9Gp r13 = r0.A01     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.9Go r0 = r13.A01     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.lang.String r10 = r0.A02     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r10)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.lang.String r0 = "credential_type"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r4)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            java.lang.String r1 = "token"
            java.lang.String r0 = r13.A00     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.0eP[] r0 = new X.0eP[]{r8, r2, r0}     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            int r9 = X.C49964FGx.A00(r10, r11, r12, r0, r9)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            goto L_0x002b
        L_0x005a:
            if (r9 != 0) goto L_0x0062
            X.FBe r0 = r7.A05     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            r0.A01(r6, r4)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            goto L_0x0090
        L_0x0062:
            X.FBe r0 = r7.A05     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            r0.A03(r6, r4, r11)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.02m r1 = r7.A01     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            if (r1 != 0) goto L_0x0073
            X.0qQ.A0F(r15)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            throw r0     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
        L_0x0073:
            java.lang.String r0 = "count_of_fb_sso_accounts"
            r1.markerAnnotate(r3, r0, r9)     // Catch:{ SecurityException -> 0x0081, Exception -> 0x0079 }
            goto L_0x0090
        L_0x0079:
            X.FBe r1 = r7.A05     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "other_exception"
            r1.A02(r6, r4, r0)     // Catch:{ all -> 0x0098 }
            goto L_0x0090
        L_0x0081:
            r2 = move-exception
            java.lang.String r1 = "CaaFetchClientDataHelper"
            java.lang.String r0 = "Failed to fetch active Facebook accounts"
            X.0KC.A0K(r1, r0, r2)     // Catch:{ all -> 0x0098 }
            X.FBe r1 = r7.A05     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "security_exception"
            r1.A02(r6, r4, r0)     // Catch:{ all -> 0x0098 }
        L_0x0090:
            X.02m r0 = r7.A01
            if (r0 == 0) goto L_0x00a1
            r0.markerPoint(r3, r5)
            return
        L_0x0098:
            r1 = move-exception
            X.02m r0 = r7.A01
            if (r0 == 0) goto L_0x00a1
            r0.markerPoint(r3, r5)
            throw r1
        L_0x00a1:
            X.0qQ.A0F(r15)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51428Fty.run():void");
    }
}
