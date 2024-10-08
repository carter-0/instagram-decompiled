package X;

public final class N9Q extends AnonymousClass0T0 implements C74270Pry {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9Q) {
                N9Q n9q = (N9Q) obj;
                if (!(0qQ.A0K(this.A00, n9q.A00) && this.A02 == n9q.A02 && this.A01 == n9q.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0O(this.A00)));
    }

    public N9Q(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
    }
}
