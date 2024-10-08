package X;

public final class BB1 extends AnonymousClass0T0 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB1) {
                BB1 bb1 = (BB1) obj;
                if (this.A01 != bb1.A01 || !0qQ.A0K(this.A00, bb1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + AnonymousClass7TG.A0E(this.A00);
    }

    public BB1(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
