package X;

/* renamed from: X.SOw  reason: case insensitive filesystem */
public final class C11360SOw {
    public Boolean A00;
    public boolean A01;
    public final boolean A02;

    public final void A01(C62320sa r2) {
        r2.invoke();
        this.A00 = false;
    }

    public static 0eP A00(Object obj, boolean z) {
        return new 0eP(obj, new C11360SOw(z));
    }

    public final void A02(C62320sa r2) {
        if (!this.A01) {
            this.A01 = true;
            r2.invoke();
        }
    }

    public final void A03(0sP r4) {
        boolean z = true;
        if (!0qQ.A0K(this.A00, true) || this.A02) {
            if (this.A00 == null) {
                z = false;
            }
            C51968G9o.A1O(r4, z);
            this.A00 = true;
        }
    }

    public C11360SOw(boolean z) {
        this.A02 = z;
    }

    public C11360SOw() {
        this(false);
    }
}
