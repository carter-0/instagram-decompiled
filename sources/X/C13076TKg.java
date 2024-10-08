package X;

/* renamed from: X.TKg  reason: case insensitive filesystem */
public final class C13076TKg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SBU A01;
    public final /* synthetic */ ST3 A02;
    public final /* synthetic */ C13719Tfk A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public C13076TKg(SBU sbu, ST3 st3, C13719Tfk tfk, Integer num, String str, byte[] bArr, int i) {
        this.A02 = st3;
        this.A05 = str;
        this.A06 = bArr;
        this.A04 = num;
        this.A00 = i;
        this.A03 = tfk;
        this.A01 = sbu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            X.ST3 r4 = r1.A02
            java.lang.String r9 = r1.A05
            byte[] r8 = r1.A06
            java.lang.Integer r0 = r1.A04
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x001a;
                default: goto L_0x0011;
            }
        L_0x0011:
            r10 = 2
        L_0x0012:
            int r7 = r1.A00
            X.Tfk r3 = r1.A03
            r6 = 0
            goto L_0x001c
        L_0x0018:
            r10 = 0
            goto L_0x0012
        L_0x001a:
            r10 = 1
            goto L_0x0012
        L_0x001c:
            X.ST3.A02(r4)     // Catch:{ all -> 0x0154 }
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x0154 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0154 }
            if (r1 != r0) goto L_0x014c
            java.lang.String r15 = ""
            r13 = r15
            java.lang.String r2 = "|"
            boolean r0 = r9.contains(r2)     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = "#"
            if (r0 == 0) goto L_0x0038
            int r1 = r9.indexOf(r2)     // Catch:{ all -> 0x0154 }
            goto L_0x003c
        L_0x0038:
            int r1 = r9.indexOf(r12)     // Catch:{ all -> 0x0154 }
        L_0x003c:
            if (r1 < 0) goto L_0x00e6
            if (r1 == 0) goto L_0x0044
            r0 = 0
            r9.substring(r0, r1)     // Catch:{ all -> 0x0154 }
        L_0x0044:
            java.lang.String r11 = r9.substring(r1)     // Catch:{ all -> 0x0154 }
            boolean r0 = r11.startsWith(r2)     // Catch:{ all -> 0x0154 }
            r14 = 23
            r2 = 1
            if (r0 == 0) goto L_0x0087
            int r0 = r11.length()     // Catch:{ all -> 0x0154 }
            r5 = 12
            if (r0 != r5) goto L_0x006d
            java.lang.String r2 = r11.substring(r2)     // Catch:{ all -> 0x0154 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00e6
            int r1 = r2.length()     // Catch:{ all -> 0x0154 }
            r0 = 11
            if (r1 != r0) goto L_0x00e6
            r15 = r2
            goto L_0x00e6
        L_0x006d:
            if (r0 != r14) goto L_0x0087
            java.lang.String r2 = r11.substring(r2, r5)     // Catch:{ all -> 0x0154 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x0082
            int r1 = r2.length()     // Catch:{ all -> 0x0154 }
            r0 = 11
            if (r1 != r0) goto L_0x0082
            r15 = r2
        L_0x0082:
            java.lang.String r0 = r11.substring(r5)     // Catch:{ all -> 0x0154 }
            goto L_0x00e3
        L_0x0087:
            boolean r0 = r11.startsWith(r12)     // Catch:{ all -> 0x0154 }
            if (r0 == 0) goto L_0x00e6
            int r1 = r11.length()     // Catch:{ all -> 0x0154 }
            if (r1 != r14) goto L_0x00ad
            java.lang.String r2 = r11.substring(r2)     // Catch:{ all -> 0x0154 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r2.startsWith(r12)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00e6
            int r1 = r2.length()     // Catch:{ all -> 0x0154 }
            r0 = 22
            if (r1 != r0) goto L_0x00e6
            r13 = r2
            goto L_0x00e6
        L_0x00ad:
            r5 = 34
            r0 = 45
            if (r1 != r0) goto L_0x00e6
            java.lang.String r2 = r11.substring(r2, r14)     // Catch:{ all -> 0x0154 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r2.startsWith(r12)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00cc
            int r1 = r2.length()     // Catch:{ all -> 0x0154 }
            r0 = 22
            if (r1 != r0) goto L_0x00cc
            r13 = r2
        L_0x00cc:
            java.lang.String r2 = r11.substring(r14, r5)     // Catch:{ all -> 0x0154 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00df
            int r1 = r2.length()     // Catch:{ all -> 0x0154 }
            r0 = 11
            if (r1 != r0) goto L_0x00df
            r15 = r2
        L_0x00df:
            java.lang.String r0 = r11.substring(r5)     // Catch:{ all -> 0x0154 }
        L_0x00e3:
            android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0154 }
        L_0x00e6:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0154 }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r15 = X.002.A0R(r12, r13)     // Catch:{ all -> 0x0154 }
        L_0x00f0:
            android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x014a }
            X.SRA r5 = r4.A0E     // Catch:{ all -> 0x014a }
            monitor-enter(r5)     // Catch:{ all -> 0x014a }
            java.util.Map r0 = X.C11147SCc.A01     // Catch:{ all -> 0x0147 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0147 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0147 }
        L_0x0104:
            X.RFZ r0 = X.RFZ.PUBLISH     // Catch:{ all -> 0x0147 }
            X.SNX r2 = new X.SNX     // Catch:{ all -> 0x0147 }
            r2.<init>(r0, r10)     // Catch:{ all -> 0x0147 }
            X.S1G r0 = new X.S1G     // Catch:{ all -> 0x0147 }
            r0.<init>(r9, r7)     // Catch:{ all -> 0x0147 }
            X.Qc5 r1 = new X.Qc5     // Catch:{ all -> 0x0147 }
            r1.<init>(r2, r0, r8)     // Catch:{ all -> 0x0147 }
            goto L_0x0125
        L_0x0116:
            X.S5H r2 = r5.A0I     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = "Failed to encode topic %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x0147 }
            java.lang.String.format(r6, r1, r0)     // Catch:{ all -> 0x0147 }
            r2.A02(r6)     // Catch:{ all -> 0x0147 }
            goto L_0x0104
        L_0x0125:
            X.RwG r0 = r5.A01     // Catch:{ IOException -> 0x0145 }
            X.SRA.A02(r5, r1, r0)     // Catch:{ IOException -> 0x0145 }
            monitor-exit(r5)     // Catch:{ all -> 0x014a }
            X.Rrs r2 = r4.A0X     // Catch:{ all -> 0x014a }
            if (r2 == 0) goto L_0x013b
            X.ST9 r0 = r2.A01     // Catch:{ all -> 0x014a }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x014a }
            X.TCa r0 = new X.TCa     // Catch:{ all -> 0x014a }
            r0.<init>(r2)     // Catch:{ all -> 0x014a }
            r1.post(r0)     // Catch:{ all -> 0x014a }
        L_0x013b:
            if (r3 == 0) goto L_0x0172
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x014a }
            r3.DoA(r0)     // Catch:{ all -> 0x014a }
            return
        L_0x0145:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r2 = move-exception
            goto L_0x0156
        L_0x014c:
            if (r3 == 0) goto L_0x0172
            java.lang.Integer r0 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x0154 }
            r3.DEe(r0)     // Catch:{ all -> 0x0154 }
            return
        L_0x0154:
            r2 = move-exception
            r15 = r6
        L_0x0156:
            X.RGw r1 = X.C8947RGw.A00(r2)
            X.REg r0 = X.C8889REg.PUBLISH
            X.ST3.A03(r4, r0, r1, r2)
            if (r3 == 0) goto L_0x016f
            java.lang.String r0 = r1.name()
            java.lang.Integer r0 = X.S9M.A00(r0)
            android.text.TextUtils.isEmpty(r15)
            r3.DEe(r0)
        L_0x016f:
            r2.getMessage()
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13076TKg.run():void");
    }
}
