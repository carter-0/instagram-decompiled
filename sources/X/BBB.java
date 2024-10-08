package X;

import java.util.List;

public final class BBB extends AnonymousClass0T0 {
    public final Integer A00;
    public final List A01;
    public final boolean A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBB) {
                BBB bbb = (BBB) obj;
                if (!0qQ.A0K(this.A01, bbb.A01) || this.A02 != bbb.A02 || this.A03 != bbb.A03 || !0qQ.A0K(this.A00, bbb.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A02, AnonymousClass7TG.A0C(this.A01) * 31) + this.A03) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BBB(Integer num, List list, int i, boolean z) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = i;
        this.A00 = num;
    }
}
