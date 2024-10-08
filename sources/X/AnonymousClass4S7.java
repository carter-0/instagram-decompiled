package X;

/* renamed from: X.4S7  reason: invalid class name */
public final class AnonymousClass4S7 {
    public static final AnonymousClass4S7 A02 = new AnonymousClass4S7(-1, -1);
    public final int A00;
    public final int A01;

    static {
        new AnonymousClass4S7(0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4S7)) {
            return false;
        }
        AnonymousClass4S7 r4 = (AnonymousClass4S7) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return 002.A0P("x", this.A01, this.A00);
    }

    public AnonymousClass4S7(int i, int i2) {
        boolean z;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        } else {
            z = false;
        }
        C256703wD.A03(z);
        this.A01 = i;
        this.A00 = i2;
    }
}
