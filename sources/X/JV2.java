package X;

public final class JV2 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public JV2(int i, int i2, boolean z, boolean z2) {
        this.A00 = i2;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = i;
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
        if (!(obj instanceof JV2)) {
            return false;
        }
        JV2 jv2 = (JV2) obj;
        if (jv2.A00 == i && this.A02 == jv2.A02 && this.A03 == jv2.A03 && this.A01 == jv2.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, C51965G9l.A05(this.A02)) + this.A01;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NFTruncationLoggingContext(couldTruncate=");
        A1A.append(this.A02);
        A1A.append(", truncated=");
        A1A.append(this.A03);
        A1A.append(", truncationControlPosition=");
        return C51975G9x.A0j(A1A, this.A01);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JV2() {
        this(0, 0, false, false);
        this.A00 = 0;
    }
}
