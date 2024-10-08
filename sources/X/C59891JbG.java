package X;

/* renamed from: X.JbG  reason: case insensitive filesystem */
public final class C59891JbG extends C67620Mqs {
    public final /* synthetic */ C59870Jat A00;

    public C59891JbG(C59870Jat jat) {
        this.A00 = jat;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.3Q2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.3Q2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r24) {
        /*
            r23 = this;
            r0 = r23
            X.Jat r10 = r0.A00
            X.Jav r5 = r10.A06
            boolean r0 = r5.A01()
            if (r0 != 0) goto L_0x00fc
            com.instagram.common.session.UserSession r0 = r10.A04
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r0)
            java.util.Map r0 = r0.A06
            java.util.Iterator r3 = X.AnonymousClass7TF.A0v(r0)
            r9 = 0
        L_0x0019:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x0019
            X.3QD r1 = r1.A6J
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r1 == r0) goto L_0x0019
            r9 = r2
            goto L_0x0019
        L_0x0034:
            X.3Q2 r9 = (X.AnonymousClass3Q2) r9
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r9 == 0) goto L_0x007a
            java.lang.String r0 = r9.A3w
            if (r0 == 0) goto L_0x007a
            java.io.File r1 = X.AnonymousClass457.A03()
            java.lang.String r0 = r9.A3w
            java.io.File r1 = X.JTO.A0s(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x007a
            java.io.File[] r7 = r1.listFiles()
            if (r7 == 0) goto L_0x007a
            int r6 = r7.length
            r4 = 0
        L_0x0058:
            if (r4 >= r6) goto L_0x007a
            r3 = r7[r4]
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = ".mp4"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "-stitched"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0077
            r2.add(r3)
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x007a:
            boolean r0 = r2.isEmpty()
            r7 = 0
            if (r0 != 0) goto L_0x00fd
            r2.size()
            java.lang.String r6 = "VideoCaptureController"
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x00f1 }
            X.Jaw r0 = r5.A01     // Catch:{ Exception -> 0x00f1 }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x00f1 }
            r11 = 60000(0xea60, float:8.4078E-41)
            int r11 = r11 - r0
            java.util.Iterator r16 = r2.iterator()     // Catch:{ Exception -> 0x00f1 }
        L_0x0098:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x00f1 }
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r1 = r16.next()     // Catch:{ Exception -> 0x00f1 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x00f1 }
            X.JtC r13 = X.Q0Y.A01(r1)     // Catch:{ IllegalArgumentException -> 0x0098 }
            long r4 = r13.A02     // Catch:{ Exception -> 0x00f1 }
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            long r2 = (long) r11     // Catch:{ Exception -> 0x00f1 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00dd
            long r14 = r2 - r4
            r11 = 300(0x12c, double:1.48E-321)
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x00be
            r4 = r2
        L_0x00be:
            java.lang.String r18 = r1.getPath()     // Catch:{ Exception -> 0x00f1 }
            X.JYp r1 = new X.JYp     // Catch:{ Exception -> 0x00f1 }
            r19 = r7
            r20 = r4
            r22 = r7
            r17 = r1
            r17.<init>(r18, r19, r20, r22)     // Catch:{ Exception -> 0x00f1 }
            int r0 = r13.A01     // Catch:{ Exception -> 0x00f1 }
            r1.A02 = r0     // Catch:{ Exception -> 0x00f1 }
            int r0 = r13.A00     // Catch:{ Exception -> 0x00f1 }
            r1.A00 = r0     // Catch:{ Exception -> 0x00f1 }
            r8.add(r1)     // Catch:{ Exception -> 0x00f1 }
            long r2 = r2 - r4
            int r11 = (int) r2     // Catch:{ Exception -> 0x00f1 }
            goto L_0x0098
        L_0x00dd:
            android.os.Handler r1 = r10.A03     // Catch:{ Exception -> 0x00f1 }
            X.M6C r0 = new X.M6C     // Catch:{ Exception -> 0x00f1 }
            r0.<init>(r10, r8)     // Catch:{ Exception -> 0x00f1 }
            r1.post(r0)     // Catch:{ Exception -> 0x00f1 }
            r10.A00 = r9     // Catch:{ Exception -> 0x00f1 }
            r9.getClass()     // Catch:{ Exception -> 0x00f1 }
            X.3QG r0 = r9.A1i     // Catch:{ Exception -> 0x00f1 }
            r0.A01 = r7     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00fc
        L_0x00f1:
            r1 = move-exception
            java.lang.String r0 = "Failed to recover clips :("
            X.0KC.A0F(r6, r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x00fc:
            r7 = 1
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59891JbG.A03(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        if (!AnonymousClass7TE.A1a(obj)) {
            C59870Jat.A00(this.A00);
        }
        MQA mqa = (MQA) this.A00.A0A.get();
        if (mqa != null) {
            ((C59867Jal) mqa).A0d.setEnabled(true);
        }
    }
}
