package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287085Yy;
import X.C287605aT;
import X.C287625aV;
import X.C62320sa;

public final class CombinedClickableElement extends AnonymousClass5QP {
    public final C287085Yy A00;
    public final C287605aT A01;
    public final C287625aV A02;
    public final String A03;
    public final String A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
                if (!0qQ.A0K(this.A01, combinedClickableElement.A01) || !0qQ.A0K(this.A00, combinedClickableElement.A00) || this.A08 != combinedClickableElement.A08 || !0qQ.A0K(this.A03, combinedClickableElement.A03) || !0qQ.A0K(this.A02, combinedClickableElement.A02) || this.A05 != combinedClickableElement.A05 || !0qQ.A0K(this.A04, combinedClickableElement.A04) || this.A07 != combinedClickableElement.A07 || this.A06 != combinedClickableElement.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C287605aT r0 = this.A01;
        int i7 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        C287085Yy r02 = this.A00;
        if (r02 != null) {
            i2 = r02.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        int i10 = 1237;
        if (this.A08) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        String str = this.A03;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        C287625aV r03 = this.A02;
        if (r03 != null) {
            i4 = r03.A00;
        } else {
            i4 = 0;
        }
        int hashCode = (((i12 + i4) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (hashCode + i5) * 31;
        C62320sa r04 = this.A07;
        if (r04 != null) {
            i6 = r04.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        C62320sa r05 = this.A06;
        if (r05 != null) {
            i7 = r05.hashCode();
        }
        return i14 + i7;
    }

    public CombinedClickableElement(C287085Yy r1, C287605aT r2, C287625aV r3, String str, String str2, C62320sa r6, C62320sa r7, C62320sa r8, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A08 = z;
        this.A03 = str;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = str2;
        this.A07 = r7;
        this.A06 = r8;
    }
}
