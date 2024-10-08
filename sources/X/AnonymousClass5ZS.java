package X;

/* renamed from: X.5ZS  reason: invalid class name */
public final class AnonymousClass5ZS implements AnonymousClass5ZP {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5ZS) && C289095d0.A01(this.A00, ((AnonymousClass5ZS) obj).A00));
    }

    public final float F07(C268024cd r2, long j) {
        return r2.F06(this.A00);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0Z("CornerSize(size = ", ".dp)", this.A00);
    }

    public AnonymousClass5ZS(float f) {
        this.A00 = f;
    }
}
