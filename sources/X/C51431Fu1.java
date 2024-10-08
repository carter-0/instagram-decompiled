package X;

import java.util.List;

/* renamed from: X.Fu1  reason: case insensitive filesystem */
public final class C51431Fu1 implements Runnable {
    public final /* synthetic */ C49964FGx A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ List A02;

    public C51431Fu1(C49964FGx fGx, 0lg r2, List list) {
        this.A00 = fGx;
        this.A01 = r2;
        this.A02 = list;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.FGx r7 = r0.A00
            X.0lg r6 = r0.A01
            java.util.List r11 = r0.A02
            java.lang.String r5 = "add_saved_msgr_accounts_end"
            java.lang.String r4 = "messenger_local_auth"
            X.02m r1 = r7.A01
            java.lang.String r16 = "qplLogger"
            if (r1 == 0) goto L_0x00c2
            r3 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_saved_msgr_accounts_start"
            r1.markerPoint(r3, r0)
            X.EtX r0 = r7.A00     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "caaIgOfflineExperimentManager"
            X.0qQ.A0F(r0)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
        L_0x0023:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            throw r0     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
        L_0x0028:
            X.0Tu r2 = X.0Tu.A05     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            r0 = 18312903031667018(0x410f7d0002394a, double:1.8980437504376663E-307)
            boolean r0 = X.1AW.A06(r2, r0)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007b
            X.8s5 r1 = X.C368108s5.A09     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
        L_0x0039:
            X.8sI r0 = X.C368238sI.ACTIVE_ACCOUNT     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.util.List r0 = X.C49964FGx.A04(r7, r6, r1, r0)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            r10 = 0
        L_0x0048:
            boolean r0 = r15.hasNext()     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r2 = r15.next()     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            X.9Gr r2 = (X.C376139Gr) r2     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.lang.String r1 = "account_type"
            java.lang.String r0 = ""
            X.0eP r13 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.lang.String r1 = "uid"
            X.9Gp r14 = r2.A01     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            X.9Go r0 = r14.A01     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.lang.String r9 = r0.A02     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r9)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.lang.String r0 = "credential_type"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r4)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            java.lang.String r1 = "token"
            java.lang.String r0 = r14.A00     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r1, r0, r13, r8, r2)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            int r10 = X.C49964FGx.A00(r9, r12, r11, r0, r10)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            goto L_0x0048
        L_0x007b:
            X.8s5 r1 = X.C368108s5.A08     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            goto L_0x0039
        L_0x007e:
            if (r10 != 0) goto L_0x0081
            goto L_0x008e
        L_0x0081:
            X.FBe r0 = r7.A05     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            r0.A03(r6, r4, r12)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            X.02m r1 = r7.A01     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            if (r1 != 0) goto L_0x0094
            X.0qQ.A0F(r16)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            goto L_0x0023
        L_0x008e:
            X.FBe r0 = r7.A05     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            r0.A01(r6, r4)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            goto L_0x00b1
        L_0x0094:
            java.lang.String r0 = "count_of_msgr_local_auth_accounts"
            r1.markerAnnotate(r3, r0, r10)     // Catch:{ SecurityException -> 0x00a2, Exception -> 0x009a }
            goto L_0x00b1
        L_0x009a:
            X.FBe r1 = r7.A05     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "other_exception"
            r1.A02(r6, r4, r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x00b1
        L_0x00a2:
            r2 = move-exception
            java.lang.String r1 = "CaaFetchClientDataHelper"
            java.lang.String r0 = "Failed to fetch saved Messenger accounts"
            X.0KC.A0K(r1, r0, r2)     // Catch:{ all -> 0x00b9 }
            X.FBe r1 = r7.A05     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "security_exception"
            r1.A02(r6, r4, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b1:
            X.02m r0 = r7.A01
            if (r0 == 0) goto L_0x00c2
            r0.markerPoint(r3, r5)
            return
        L_0x00b9:
            r1 = move-exception
            X.02m r0 = r7.A01
            if (r0 == 0) goto L_0x00c2
            r0.markerPoint(r3, r5)
            throw r1
        L_0x00c2:
            X.0qQ.A0F(r16)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51431Fu1.run():void");
    }
}
