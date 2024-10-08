package X;

import java.util.List;

/* renamed from: X.H3j  reason: case insensitive filesystem */
public final class C54214H3j extends C333827aD {
    public final HN2 A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54214H3j(HN2 hn2, List list) {
        super(002.A0R("sort_order_selector_row", C333837aE.A00(hn2.A02)));
        0qQ.A0B(hn2, 2);
        this.A01 = list;
        this.A00 = hn2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54214H3j) {
                C54214H3j h3j = (C54214H3j) obj;
                if (!0qQ.A0K(this.A01, h3j.A01) || this.A00 != h3j.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }
}
