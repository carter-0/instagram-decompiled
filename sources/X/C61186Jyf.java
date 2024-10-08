package X;

/* renamed from: X.Jyf  reason: case insensitive filesystem */
public final class C61186Jyf extends AnonymousClass0T0 implements MQQ {
    public final int A00;
    public final int A01;

    public C61186Jyf(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
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
        if (!(obj instanceof C61186Jyf)) {
            return false;
        }
        C61186Jyf jyf = (C61186Jyf) obj;
        if (jyf.A00 == i && this.A01 == jyf.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }
}
