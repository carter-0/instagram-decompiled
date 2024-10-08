package X;

import java.util.List;

public final class KO6 extends C62782KmK {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KO6) {
                KO6 ko6 = (KO6) obj;
                if (!(0qQ.A0K(this.A01, ko6.A01) && 0qQ.A0K(this.A02, ko6.A02) && this.A03 == ko6.A03 && this.A00 == ko6.A00 && this.A04 == ko6.A04 && this.A05 == ko6.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A03;
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A09(z, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00) * 31));
    }

    public KO6(String str, List list, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A02 = list;
        this.A03 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A05 = z3;
    }

    public KO6() {
        this((String) null, (List) null, -1, false, false, false);
    }
}
