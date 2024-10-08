package X;

import java.util.List;

/* renamed from: X.MbA  reason: case insensitive filesystem */
public final class C66703MbA extends C69601Noj {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66703MbA) {
                C66703MbA mbA = (C66703MbA) obj;
                if (!(0qQ.A0K(this.A00, mbA.A00) && this.A03 == mbA.A03 && this.A01 == mbA.A01 && this.A02 == mbA.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A00))));
    }

    public C66703MbA(List list, boolean z, boolean z2, boolean z3) {
        this.A00 = list;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
