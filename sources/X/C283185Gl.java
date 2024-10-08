package X;

/* renamed from: X.5Gl  reason: invalid class name and case insensitive filesystem */
public final class C283185Gl extends AnonymousClass0T0 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C283185Gl) {
                C283185Gl r5 = (C283185Gl) obj;
                if (!(this.A03 == r5.A03 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A01) {
            i7 = 1231;
        }
        return ((i6 + i7) * 31) + this.A00;
    }

    public C283185Gl(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A01 = z4;
        this.A00 = i;
    }

    public C283185Gl() {
        this(false, 0, false, false, false);
    }
}
