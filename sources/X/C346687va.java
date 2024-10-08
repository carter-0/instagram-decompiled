package X;

import java.util.List;

/* renamed from: X.7va  reason: invalid class name and case insensitive filesystem */
public final class C346687va extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C346687va) {
                C346687va r5 = (C346687va) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || this.A04 != r5.A04 || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C346687va(String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = list;
        this.A04 = z;
        this.A05 = z2;
    }
}
