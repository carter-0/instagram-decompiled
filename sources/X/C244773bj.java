package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3bj  reason: invalid class name and case insensitive filesystem */
public final class C244773bj {
    public List A00;
    public List A01;
    public List A02;

    public final void A00(C244773bj r4) {
        List list = r4.A02;
        if (list != null) {
            List list2 = this.A02;
            if (list2 == null) {
                list2 = new ArrayList(list.size());
                this.A02 = list2;
            }
            list2.addAll(list);
        }
        List list3 = r4.A01;
        if (list3 != null) {
            List list4 = this.A01;
            if (list4 == null) {
                list4 = new ArrayList(list3.size());
                this.A01 = list4;
            }
            list4.addAll(list3);
        }
        List list5 = r4.A00;
        if (list5 != null) {
            List list6 = this.A00;
            if (list6 == null) {
                list6 = new ArrayList(list5.size());
                this.A00 = list6;
            }
            list6.addAll(list5);
        }
    }
}
