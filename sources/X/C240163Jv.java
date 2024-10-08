package X;

/* renamed from: X.3Jv  reason: invalid class name and case insensitive filesystem */
public final class C240163Jv extends AnonymousClass0T0 implements AnonymousClass1qK {
    public 1sy A00;
    public final 1Xj A01;
    public final AnonymousClass34A A02;
    public final boolean A03;
    public final boolean A04;

    public C240163Jv(1Xj r3) {
        this.A01 = r3;
        this.A02 = null;
        this.A04 = true;
        this.A00 = null;
        this.A03 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240163Jv) {
                C240163Jv r5 = (C240163Jv) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A02, r5.A02) && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        AnonymousClass34A r0 = this.A02;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        1sy r02 = this.A00;
        if (r02 != null) {
            i = r02.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int i6 = 1237;
        if (this.A03) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    public C240163Jv(1Xj r3, 1sy r4, AnonymousClass34A r5) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = true;
        this.A00 = r4;
        this.A03 = false;
    }

    public C240163Jv(1Xj r3, boolean z) {
        this.A01 = r3;
        this.A02 = null;
        this.A04 = z;
        this.A00 = null;
        this.A03 = false;
    }

    public C240163Jv(1Xj r4, 1sy r5) {
        this.A01 = r4;
        this.A02 = null;
        this.A04 = true;
        this.A00 = r5;
        this.A03 = false;
    }
}
