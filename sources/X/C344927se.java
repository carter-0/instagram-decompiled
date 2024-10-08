package X;

import android.os.Handler;

/* renamed from: X.7se  reason: invalid class name and case insensitive filesystem */
public final class C344927se implements C344747sM {
    public C345087su A00;
    public C345037sp A01;
    public boolean A02;
    public boolean A03;
    public final C344947sg A04;
    public final C344937sf A05;
    public final C344917sd A06;
    public final C344407ro A07;
    public final C345037sp A08;
    public final boolean A09;

    public final void CMa(C344567s4 r2) {
        0qQ.A0B(r2, 0);
        r2.A03(this.A08);
        r2.A03(this.A01);
    }

    public final void detach() {
        C344947sg r2 = this.A04;
        r2.A0G = false;
        r2.A08.post(r2.A0A);
    }

    public final void release() {
    }

    public C344927se(Handler handler, C344917sd r6, C344407ro r7, boolean z) {
        C345087su r0;
        this.A07 = r7;
        this.A09 = z;
        this.A06 = r6;
        C344937sf r2 = new C344937sf(this);
        this.A05 = r2;
        this.A04 = new C344947sg(handler, r2, !z ? false : true, z);
        this.A08 = new C345037sp(r7);
        this.A01 = new C345037sp(r7);
        if (z) {
            r0 = null;
        } else {
            r0 = new C345087su(r7, new C345047sq(), new C345077st(), false);
        }
        this.A00 = r0;
    }

    public final void ACn(C345897uG r1) {
    }
}
