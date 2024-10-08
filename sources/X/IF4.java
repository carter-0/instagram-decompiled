package X;

import java.util.ArrayList;

public final class IF4 implements JNR {
    public final int A00;

    public final ArrayList AEu(C268024cd r6, int i, int i2) {
        int i3 = this.A00;
        int i4 = i - (i2 * (i3 - 1));
        int i5 = i4 / i3;
        int i6 = i4 % i3;
        ArrayList A0v = DbS.A0v(i3);
        for (int i7 = 0; i7 < i3; i7++) {
            AnonymousClass7TF.A1M(A0v, (AnonymousClass7TF.A1T(i7, i6) ? 1 : 0) + i5);
        }
        return A0v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IF4) || this.A00 != ((IF4) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -this.A00;
    }

    public IF4(int i) {
        this.A00 = i;
    }
}
