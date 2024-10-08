package X;

public final class KMB extends L0U {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMB) {
                KMB kmb = (KMB) obj;
                if (!(this.A00 == kmb.A00 && this.A01 == kmb.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public KMB(int i, boolean z) {
        super(AnonymousClass05K.A01);
        this.A00 = i;
        this.A01 = z;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, this.A00 * 31);
    }

    public KMB() {
        this(10, false);
    }
}
