package X;

import java.util.List;

/* renamed from: X.7Lp  reason: invalid class name and case insensitive filesystem */
public final class C330147Lp extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C376549Ik A04;
    public final C327907Cr A05;
    public final C327887Cp A06;
    public final C327877Co A07;
    public final List A08;
    public final boolean A09;
    public final int A0A;
    public final int A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C330147Lp) {
                C330147Lp r5 = (C330147Lp) obj;
                if (!(0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A05, r5.A05) && 0qQ.A0K(this.A08, r5.A08) && this.A00 == r5.A00 && this.A0B == r5.A0B && this.A0A == r5.A0A && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A09 == r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A07.hashCode() * 31;
        C376549Ik r0 = this.A04;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A06.hashCode()) * 31;
        C327907Cr r02 = this.A05;
        if (r02 != null) {
            i = r02.hashCode();
        }
        int hashCode4 = (((((((((((((((hashCode3 + i) * 31) + this.A08.hashCode()) * 31) + this.A00) * 31) + this.A0B) * 31) + this.A0A) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        return hashCode4 + i2;
    }

    public C330147Lp(C376549Ik r1, C327907Cr r2, C327887Cp r3, C327877Co r4, List list, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A07 = r4;
        this.A04 = r1;
        this.A06 = r3;
        this.A05 = r2;
        this.A08 = list;
        this.A00 = i;
        this.A0B = i2;
        this.A0A = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A09 = z;
    }
}
