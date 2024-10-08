package X;

/* renamed from: X.8dD  reason: invalid class name and case insensitive filesystem */
public final class C359618dD extends AnonymousClass0T0 implements C359628dE {
    public final 0lg A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C359618dD(0lg r2) {
        this(r2, false, false, false);
        0qQ.A0B(r2, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C359618dD) {
                C359618dD r5 = (C359618dD) obj;
                if (!(0qQ.A0K(this.A00, r5.A00) && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C359618dD(0lg r2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = z3;
    }
}
