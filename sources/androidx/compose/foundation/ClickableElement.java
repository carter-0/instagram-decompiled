package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.C287085Yy;
import X.C287605aT;
import X.C287625aV;
import X.C62320sa;

public final class ClickableElement extends AnonymousClass5QP {
    public final C287085Yy A00;
    public final C287605aT A01;
    public final C287625aV A02;
    public final String A03;
    public final C62320sa A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ClickableElement clickableElement = (ClickableElement) obj;
                if (!0qQ.A0K(this.A01, clickableElement.A01) || !0qQ.A0K(this.A00, clickableElement.A00) || this.A05 != clickableElement.A05 || !0qQ.A0K(this.A03, clickableElement.A03) || !0qQ.A0K(this.A02, clickableElement.A02) || this.A04 != clickableElement.A04) {
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
        C287605aT r1 = this.A01;
        int i4 = 0;
        if (r1 != null) {
            i = r1.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        C287085Yy r12 = this.A00;
        if (r12 != null) {
            i2 = r12.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        int i7 = 1237;
        if (this.A05) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        String str = this.A03;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        C287625aV r13 = this.A02;
        if (r13 != null) {
            i4 = r13.A00;
        }
        return ((i9 + i4) * 31) + this.A04.hashCode();
    }

    public ClickableElement(C287085Yy r1, C287605aT r2, C287625aV r3, String str, C62320sa r5, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = z;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = r5;
    }
}
