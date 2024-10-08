package X;

import java.util.List;

public final class N95 extends AnonymousClass0T0 implements C74269Prx {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public N95(Integer num, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(list, 2);
        this.A01 = str;
        this.A04 = list;
        this.A03 = str2;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A02 = str3;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N95) {
                N95 n95 = (N95) obj;
                if (!0qQ.A0K(this.A01, n95.A01) || !0qQ.A0K(this.A04, n95.A04) || !0qQ.A0K(this.A03, n95.A03) || this.A06 != n95.A06 || this.A05 != n95.A05 || this.A07 != n95.A07 || !0qQ.A0K(this.A02, n95.A02) || this.A00 != n95.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A09 = (AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TG.A0E(this.A01) * 31))))) + AnonymousClass7TG.A0E(this.A02)) * 31;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "CALL";
        } else {
            str = "INVITE";
        }
        return C51971G9r.A0F(str, intValue, A09);
    }
}
