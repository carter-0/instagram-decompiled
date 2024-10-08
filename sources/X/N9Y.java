package X;

import java.util.List;

public final class N9Y extends AnonymousClass0T0 implements C74270Pry {
    public final String A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9Y) {
                N9Y n9y = (N9Y) obj;
                if (!(this.A07 == n9y.A07 && 0qQ.A0K(this.A00, n9y.A00) && 0qQ.A0K(this.A01, n9y.A01) && 0qQ.A0K(this.A02, n9y.A02) && this.A08 == n9y.A08 && this.A09 == n9y.A09 && this.A0B == n9y.A0B && this.A03 == n9y.A03 && this.A04 == n9y.A04 && this.A06 == n9y.A06 && this.A0A == n9y.A0A && this.A05 == n9y.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, (C51965G9l.A05(this.A07) + AnonymousClass7TG.A0E(this.A00)) * 31))))))))));
    }

    public N9Y(String str, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C51972G9s.A1D(list, list2);
        this.A07 = z;
        this.A00 = str;
        this.A01 = list;
        this.A02 = list2;
        this.A08 = z2;
        this.A09 = z3;
        this.A0B = z4;
        this.A03 = z5;
        this.A04 = z6;
        this.A06 = z7;
        this.A0A = z8;
        this.A05 = z9;
    }
}
