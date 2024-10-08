package X;

import java.util.List;

/* renamed from: X.7aJ  reason: invalid class name and case insensitive filesystem */
public final class C333887aJ extends AnonymousClass0T0 {
    public final C333877aI A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C333887aJ(C333877aI r2, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r2, 5);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = list;
        this.A02 = z3;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C333887aJ) {
                C333887aJ r5 = (C333887aJ) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03 && 0qQ.A0K(this.A01, r5.A01) && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        List list = this.A01;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (i4 + hashCode) * 31;
        int i6 = 1237;
        if (this.A02) {
            i6 = 1231;
        }
        return ((i5 + i6) * 31) + this.A00.hashCode();
    }
}
