package X;

public final class S5d {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5d) {
                S5d s5d = (S5d) obj;
                if (!0qQ.A0K(this.A00, s5d.A00) || !0qQ.A0K(this.A01, s5d.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("ProductConfigKey(productId=", this.A00, ", receiverId=", this.A01, ')');
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public S5d(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
