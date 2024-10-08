package X;

import java.util.List;

public final class HHH extends C55545HjR {
    public final int A00;
    public final List A01;
    public final List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HHH(List list, List list2, int i) {
        super(list);
        0qQ.A0B(list2, 3);
        this.A01 = list;
        this.A00 = i;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHH) {
                HHH hhh = (HHH) obj;
                if (!0qQ.A0K(this.A01, hhh.A01) || this.A00 != hhh.A00 || !0qQ.A0K(this.A02, hhh.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OverflowAccountsResult(accounts=");
        A1A.append(this.A01);
        A1A.append(", totalCount=");
        A1A.append(this.A00);
        A1A.append(", overflowRecentlySearchedProfiles=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
