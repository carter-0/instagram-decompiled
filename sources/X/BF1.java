package X;

import java.util.List;

public final class BF1 extends AnonymousClass0T0 implements DRF {
    public final List A00;
    public final String A01;

    public BF1(List list, String str) {
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF1) {
                BF1 bf1 = (BF1) obj;
                if (!0qQ.A0K(this.A00, bf1.A00) || !0qQ.A0K(this.A01, bf1.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
