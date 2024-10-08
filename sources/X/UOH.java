package X;

public final class UOH extends AnonymousClass0T0 implements C20852X1e {
    public final int A00;
    public final String A01;

    public UOH(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof UOH)) {
            return false;
        }
        UOH uoh = (UOH) obj;
        if (uoh.A00 != i || !0qQ.A0K(this.A01, uoh.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
