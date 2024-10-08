package X;

/* renamed from: X.9WD  reason: invalid class name */
public final class AnonymousClass9WD implements C344747sM, C345107sw, C346257us {
    public int A00 = 0;
    public int A01 = 0;
    public C346337v0 A02;
    public C346267ut A03;
    public boolean A04 = true;
    public final C345127sy A05;
    public final C345057sr A06;

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    public final void ACn(C345897uG r3) {
        C346337v0 r0;
        C345127sy r1 = this.A05;
        if (r1.A04 == null && (r0 = this.A02) != null) {
            r1.A04 = r0;
        }
    }

    public final C345137sz B82() {
        return this.A05;
    }

    public final /* synthetic */ int BHN() {
        return 0;
    }

    public final C345067ss FKc(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        C345127sy r1 = this.A05;
        C346337v0 r0 = r1.A04;
        if (r0 != null) {
            r0.A00(i, i2);
        }
        C345057sr r2 = this.A06;
        r2.A09(this.A01, this.A00, i3, i4, 0, false, false);
        r1.A02 = i5;
        r1.A01 = i6;
        r1.A06 = z;
        int i8 = i7;
        if (i7 != 0) {
            r1.A00 = i8;
        }
        return r2.A08();
    }

    public final void detach() {
        if (this.A04) {
            this.A05.A04 = null;
            C346337v0 r0 = this.A02;
            if (r0 != null) {
                r0.A01();
                this.A02 = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.7sy] */
    public AnonymousClass9WD(C345057sr r3) {
        this.A06 = r3;
        ? obj = new Object();
        this.A05 = obj;
        obj.A05 = r3.A08();
    }

    public final void EeQ(C346267ut r1) {
        this.A03 = r1;
    }
}
