package X;

/* renamed from: X.Xca  reason: case insensitive filesystem */
public abstract class C21483Xca {
    public XnH A00;
    public final C22113Xvd A01;
    public final YA3 A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        if (r2 == r8.Bdl()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        r7.A00 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C13910TlA r23, X.C21363XYr r24) {
        /*
            r22 = this;
        L_0x0000:
            r9 = r22
            X.XnH r4 = r9.A00
            X.C11366SPh.A00(r4)
            long r2 = r4.A02
            long r7 = r4.A00
            long r5 = r4.A04
            long r7 = r7 - r2
            int r0 = r9.A03
            long r0 = (long) r0
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = r23
            r7 = r24
            if (r10 > 0) goto L_0x002d
            r0 = 0
            r9.A00 = r0
            X.YA3 r0 = r9.A02
            r0.DiN()
        L_0x0021:
            long r0 = r8.Bdl()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x00bd
            r7.A00 = r2
        L_0x002b:
            r0 = 1
            return r0
        L_0x002d:
            long r2 = r8.Bdl()
            long r0 = r5 - r2
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x00b1
            r10 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00b1
            int r2 = (int) r0
            r8.Evk(r2)
            r8.EI7()
            X.YA3 r1 = r9.A02
            long r10 = r4.A07
            X.Xn1 r2 = r1.EKq(r8, r10)
            int r3 = r2.A00
            r0 = -3
            if (r3 == r0) goto L_0x00ab
            r0 = -2
            if (r3 == r0) goto L_0x007a
            r0 = -1
            if (r3 == r0) goto L_0x008f
            long r2 = r2.A01
            long r10 = r8.Bdl()
            long r4 = r2 - r10
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0073
            r10 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            int r0 = (int) r4
            r8.Evk(r0)
        L_0x0073:
            r0 = 0
            r9.A00 = r0
            r1.DiN()
            goto L_0x0021
        L_0x007a:
            long r12 = r2.A02
            long r2 = r2.A01
            r4.A03 = r12
            r4.A02 = r2
            long r14 = r4.A01
            long r5 = r4.A00
            long r0 = r4.A05
            r20 = r0
            r16 = r2
            r18 = r5
            goto L_0x00a3
        L_0x008f:
            long r14 = r2.A02
            long r2 = r2.A01
            r4.A01 = r14
            r4.A00 = r2
            long r12 = r4.A03
            long r5 = r4.A02
            long r0 = r4.A05
            r20 = r0
            r16 = r5
            r18 = r2
        L_0x00a3:
            long r0 = X.XnH.A00(r10, r12, r14, r16, r18, r20)
            r4.A04 = r0
            goto L_0x0000
        L_0x00ab:
            r0 = 0
            r9.A00 = r0
            r1.DiN()
        L_0x00b1:
            long r1 = r8.Bdl()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            r7.A00 = r5
            goto L_0x002b
        L_0x00bd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21483Xca.A00(X.TlA, X.XYr):int");
    }

    public final void A01(long j) {
        XnH xnH = this.A00;
        long j2 = j;
        if (xnH == null || xnH.A06 != j) {
            C22113Xvd xvd = this.A01;
            this.A00 = new XnH(j2, xvd.A04.Ezm(j2), xvd.A02, xvd.A03, xvd.A01, xvd.A00);
        }
    }

    public C21483Xca(Y91 y91, YA3 ya3, int i, long j, long j2, long j3, long j4, long j5) {
        this.A02 = ya3;
        this.A03 = i;
        this.A01 = new C22113Xvd(y91, j, j2, j3, j4, j5);
    }
}
