package X;

/* renamed from: X.8mP  reason: invalid class name and case insensitive filesystem */
public final class C365028mP {
    public int A00;
    public int A01;
    public C365418n5 A02;
    public int A03;
    public int A04;
    public int A05;
    public C365408n3 A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final C344407ro A0A;

    public final void A02(C344697sH r8) {
        C365408n3 r0 = this.A06;
        if (r0 != null) {
            A01(r0, r8);
            A00(this.A05, this.A04, this.A03, this.A07, this.A08);
        }
    }

    public final void A00(int i, int i2, int i3, boolean z, boolean z2) {
        boolean z3 = false;
        if (i3 % 180 != 0) {
            z3 = true;
        }
        this.A05 = i;
        this.A04 = i2;
        int i4 = i;
        if (z3) {
            i4 = i2;
        }
        this.A01 = i4;
        if (!z3) {
            i = i2;
        }
        this.A00 = i;
        this.A03 = i3;
        this.A07 = z;
        this.A08 = z2;
        C365418n5 r0 = this.A02;
        if (r0 != null) {
            r0.A01 = i4;
            r0.A00 = i;
            r0.A02 = i3;
            r0.A06 = z;
            r0.A07 = z2;
        }
    }

    public final void A01(C365408n3 r4, C344697sH r5) {
        if (this.A06 != r4 || this.A02 == null) {
            this.A06 = r4;
            C365418n5 r2 = new C365418n5(r4, false);
            this.A02 = r2;
            r5.EZt(new C346277uu(this.A0A, r2), this.A09);
        }
    }

    public C365028mP(C344407ro r1, int i) {
        this.A09 = i;
        this.A0A = r1;
    }
}
