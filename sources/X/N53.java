package X;

import java.util.List;

public final class N53 extends AnonymousClass0T0 implements C74438Put {
    public final C66720MbR A00;
    public final N2c A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08 = true;
    public final Integer A09 = AnonymousClass05K.A0C;

    public N53(C66720MbR mbR, N2c n2c, String str, String str2, String str3, List list, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = n2c;
        this.A00 = mbR;
        this.A04 = str2;
        this.A03 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = list;
    }

    public final String Aqe() {
        return this.A02;
    }

    public final Integer Aqk() {
        return this.A09;
    }

    public final boolean CeS() {
        return this.A08;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N53) || !0qQ.A0K(((N53) obj).A02, this.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }
}
