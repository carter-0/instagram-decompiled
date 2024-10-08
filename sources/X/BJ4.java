package X;

public final class BJ4 extends AnonymousClass0T0 implements C46224DRf {
    public final int A00;
    public final Object A01;
    public final String A02;

    public BJ4(String str, int i) {
        Object obj;
        int i2;
        this.A00 = i;
        if (i != 0) {
            obj = C46032DJp.A00;
            i2 = 1;
        } else {
            obj = C46031DJo.A00;
            i2 = 0;
        }
        this.A00 = i2;
        this.A02 = str;
        this.A01 = obj;
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
        if (!(obj instanceof BJ4)) {
            return false;
        }
        BJ4 bj4 = (BJ4) obj;
        if (bj4.A00 != i || !0qQ.A0K(this.A02, bj4.A02) || !0qQ.A0K(this.A01, bj4.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A02));
    }
}
