package X;

/* renamed from: X.Sel  reason: case insensitive filesystem */
public final class C11688Sel implements C13809Thc {
    public int A00;
    public int A01;
    public YBZ A02;
    public C13900TjN A03;
    public final int A04;
    public final int A05;
    public final String A06;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        if (j == 0 || this.A01 == 1) {
            this.A01 = 1;
            this.A00 = 0;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Tbc, java.lang.Object] */
    public final void CMU(YBZ ybz) {
        this.A02 = ybz;
        String str = this.A06;
        C13900TjN FHV = ybz.FHV(1024, 4);
        this.A03 = FHV;
        SOW A002 = SOW.A00();
        A002.A01(str);
        C13900TjN.A00(A002, FHV);
        this.A02.ASU();
        this.A02.EKw(new Object());
        this.A01 = 1;
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        int i;
        int i2 = this.A01;
        if (i2 == 1) {
            C13900TjN tjN = this.A03;
            tjN.getClass();
            int EJe = tjN.EJe(tlA, 1024, true);
            if (EJe == -1) {
                this.A01 = 2;
                i = 0;
                this.A03.EJm((S4h) null, 1, this.A00, 0, 0);
            } else {
                i = this.A00 + EJe;
            }
            this.A00 = i;
            return 0;
        } else if (i2 == 2) {
            return -1;
        } else {
            throw Pxe.A0i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r6.A05 == -1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Evx(X.C13910TlA r7) {
        /*
            r6 = this;
            int r5 = r6.A04
            r4 = 1
            r2 = -1
            r3 = 0
            if (r5 == r2) goto L_0x000c
            int r1 = r6.A05
            r0 = 1
            if (r1 != r2) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            X.C11366SPh.A02(r0)
            int r2 = r6.A05
            X.SRd r1 = X.Pxe.A0P(r2)
            byte[] r0 = r1.A02
            r7.E2F(r0, r3, r2)
            int r0 = r1.A08()
            if (r0 == r5) goto L_0x0022
            r4 = 0
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11688Sel.Evx(X.TlA):boolean");
    }

    public C11688Sel(int i, int i2, String str) {
        this.A04 = i;
        this.A05 = i2;
        this.A06 = str;
    }
}
