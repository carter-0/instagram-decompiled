package X;

public final class N8E extends AnonymousClass0T0 implements PrW {
    public final int A00;
    public final long A01;

    public N8E(long j, int i) {
        this.A00 = i;
        this.A01 = j;
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
        if (!(obj instanceof N8E)) {
            return false;
        }
        N8E n8e = (N8E) obj;
        if (n8e.A00 == i && this.A01 == n8e.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A01);
    }
}
