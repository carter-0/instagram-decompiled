package X;

import java.util.List;

/* renamed from: X.Ftz  reason: case insensitive filesystem */
public final class C51429Ftz implements Runnable {
    public final /* synthetic */ C49964FGx A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ List A02;

    public C51429Ftz(C49964FGx fGx, 0lg r2, List list) {
        this.A00 = fGx;
        this.A01 = r2;
        this.A02 = list;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            X.FGx r7 = r0.A00
            X.0lg r6 = r0.A01
            java.util.List r12 = r0.A02
            java.lang.String r5 = "add_saved_fb_accounts_end"
            java.lang.String r4 = "facebook_local_auth"
            X.02m r1 = r7.A01
            java.lang.String r16 = "qplLogger"
            if (r1 == 0) goto L_0x00a5
            r3 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.String r0 = "add_saved_fb_accounts_start"
            r1.markerPoint(r3, r0)
            X.8s5 r1 = X.C368108s5.A03     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.8sI r0 = X.C368238sI.SAVED_ACCOUNTS     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.util.List r0 = X.C49964FGx.A04(r7, r6, r1, r0)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            r10 = 0
        L_0x002b:
            boolean r0 = r15.hasNext()     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r2 = r15.next()     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.9Gr r2 = (X.C376139Gr) r2     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.lang.String r1 = "account_type"
            java.lang.String r0 = ""
            X.0eP r13 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.lang.String r1 = "uid"
            X.9Gp r14 = r2.A01     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.9Go r0 = r14.A01     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.lang.String r9 = r0.A02     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r9)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.lang.String r0 = "credential_type"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r4)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            java.lang.String r1 = "token"
            java.lang.String r0 = r14.A00     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r1, r0, r13, r8, r2)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            int r10 = X.C49964FGx.A00(r9, r11, r12, r0, r10)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            goto L_0x002b
        L_0x005e:
            if (r10 != 0) goto L_0x0066
            X.FBe r0 = r7.A05     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            r0.A01(r6, r4)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            goto L_0x0094
        L_0x0066:
            X.FBe r0 = r7.A05     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            r0.A03(r6, r4, r11)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.02m r1 = r7.A01     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            if (r1 != 0) goto L_0x0077
            X.0qQ.A0F(r16)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            throw r0     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
        L_0x0077:
            java.lang.String r0 = "count_of_fb_local_auth_accounts"
            r1.markerAnnotate(r3, r0, r10)     // Catch:{ SecurityException -> 0x0085, Exception -> 0x007d }
            goto L_0x0094
        L_0x007d:
            X.FBe r1 = r7.A05     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "other_exception"
            r1.A02(r6, r4, r0)     // Catch:{ all -> 0x009c }
            goto L_0x0094
        L_0x0085:
            r2 = move-exception
            java.lang.String r1 = "CaaFetchClientDataHelper"
            java.lang.String r0 = "Failed to fetch saved Facebook accounts"
            X.0KC.A0K(r1, r0, r2)     // Catch:{ all -> 0x009c }
            X.FBe r1 = r7.A05     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "security_exception"
            r1.A02(r6, r4, r0)     // Catch:{ all -> 0x009c }
        L_0x0094:
            X.02m r0 = r7.A01
            if (r0 == 0) goto L_0x00a5
            r0.markerPoint(r3, r5)
            return
        L_0x009c:
            r1 = move-exception
            X.02m r0 = r7.A01
            if (r0 == 0) goto L_0x00a5
            r0.markerPoint(r3, r5)
            throw r1
        L_0x00a5:
            X.0qQ.A0F(r16)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51429Ftz.run():void");
    }
}
