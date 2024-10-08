package X;

/* renamed from: X.5Nc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C284575Nc implements Runnable {
    public final /* synthetic */ C284515Mu A00;
    public final /* synthetic */ AnonymousClass5ND A01;

    public /* synthetic */ C284575Nc(C284515Mu r1, AnonymousClass5ND r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r12 == 7) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.5Mu r9 = r0.A00
            X.5ND r6 = r0.A01
            int r2 = r9.A03
            int r0 = r6.A01
            int r2 = r2 - r0
            r9.A03 = r2
            boolean r0 = r6.A06
            r5 = 1
            if (r0 == 0) goto L_0x0018
            int r0 = r6.A00
            r9.A02 = r0
            r9.A0F = r5
        L_0x0018:
            int r12 = r9.A05
            r3 = r12
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0038
            int r12 = r6.A02
            boolean r0 = r9.A0k
            r1 = 7
            if (r0 == 0) goto L_0x0094
            if (r12 != r1) goto L_0x0094
            int r0 = r9.A04
            int r0 = r0 - r5
            r9.A04 = r0
            if (r0 != 0) goto L_0x0035
            X.5NA r0 = r6.A03
            boolean r0 = r0.A0F
            r9.A0G = r0
        L_0x0035:
            r0 = r3
        L_0x0036:
            r9.A05 = r0
        L_0x0038:
            if (r2 != 0) goto L_0x00e5
            X.5NA r0 = r6.A03
            com.google.android.exoplayer2.Timeline r7 = r0.A06
            X.5NA r0 = r9.A0C
            com.google.android.exoplayer2.Timeline r0 = r0.A06
            int r1 = r0.A02()
            r0 = 0
            if (r1 != 0) goto L_0x004a
            r0 = 1
        L_0x004a:
            r4 = 0
            if (r0 != 0) goto L_0x005c
            int r0 = r7.A02()
            if (r0 != 0) goto L_0x005c
            r0 = -1
            r9.A01 = r0
            r0 = 0
            r9.A07 = r0
            r9.A06 = r0
        L_0x005c:
            int r0 = r7.A02()
            if (r0 == 0) goto L_0x0098
            r0 = r7
            X.4TA r0 = (X.AnonymousClass4TA) r0
            com.google.android.exoplayer2.Timeline[] r0 = r0.A07
            java.util.List r8 = java.util.Arrays.asList(r0)
            int r2 = r8.size()
            java.util.List r3 = r9.A0i
            int r1 = r3.size()
            r0 = 0
            if (r2 != r1) goto L_0x0079
            r0 = 1
        L_0x0079:
            X.C256703wD.A04(r0)
            r2 = 0
        L_0x007d:
            int r0 = r8.size()
            if (r2 >= r0) goto L_0x0098
            java.lang.Object r1 = r3.get(r2)
            X.5NT r1 = (X.AnonymousClass5NT) r1
            java.lang.Object r0 = r8.get(r2)
            com.google.android.exoplayer2.Timeline r0 = (com.google.android.exoplayer2.Timeline) r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L_0x007d
        L_0x0094:
            r0 = r12
            if (r12 != r1) goto L_0x0036
            goto L_0x0035
        L_0x0098:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x00eb
            X.5NA r0 = r6.A03
            X.4Rq r1 = r0.A08
            X.5NA r0 = r9.A0C
            X.4Rq r0 = r0.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bb
            X.5NA r0 = r6.A03
            long r2 = r0.A02
            X.5NA r0 = r9.A0C
            long r0 = r0.A0I
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00eb
        L_0x00bb:
            int r0 = r7.A02()
            if (r0 == 0) goto L_0x00e6
            X.5NA r3 = r6.A03
            X.4Rq r2 = r3.A08
            int r1 = r2.A00
            r0 = -1
            if (r1 != r0) goto L_0x00e6
            long r15 = r3.A02
            java.lang.Object r1 = r2.A04
            X.4Rc r0 = r9.A0e
            r7.A0B(r0, r1)
            long r0 = r0.A02
            long r15 = r15 + r0
        L_0x00d6:
            r9.A0F = r4
            X.5NA r10 = r6.A03
            r11 = 4
            int r13 = r9.A02
            r14 = -1
            r18 = r5
            r17 = r4
            X.C284515Mu.A0G(r9, r10, r11, r12, r13, r14, r15, r17, r18)
        L_0x00e5:
            return
        L_0x00e6:
            X.5NA r0 = r6.A03
            long r15 = r0.A02
            goto L_0x00d6
        L_0x00eb:
            r5 = 0
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284575Nc.run():void");
    }
}
