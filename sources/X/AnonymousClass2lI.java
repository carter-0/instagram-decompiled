package X;

/* renamed from: X.2lI  reason: invalid class name */
public final class AnonymousClass2lI {
    public final 2Zg A00;
    public final AnonymousClass2ZV A01;

    public final boolean A00() {
        Float f;
        float f2;
        2Zg r1 = this.A00;
        if (r1 != null) {
            float f3 = r1.C3W().A01;
            if (r1.Apn() != null) {
                if (f3 > 0.0f) {
                    f2 = 1.0f - f3;
                } else {
                    f2 = 1.0f + f3;
                }
                f = Float.valueOf(f2);
                return 0qQ.A0I(f, 0.0f);
            }
        }
        f = null;
        return 0qQ.A0I(f, 0.0f);
    }

    public final boolean A01() {
        Float f;
        2Zg r3 = this.A00;
        Float f2 = null;
        if (r3 != null) {
            f = Float.valueOf(r3.C3W().A01);
            if (r3.Apn() != null) {
                f2 = Float.valueOf(0.0f);
            }
        } else {
            f = null;
        }
        if (!0qQ.A0J(f, f2)) {
            return false;
        }
        AnonymousClass2ZV r0 = this.A01;
        if (r0 == null || !r0.CXg()) {
            return true;
        }
        return false;
    }

    public AnonymousClass2lI(AnonymousClass2ZV r1, 2Zg r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
