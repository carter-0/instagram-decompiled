package X;

/* renamed from: X.4ex  reason: invalid class name and case insensitive filesystem */
public final class C269334ex {
    public static final C269334ex A02 = new C269334ex(0, 0);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C269334ex r5 = (C269334ex) obj;
            if (!(r5.A01 == this.A01 && r5.A00 == this.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 + this.A01;
    }

    public final String toString() {
        if (this == A02) {
            return "EMPTY";
        }
        return String.format("(enabled=0x%x,disabled=0x%x)", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public C269334ex(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
