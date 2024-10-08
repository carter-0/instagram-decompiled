package X;

import java.util.ArrayList;
import java.util.List;

public final class UUQ extends LGZ {
    public int A00 = 3;
    public List A01;
    public List A02;

    public final void A00() {
        List list = this.A02;
        if (list != null) {
            list.clear();
        }
        List list2 = this.A01;
        if (list2 != null) {
            list2.clear();
        }
    }

    public final void A01() {
        int i = this.A00;
        ArrayList arrayList = new ArrayList();
        if (i == 4) {
            this.A01 = arrayList;
        } else {
            this.A02 = arrayList;
        }
    }

    public final void A02(long j, long j2) {
        List list;
        0bb r2;
        if (this.A00 == 4) {
            list = this.A01;
            if (list != null) {
                r2 = new 0bb();
            } else {
                return;
            }
        } else {
            list = this.A02;
            if (list != null) {
                r2 = new 0bb();
            } else {
                return;
            }
        }
        r2.A05("latency_ms", Long.valueOf(j));
        C13990Tnq.A15(r2, j2);
        list.add(r2);
    }

    public final boolean A04() {
        List list;
        if (this.A00 == 4) {
            list = this.A01;
        } else {
            list = this.A02;
        }
        if (list != null) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        List list;
        if (this.A00 == 4) {
            list = this.A01;
        } else {
            list = this.A02;
        }
        if (list != null) {
            return list.isEmpty();
        }
        return true;
    }
}
