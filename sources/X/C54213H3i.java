package X;

/* renamed from: X.H3i  reason: case insensitive filesystem */
public final class C54213H3i extends C333827aD {
    public final int A00;
    public final C333797aA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54213H3i(C333797aA r3, int i) {
        super(002.A0c("sort_order_and_filter_selector_row", r3.A00, i));
        0qQ.A0B(r3, 2);
        this.A00 = i;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54213H3i) {
                C54213H3i h3i = (C54213H3i) obj;
                if (!(this.A00 == h3i.A00 && this.A01 == h3i.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }
}
