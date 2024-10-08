package X;

/* renamed from: X.5hw  reason: invalid class name and case insensitive filesystem */
public final class C291825hw {
    public static final C291825hw A02 = new C291825hw(2, false);
    public static final C291825hw A03 = new C291825hw(1, true);
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C291825hw) {
                C291825hw r5 = (C291825hw) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public final String toString() {
        if (equals(A02)) {
            return "TextMotion.Static";
        }
        if (equals(A03)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public C291825hw(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
