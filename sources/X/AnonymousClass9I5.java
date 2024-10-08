package X;

/* renamed from: X.9I5  reason: invalid class name */
public final class AnonymousClass9I5 extends AnonymousClass0T0 {
    public int A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass9I5(boolean z, int i, int i2) {
        this.A02 = i2;
        this.A01 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A02) {
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
        if (!(obj instanceof AnonymousClass9I5)) {
            return false;
        }
        AnonymousClass9I5 r3 = (AnonymousClass9I5) obj;
        if (r3.A02 == i && this.A01 == r3.A01 && this.A00 == r3.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00;
    }
}
