package X;

/* renamed from: X.6hm  reason: invalid class name and case insensitive filesystem */
public final class C314176hm {
    public final C313056fm A00;

    public C314176hm(C313056fm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(float f, float f2, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        if (f > f2) {
            z3 = true;
        }
        if (f < f2) {
            z2 = true;
        }
        if (z3 && f % 1.0f >= 0.25f) {
            ((C313046fl) this.A00).A04.A0V = true;
        } else if (z && z2 && 1.0f - (f % 1.0f) >= 0.25f) {
            ((C313046fl) this.A00).A04.A0T = true;
            return z3;
        }
        return z3;
    }
}
