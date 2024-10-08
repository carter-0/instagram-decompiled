package X;

/* renamed from: X.8WV  reason: invalid class name */
public final class AnonymousClass8WV extends AnonymousClass0T0 {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8WV) {
                AnonymousClass8WV r5 = (AnonymousClass8WV) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (((i2 + i3) * 31) + this.A00) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "MEMORIES_VIEWER";
        } else {
            str = "ARCHIVE";
        }
        return i6 + str.hashCode() + intValue;
    }

    public AnonymousClass8WV(Integer num, int i, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = i;
        this.A04 = z3;
        this.A01 = num;
    }
}
