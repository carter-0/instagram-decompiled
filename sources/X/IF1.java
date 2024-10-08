package X;

import androidx.compose.foundation.layout.WindowInsets;

public final class IF1 implements WindowInsets {
    public final C284945Oz A00;
    public final String A01;

    public final int AhD(C268024cd r2) {
        return ((C56116Ht3) this.A00.getValue()).A00;
    }

    public final int BMH(C268024cd r2, AnonymousClass5Q8 r3) {
        return ((C56116Ht3) this.A00.getValue()).A01;
    }

    public final int BoT(C268024cd r2, AnonymousClass5Q8 r3) {
        return ((C56116Ht3) this.A00.getValue()).A02;
    }

    public final int C8K(C268024cd r2) {
        return ((C56116Ht3) this.A00.getValue()).A03;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IF1)) {
            return false;
        }
        return C51969G9p.A1U(((IF1) obj).A00, this.A00.getValue());
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public IF1(C56116Ht3 ht3, String str) {
        this.A01 = str;
        this.A00 = C51970G9q.A0S(ht3);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append("(left=");
        C284945Oz r1 = this.A00;
        A1A.append(((C56116Ht3) r1.getValue()).A01);
        A1A.append(", top=");
        A1A.append(((C56116Ht3) r1.getValue()).A03);
        A1A.append(", right=");
        A1A.append(((C56116Ht3) r1.getValue()).A02);
        A1A.append(", bottom=");
        return C51975G9x.A0j(A1A, ((C56116Ht3) r1.getValue()).A00);
    }
}
