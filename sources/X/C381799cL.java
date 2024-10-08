package X;

/* renamed from: X.9cL  reason: invalid class name and case insensitive filesystem */
public final class C381799cL extends AnonymousClass0T0 {
    public static final C381799cL A02 = new C381799cL(true, false);
    public static final C381799cL A03 = new C381799cL(true, true);
    public static final C381799cL A04 = new C381799cL(false, false);
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381799cL) {
                C381799cL r5 = (C381799cL) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C381799cL(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
