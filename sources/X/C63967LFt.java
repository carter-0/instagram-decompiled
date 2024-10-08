package X;

import androidx.paging.PagingConfig;
import java.util.List;

/* renamed from: X.LFt  reason: case insensitive filesystem */
public final class C63967LFt {
    public final int A00;
    public final Integer A01;
    public final List A02;
    public final PagingConfig A03;

    public C63967LFt(PagingConfig pagingConfig, Integer num, List list, int i) {
        0qQ.A0B(pagingConfig, 3);
        this.A02 = list;
        this.A01 = num;
        this.A03 = pagingConfig;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C63967LFt) {
            C63967LFt lFt = (C63967LFt) obj;
            if (!0qQ.A0K(this.A02, lFt.A02) || !0qQ.A0K(this.A01, lFt.A01) || !0qQ.A0K(this.A03, lFt.A03) || this.A00 != lFt.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, this.A02.hashCode() + C51971G9r.A0E(this.A01)) + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PagingState(pages=");
        A1A.append(this.A02);
        A1A.append(", anchorPosition=");
        A1A.append(this.A01);
        A1A.append(", config=");
        A1A.append(this.A03);
        A1A.append(", leadingPlaceholderCount=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
