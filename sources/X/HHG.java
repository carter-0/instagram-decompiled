package X;

import java.util.List;

public final class HHG extends C55545HjR {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHG) {
                HHG hhg = (HHG) obj;
                if (!0qQ.A0K(this.A01, hhg.A01) || this.A00 != hhg.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public HHG(List list, int i) {
        super(list);
        this.A01 = list;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VerticalAccountsResult(accounts=");
        A1A.append(this.A01);
        A1A.append(", totalCount=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
