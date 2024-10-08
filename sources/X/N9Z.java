package X;

public final class N9Z extends AnonymousClass0T0 implements C74270Pry {
    public final int A00;
    public final boolean A01;

    public N9Z(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
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
        if (!(obj instanceof N9Z)) {
            return false;
        }
        N9Z n9z = (N9Z) obj;
        if (n9z.A00 == i && this.A01 == n9z.A01) {
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

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        return 002.A0L("RtcMiniPlayerViewModel(show=", ')', this.A01);
    }
}
