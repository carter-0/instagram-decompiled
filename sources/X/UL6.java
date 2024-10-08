package X;

import java.util.List;

public final class UL6 extends AnonymousClass0T0 {
    public final ULT A00;
    public final C59721JVf A01;
    public final N4Q A02;
    public final ULZ A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL6) {
                UL6 ul6 = (UL6) obj;
                if (this.A07 != ul6.A07 || this.A06 != ul6.A06 || !0qQ.A0K(this.A00, ul6.A00) || !0qQ.A0K(this.A01, ul6.A01) || this.A05 != ul6.A05 || !0qQ.A0K(this.A03, ul6.A03) || !0qQ.A0K(this.A02, ul6.A02) || !0qQ.A0K(this.A04, ul6.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        C59721JVf jVf = this.A01;
        Number number = (Number) jVf.A01;
        if (number != null) {
            UKT ukt = (UKT) 00k.A0O((List) jVf.A00, number.intValue());
            if (ukt != null) {
                int i = ukt.A00;
                if (Integer.valueOf(i) == null) {
                    return 0;
                }
                return i;
            }
        }
        return 0;
    }

    public final C61065Jw3 A01() {
        C59721JVf jVf = this.A01;
        Number number = (Number) jVf.A01;
        if (number == null) {
            return null;
        }
        UKT ukt = (UKT) 00k.A0O((List) jVf.A00, number.intValue());
        if (ukt != null) {
            return ukt.A01;
        }
        return null;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A06, C51965G9l.A05(this.A07))))) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A04);
    }

    public UL6(ULT ult, C59721JVf jVf, N4Q n4q, ULZ ulz, String str, boolean z, boolean z2, boolean z3) {
        this.A07 = z;
        this.A06 = z2;
        this.A00 = ult;
        this.A01 = jVf;
        this.A05 = z3;
        this.A03 = ulz;
        this.A02 = n4q;
        this.A04 = str;
    }
}
