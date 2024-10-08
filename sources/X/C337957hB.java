package X;

/* renamed from: X.7hB  reason: invalid class name and case insensitive filesystem */
public final class C337957hB implements AnonymousClass2WK {
    public final C62320sa A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C70852Wg A04;

    public C337957hB(C70852Wg r2, C62320sa r3, int i, int i2, int i3) {
        0qQ.A0B(r2, 1);
        this.A04 = r2;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.2T3, java.lang.Object] */
    public final 2WL Cfk(2WI r8, long j) {
        2Sg r0;
        0qQ.A0B(r8, 0);
        ? obj = new Object();
        C70852Wg r6 = this.A04;
        int A002 = C337967hC.A00(C245063cG.A01(j), this.A02 + this.A01);
        int A003 = C337967hC.A00(C245063cG.A00(j), this.A03);
        if (r6.AFc() || r6.Cey()) {
            r0 = new C244173al((String) null, new C377189Kw(this, 20));
        } else {
            r0 = null;
        }
        r6.Cnv(r0, obj, A002, A003);
        return new 2WL((Object) null, Math.max(C245073cH.A03(j), obj.A01), Math.max(C245073cH.A02(j), obj.A00));
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return HSX.A00(this, (AnonymousClass2WK) obj);
    }
}
