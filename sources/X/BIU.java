package X;

import java.util.List;

public final class BIU extends AnonymousClass0T0 implements DQT {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIU) {
                BIU biu = (BIU) obj;
                if (!0qQ.A0K(this.A00, biu.A00) || this.A01 != biu.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0K + i;
    }

    public BIU(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
