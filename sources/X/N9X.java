package X;

import java.util.List;

public final class N9X extends AnonymousClass0T0 implements C74270Pry {
    public final Integer A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public N9X(Integer num, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        0qQ.A0B(list, 3);
        this.A06 = z;
        this.A04 = z2;
        this.A02 = list;
        this.A01 = str;
        this.A08 = z3;
        this.A05 = z4;
        this.A03 = z5;
        this.A09 = z6;
        this.A00 = num;
        this.A07 = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9X) {
                N9X n9x = (N9X) obj;
                if (!(this.A06 == n9x.A06 && this.A04 == n9x.A04 && 0qQ.A0K(this.A02, n9x.A02) && 0qQ.A0K(this.A01, n9x.A01) && this.A08 == n9x.A08 && this.A05 == n9x.A05 && this.A03 == n9x.A03 && this.A09 == n9x.A09 && this.A00 == n9x.A00 && this.A07 == n9x.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A092 = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A06))))))));
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "VIDEO_CALL_CANDIDATE";
        } else {
            str = "ROOMS_INVITE_CANDIDATE";
        }
        return DbS.A06(this.A07, C51971G9r.A0F(str, intValue, A092));
    }
}
