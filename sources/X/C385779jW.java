package X;

/* renamed from: X.9jW  reason: invalid class name and case insensitive filesystem */
public final class C385779jW extends 2Cn {
    public final /* synthetic */ AnonymousClass882 A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        0wj.A01.AEf("ClipsTemplateReusableAssetViewModel: fail to download the file.", 817892914).report();
        AnonymousClass882.A00(this.A00);
    }

    public C385779jW(AnonymousClass882 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5 = new X.C349307zv(r7, r7.A0B, r7.A04, r7.A07);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r36) {
        /*
            r35 = this;
            r4 = r36
            java.io.File r4 = (java.io.File) r4
            r8 = 0
            X.0qQ.A0B(r4, r8)
            r3 = 3
            r10 = r35
            X.JtC r0 = X.Q0Y.A01(r4)     // Catch:{ IllegalArgumentException -> 0x0103 }
            long r1 = r0.A02     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r0 = (int) r1     // Catch:{ IllegalArgumentException -> 0x0103 }
            com.instagram.common.gallery.Medium r7 = X.C282665Eg.A03(r4, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0103 }
            X.882 r6 = r10.A00     // Catch:{ IllegalArgumentException -> 0x0103 }
            android.app.Application r2 = r6.A01     // Catch:{ Exception -> 0x0039 }
            com.instagram.common.session.UserSession r1 = r6.A02     // Catch:{ Exception -> 0x0039 }
            X.JZ5 r0 = new X.JZ5     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r2, r7, r1, r8)     // Catch:{ Exception -> 0x0039 }
            X.7zv r5 = r0.call()     // Catch:{ Exception -> 0x0039 }
            int r2 = r5.A09     // Catch:{ Exception -> 0x0039 }
            r0 = 90
            if (r2 == r0) goto L_0x002f
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 != r0) goto L_0x0044
        L_0x002f:
            int r1 = r5.A08     // Catch:{ Exception -> 0x0039 }
            int r0 = r5.A0K     // Catch:{ Exception -> 0x0039 }
            X.7zv r5 = new X.7zv     // Catch:{ Exception -> 0x0039 }
            r5.<init>(r7, r1, r0, r2)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0044
        L_0x0039:
            int r2 = r7.A0B     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r1 = r7.A04     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r0 = r7.A07     // Catch:{ IllegalArgumentException -> 0x0103 }
            X.7zv r5 = new X.7zv     // Catch:{ IllegalArgumentException -> 0x0103 }
            r5.<init>(r7, r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x0044:
            java.util.HashMap r1 = r6.A03     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r0 = r1.size()     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r0 = X.0se.A0L(r0)     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ IllegalArgumentException -> 0x0103 }
            r4.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x0057:
            boolean r0 = r12.hasNext()     // Catch:{ IllegalArgumentException -> 0x0103 }
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r3 = r12.next()     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Object r9 = r3.getKey()     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ IllegalArgumentException -> 0x0103 }
            X.4yf r0 = (X.C279454yf) r0     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Integer r0 = r0.BoD()     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x00e9
            int r2 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ IllegalArgumentException -> 0x0103 }
            X.4yf r0 = (X.C279454yf) r0     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Integer r0 = r0.BoC()     // Catch:{ IllegalArgumentException -> 0x0103 }
            if (r0 == 0) goto L_0x00e4
            int r1 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r11 = r7.A03     // Catch:{ IllegalArgumentException -> 0x0103 }
            r14 = 0
            r0 = 1
            java.lang.String r16 = r5.A06()     // Catch:{ IllegalArgumentException -> 0x0103 }
            int r21 = r1 - r2
            r20 = r1
            r15 = r5
            r17 = r0
            r18 = r11
            r19 = r2
            X.51R r17 = X.C39821AAs.A01(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalArgumentException -> 0x0103 }
            r23 = 0
            r30 = 1073741822(0x3ffffffe, float:1.9999998)
            X.51M r13 = new X.51M     // Catch:{ IllegalArgumentException -> 0x0103 }
            r15 = r14
            r16 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r24 = r8
            r25 = r8
            r26 = r8
            r27 = r8
            r28 = r8
            r29 = r8
            r31 = r8
            r32 = r8
            r33 = r8
            r34 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A06 = r2     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A04 = r1     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A09 = r2     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A08 = r1     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A05 = r2     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A0O = r0     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalArgumentException -> 0x0103 }
            r13.A0G = r0     // Catch:{ IllegalArgumentException -> 0x0103 }
            r4.put(r9, r13)     // Catch:{ IllegalArgumentException -> 0x0103 }
            goto L_0x0057
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            goto L_0x00ed
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x00ed:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x00ee:
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ IllegalArgumentException -> 0x0103 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0103 }
            X.6oS r3 = X.C318116oQ.A00(r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
            r2 = 0
            r1 = 16
            X.MGz r0 = new X.MGz     // Catch:{ IllegalArgumentException -> 0x0103 }
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r2, (int) r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            X.AnonymousClass7TE.A1Z(r0, r3)     // Catch:{ IllegalArgumentException -> 0x0103 }
            return
        L_0x0103:
            X.0wj r2 = X.0wj.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "ClipsTemplateReusableAssetViewModel: cannot create Medium from the file."
            X.0f9 r0 = r2.AEf(r0, r1)
            r0.report()
            X.882 r0 = r10.A00
            X.AnonymousClass882.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385779jW.onSuccess(java.lang.Object):void");
    }
}
