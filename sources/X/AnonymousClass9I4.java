package X;

/* renamed from: X.9I4  reason: invalid class name */
public final class AnonymousClass9I4 extends AnonymousClass0T0 {
    public boolean A00;
    public final int A01;

    public AnonymousClass9I4(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof AnonymousClass9I4)) {
            return false;
        }
        AnonymousClass9I4 r3 = (AnonymousClass9I4) obj;
        if (r3.A01 == i && this.A00 == r3.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9I4() {
        this(false, 0);
        this.A01 = 0;
        this.A01 = 0;
    }
}
