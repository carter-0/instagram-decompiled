package X;

/* renamed from: X.Gql  reason: case insensitive filesystem */
public final class C53570Gql extends AnonymousClass0T0 implements C59506JMe {
    public final int A00 = 2131961029;
    public final int A01 = 2131961033;
    public final int A02 = 2131954752;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53570Gql) {
                C53570Gql gql = (C53570Gql) obj;
                if (!(this.A00 == gql.A00 && this.A01 == gql.A01 && this.A02 == gql.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
