package X;

/* renamed from: X.N9o  reason: case insensitive filesystem */
public final class C68301N9o extends AnonymousClass0T0 implements C74276Ps4 {
    public final int A00;
    public final long A01;

    public C68301N9o(long j, int i) {
        this.A00 = i;
        this.A01 = j;
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
        if (!(obj instanceof C68301N9o)) {
            return false;
        }
        C68301N9o n9o = (C68301N9o) obj;
        if (n9o.A00 == i && this.A01 == n9o.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C51968G9o.A03(this.A01);
    }
}
