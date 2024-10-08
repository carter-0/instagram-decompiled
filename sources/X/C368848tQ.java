package X;

/* renamed from: X.8tQ  reason: invalid class name and case insensitive filesystem */
public final class C368848tQ {
    public C368898tV A00;
    public C361848gv A01;
    public C344847sW A02;
    public boolean A03;
    public final C368858tR A04;
    public final C361868gx A05;
    public final boolean A06;
    public final boolean A07;
    public volatile boolean A08;

    public C368848tQ(C361868gx r4) {
        C368858tR r1;
        if (r4 instanceof C368858tR) {
            r1 = (C368858tR) r4;
        } else if (r4 instanceof C361848gv) {
            C361848gv r2 = (C361848gv) r4;
            r1 = r2.A0A;
            if (r1 == null) {
                r1 = new C368858tR(new C368868tS(r2));
                r2.A0A = r1;
            }
        } else {
            r1 = null;
        }
        this.A08 = true;
        r4.getClass();
        this.A05 = r4;
        this.A04 = r1;
        boolean z = r4 instanceof C361848gv;
        if (z) {
            this.A01 = (C361848gv) r4;
        }
        this.A00 = new C368898tV();
        this.A06 = r4 instanceof C361858gw;
        this.A07 = z;
    }
}
