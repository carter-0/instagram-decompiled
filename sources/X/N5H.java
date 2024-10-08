package X;

import java.util.List;

public final class N5H extends AnonymousClass0T0 implements C21020X9y {
    public final List A00;
    public final boolean A01;
    public final int A02;
    public final int A03;

    public N5H(List list, int i, int i2, boolean z) {
        0qQ.A0B(list, 4);
        this.A02 = i;
        this.A01 = z;
        this.A03 = i2;
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5H) {
                N5H n5h = (N5H) obj;
                if (!(this.A02 == n5h.A02 && this.A01 == n5h.A01 && this.A03 == n5h.A03 && 0qQ.A0K(this.A00, n5h.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A02 * 31;
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A09(this.A01, i) + this.A03) * 31);
    }
}
