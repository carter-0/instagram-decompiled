package X;

/* renamed from: X.5E0  reason: invalid class name */
public final class AnonymousClass5E0 extends C282615Dy {
    public static final AnonymousClass5E0[] A01;
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof AnonymousClass5E0) && ((AnonymousClass5E0) obj).A00 == this.A00;
        }
        return true;
    }

    static {
        AnonymousClass5E0[] r3 = new AnonymousClass5E0[12];
        A01 = r3;
        int i = 0;
        do {
            r3[i] = new AnonymousClass5E0(i - 1);
            i++;
        } while (i < 12);
    }

    public static AnonymousClass5E0 A00(int i) {
        if (i > 10 || i < -1) {
            return new AnonymousClass5E0(i);
        }
        return A01[i - -1];
    }

    public final String A06() {
        return 17g.A08(this.A00);
    }

    public final void EN9(17Z r2, C269504fE r3) {
        r2.A0g(this.A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public AnonymousClass5E0(int i) {
        this.A00 = i;
    }
}
