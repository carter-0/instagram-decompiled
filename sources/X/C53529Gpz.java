package X;

/* renamed from: X.Gpz  reason: case insensitive filesystem */
public final class C53529Gpz extends AnonymousClass0T0 implements C59499JLx {
    public final int A00;
    public final boolean A01;

    public C53529Gpz(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof C53529Gpz)) {
            return false;
        }
        C53529Gpz gpz = (C53529Gpz) obj;
        if (gpz.A00 == i && this.A01 == gpz.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A01) {
            return 1231;
        }
        return 1237;
    }
}
