package X;

/* renamed from: X.4Ne  reason: invalid class name and case insensitive filesystem */
public final class C263744Ne extends C263754Nf {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnonymousClass3V3 A08;
    public AnonymousClass3W1 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final AnonymousClass4DU A0E;

    public final 1Xj A00() {
        1Xj A002 = C263434Lz.A00(this.A03, this.A0D);
        if (A002 instanceof 1Xj) {
            return A002;
        }
        return null;
    }

    public final void A01(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
        }
        AnonymousClass3W1 r1 = this.A09;
        if (r1 != null && r1.A1n != z) {
            r1.A1n = z;
            AnonymousClass3W1.A00(r1, 31);
        }
    }

    public C263744Ne(1Xj r2, AnonymousClass4DU r3, int i, int i2, int i3, boolean z, boolean z2) {
        super((Object) r2, i);
        this.A0D = i2;
        this.A05 = i3;
        this.A0E = r3;
        if (z2) {
            this.A07 = i3;
        }
        this.A00 = z;
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A0B = false;
    }
}
