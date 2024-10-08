package X;

import java.util.List;

/* renamed from: X.7od  reason: invalid class name and case insensitive filesystem */
public final class C342457od extends AnonymousClass0T0 implements C342467oe {
    public final C342487og A00;
    public final C342427oa A01;
    public final List A02;
    public final C342477of A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C342457od(C342477of r2, C342487og r3, C342427oa r4, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(list, 2);
        this.A05 = z;
        this.A02 = list;
        this.A06 = z2;
        this.A04 = list2;
        this.A01 = r4;
        this.A03 = r2;
        this.A07 = z3;
        this.A00 = r3;
        this.A08 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C342457od) {
                C342457od r5 = (C342457od) obj;
                if (this.A05 != r5.A05 || !0qQ.A0K(this.A02, r5.A02) || this.A06 != r5.A06 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || this.A07 != r5.A07 || !0qQ.A0K(this.A00, r5.A00) || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int hashCode4 = ((i * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        int i3 = (hashCode4 + i2) * 31;
        List list = this.A04;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        C342427oa r0 = this.A01;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        C342477of r02 = this.A03;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        int i8 = 1237;
        if (this.A07) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        C342487og r03 = this.A00;
        if (r03 != null) {
            i4 = r03.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        int i11 = 1237;
        if (this.A08) {
            i11 = 1231;
        }
        return i10 + i11;
    }
}
