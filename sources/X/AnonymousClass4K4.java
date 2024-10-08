package X;

/* renamed from: X.4K4  reason: invalid class name */
public final class AnonymousClass4K4 extends AnonymousClass0T0 {
    public final C376559Il A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4K4) {
                AnonymousClass4K4 r5 = (AnonymousClass4K4) obj;
                if (!(this.A04 == r5.A04 && this.A02 == r5.A02 && this.A03 == r5.A03 && 0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        return ((((i4 + i5) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public AnonymousClass4K4(C376559Il r1, String str, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A01 = str;
        this.A00 = r1;
    }
}
