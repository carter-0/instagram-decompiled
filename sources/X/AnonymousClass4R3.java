package X;

/* renamed from: X.4R3  reason: invalid class name */
public abstract class AnonymousClass4R3 implements AnonymousClass4R4 {
    public final AnonymousClass4RE A00 = new AnonymousClass4RE();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        if (r10 < r7.A02()) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(int r16, long r17) {
        /*
            r15 = this;
            r9 = r15
            boolean r0 = r15 instanceof X.AnonymousClass4R2
            r10 = r16
            r13 = r17
            if (r0 == 0) goto L_0x00c0
            r3 = r9
            X.4R2 r3 = (X.AnonymousClass4R2) r3
            X.4Rp r0 = r3.A0B
            com.google.android.exoplayer2.Timeline r7 = r0.A03
            if (r16 < 0) goto L_0x00ba
            int r0 = r7.A02()
            r1 = 0
            if (r0 != 0) goto L_0x00b2
            r1 = 1
        L_0x001a:
            r2 = 1
            r3.A0K = r2
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            boolean r0 = r3.CZN()
            r6 = 0
            if (r0 == 0) goto L_0x0046
            r0 = 1255(0x4e7, float:1.759E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 3295(0xcdf, float:4.617E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.util.Log.w(r1, r0)
            android.os.Handler r4 = r3.A0O
            r1 = -1
            X.4Rp r0 = r3.A0B
            android.os.Message r0 = r4.obtainMessage(r6, r2, r1, r0)
            r0.sendToTarget()
        L_0x0045:
            return
        L_0x0046:
            r3.A01 = r10
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0088
            if (r0 != 0) goto L_0x0086
            r0 = 0
        L_0x0055:
            r3.A06 = r0
        L_0x0057:
            r3.A00 = r6
            X.4Ru r4 = r3.A0R
            java.util.UUID r0 = X.AnonymousClass4T7.A04
            long r0 = com.google.android.exoplayer2.util.Util.A07(r13)
            X.4S6 r5 = r4.A0d
            X.4Tp r4 = new X.4Tp
            r4.<init>(r7, r10, r0)
            r0 = 3
            X.4SD r0 = r5.CsU(r4, r0)
            r0.A01()
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A0b
            java.util.Iterator r1 = r0.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.next()
            X.4RS r0 = (X.AnonymousClass4RS) r0
            r0.DYJ(r2)
            goto L_0x0076
        L_0x0086:
            r0 = r13
            goto L_0x0055
        L_0x0088:
            if (r0 != 0) goto L_0x00ab
            X.4RE r4 = r3.A00
            r0 = 0
            X.4RE r0 = r7.A0E(r4, r10, r0)
            long r11 = r0.A02
        L_0x0094:
            X.4RE r9 = r3.A00
            X.4Rc r8 = r3.A0U
            android.util.Pair r4 = r7.A09(r8, r9, r10, r11)
            java.util.UUID r0 = X.AnonymousClass4T7.A04
            long r0 = com.google.android.exoplayer2.util.Util.A08(r11)
            r3.A06 = r0
            java.lang.Object r0 = r4.first
            int r6 = r7.A06(r0)
            goto L_0x0057
        L_0x00ab:
            java.util.UUID r0 = X.AnonymousClass4T7.A04
            long r11 = com.google.android.exoplayer2.util.Util.A07(r13)
            goto L_0x0094
        L_0x00b2:
            int r0 = r7.A02()
            if (r10 >= r0) goto L_0x00ba
            goto L_0x001a
        L_0x00ba:
            X.V22 r0 = new X.V22
            r0.<init>(r7)
            throw r0
        L_0x00c0:
            r11 = 10
            r12 = 0
            r9.A0K(r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4R3.A0J(int, long):void");
    }

    public void A0K(int i, int i2, boolean z, long j) {
    }
}
