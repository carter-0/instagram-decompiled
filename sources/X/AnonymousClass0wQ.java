package X;

/* renamed from: X.0wQ  reason: invalid class name */
public final class AnonymousClass0wQ implements C61370mm {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public final C61370mm A03;

    public final void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                this.A03.DKr(this.A01, this.A00);
            } else if (i != 2) {
                this.A03.D1N(this.A01, this.A00);
            } else {
                this.A03.Ddf(this.A01, this.A00);
            }
            this.A02 = 0;
        }
    }

    public final void Cxw() {
        this.A03.Cxw();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D1N(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            r3 = 3
            if (r0 != r3) goto L_0x001f
            int r1 = r4.A01
            int r0 = r4.A00
            int r2 = r1 + r0
            if (r5 > r2) goto L_0x001f
            int r0 = r5 + r6
            if (r0 < r1) goto L_0x001f
            int r1 = java.lang.Math.min(r5, r1)
            r4.A01 = r1
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = r0 - r1
            r4.A00 = r0
            return
        L_0x001f:
            r4.A00()
            r4.A01 = r5
            r4.A00 = r6
            r4.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0wQ.D1N(int, int):void");
    }

    public final void DC7() {
        this.A03.DC7();
    }

    public final void DKr(int i, int i2) {
        int i3;
        if (this.A02 == 1 && i >= (i3 = this.A01)) {
            int i4 = this.A00;
            if (i <= i3 + i4) {
                this.A00 = i4 + i2;
                this.A01 = Math.min(i, i3);
                return;
            }
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 1;
    }

    public final void Ddf(int i, int i2) {
        if (this.A02 == 2 && this.A01 == i) {
            this.A00 += i2;
            return;
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 2;
    }

    public AnonymousClass0wQ(C61370mm r2) {
        this.A03 = r2;
    }

    public final void DSU(int i, int i2) {
        A00();
        this.A03.DSU(i, i2);
    }
}
