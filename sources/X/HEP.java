package X;

import java.util.List;

public final class HEP extends C54703HPi {
    public final List A00;
    public final boolean A01;

    public HEP(List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HEP) {
                HEP hep = (HEP) obj;
                if (!0qQ.A0K(this.A00, hep.A00) || this.A01 != hep.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Sections(sections=");
        A1A.append(this.A00);
        A1A.append(C66579MXk.A00(27));
        return G9t.A1C(A1A, this.A01);
    }
}
