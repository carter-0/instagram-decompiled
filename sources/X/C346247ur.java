package X;

/* renamed from: X.7ur  reason: invalid class name and case insensitive filesystem */
public final class C346247ur implements C344747sM, C345107sw, C346257us {
    public int A00;
    public int A01;
    public final C345127sy A02 = new Object();
    public final C341067mH A03;
    public final C345057sr A04;
    public final float[] A05 = new float[16];
    public final boolean A06;

    public final void CMa(C344567s4 r1) {
    }

    public final void release() {
    }

    public final void ACn(C345897uG r6) {
        C341067mH r2;
        C346337v0 r0;
        C381079b8 r3;
        int i;
        C345127sy r4 = this.A02;
        if (r4.A04 == null) {
            if (this.A06) {
                C381079b8 r32 = new C381079b8("SurfaceInput");
                r4.A04 = r32;
                r2 = this.A03;
                r0 = r32.A00;
                r3 = r32;
            } else {
                r2 = this.A03;
                C346327uz r1 = new C346327uz("SurfaceInput");
                r1.A03 = 36197;
                r0 = new C346337v0(r1);
                r3 = r0;
                r4.A04 = r0;
            }
            r2.Dr8(r0.A00);
            int i2 = this.A01;
            if (i2 > 0 && (i = this.A00) > 0) {
                r3.A00(i2, i);
            }
        }
    }

    public final C345137sz B82() {
        try {
            C341067mH r3 = this.A03;
            r3.FLm();
            float[] fArr = this.A05;
            r3.C9S(fArr);
            C345057sr r0 = this.A04;
            r0.A0A(fArr);
            C345127sy r2 = this.A02;
            r2.A05 = r0.A08();
            r2.A03 = r3.C7X();
        } catch (RuntimeException unused) {
        }
        return this.A02;
    }

    public final /* synthetic */ int BHN() {
        return 0;
    }

    public final void EeQ(C346267ut r2) {
        this.A03.EeQ(r2);
    }

    public final C345067ss FKc(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        C345127sy r1 = this.A02;
        C346337v0 r0 = r1.A04;
        if (r0 != null) {
            r0.A00(i, i2);
        }
        C345057sr r2 = this.A04;
        r2.A09(this.A01, this.A00, i3, i4, 0, false, false);
        r1.A02 = i5;
        r1.A01 = i6;
        r1.A00 = i7;
        r1.A06 = z;
        return r2.A08();
    }

    public final void detach() {
        C345127sy r1 = this.A02;
        C346337v0 r0 = r1.A04;
        if (r0 != null) {
            r0.A01();
            r1.A04 = null;
        }
        this.A03.Dr9();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7sy] */
    public C346247ur(C341067mH r2, C345057sr r3) {
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = C344237rX.A00();
    }
}
