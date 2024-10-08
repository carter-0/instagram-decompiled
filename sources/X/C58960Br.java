package X;

/* renamed from: X.0Br  reason: invalid class name and case insensitive filesystem */
public final class C58960Br {
    public 0Bs A00;
    public boolean A01 = true;
    public 0Bs A02;
    public final AnonymousClass0Bt A03;
    public final 0Bs A04;

    public final 0Bs A00() {
        boolean A042 = this.A01 & this.A03.A04(this.A02);
        this.A01 = A042;
        if (!A042) {
            return null;
        }
        0Bs r1 = this.A02;
        0Bs r0 = this.A00;
        0Bs r2 = this.A04;
        r1.A02(r0, r2);
        return r2;
    }

    public C58960Br(0Bs r2, 0Bs r3, 0Bs r4, AnonymousClass0Bt r5) {
        this.A03 = r5;
        this.A02 = r2;
        this.A00 = r3;
        this.A04 = r4;
    }

    public final 0Bs A01() {
        if (A00() == null) {
            return null;
        }
        0Bs r1 = this.A00;
        this.A00 = this.A02;
        this.A02 = r1;
        return this.A04;
    }
}
