package X;

/* renamed from: X.Ac6  reason: case insensitive filesystem */
public final class C40435Ac6 implements B26 {
    public final /* synthetic */ AnonymousClass8QZ A00;
    public final /* synthetic */ boolean A01;

    public C40435Ac6(AnonymousClass8QZ r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r4.A0R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBC() {
        /*
            r5 = this;
            X.8QZ r4 = r5.A00
            int r3 = r4.A01
            r2 = -1
            if (r3 == r2) goto L_0x0012
            X.7Gf r1 = r4.A0R
            int r0 = r1.Brp()
            if (r3 == r0) goto L_0x0012
            r1.Cof(r0, r3)
        L_0x0012:
            r4.A01 = r2
            r4.A02 = r2
            X.8QW r1 = r4.A0T
            X.7Gf r0 = r4.A0R
            int r0 = r0.Brp()
            r1.DBA(r0)
            X.AnonymousClass8QZ.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40435Ac6.DBC():void");
    }

    public final void Du0() {
        int i;
        AnonymousClass8QZ r5 = this.A00;
        C328787Gf r4 = r5.A0R;
        int Brp = r4.Brp();
        if (Brp == r4.getCount() - 1) {
            i = Math.max(0, Brp - 1);
        } else {
            i = Brp + 1;
        }
        AnonymousClass8QZ.A05(r5, i);
        if (r4.getCount() > 1 || this.A01) {
            r4.removeItem(Brp);
        }
        if (r4.getCount() == 1) {
            r5.A06.CLA();
        }
        r5.A01 = -1;
        r5.A02 = -1;
        AnonymousClass8QZ.A01(r5);
    }
}
