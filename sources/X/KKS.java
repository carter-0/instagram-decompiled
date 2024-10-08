package X;

import java.util.List;

public final class KKS extends C54725HQe {
    public final int A00;
    public final int A01;
    public final List A02;

    public final int A00() {
        return 2;
    }

    public final boolean A01(C54725HQe hQe) {
        KKS kks;
        if ((hQe instanceof KKS) && (kks = (KKS) hQe) != null && kks.A01 == this.A01) {
            List list = this.A02;
            List list2 = kks.A02;
            if (list.size() == list2.size()) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (!0qQ.A0K(next, list2.get(i))) {
                            break;
                        }
                        i = i2;
                    } else {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KKS) {
                KKS kks = (KKS) obj;
                if (!(this.A00 == kks.A00 && 0qQ.A0K(this.A02, kks.A02) && this.A01 == kks.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, this.A00 * 31) + this.A01;
    }

    public KKS(List list, int i, int i2) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = i2;
    }
}
