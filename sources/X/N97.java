package X;

import java.util.List;

public final class N97 extends AnonymousClass0T0 implements C74269Prx {
    public final List A00;
    public final List A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N97) {
                N97 n97 = (N97) obj;
                if (!(0qQ.A0K(this.A02, n97.A02) && 0qQ.A0K(this.A01, n97.A01) && 0qQ.A0K(this.A00, n97.A00) && this.A08 == n97.A08 && this.A04 == n97.A04 && this.A05 == n97.A05 && this.A07 == n97.A07 && this.A06 == n97.A06 && this.A03 == n97.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)))))))));
    }

    public N97(List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = list3;
        this.A08 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A03 = z6;
    }
}
