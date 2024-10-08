package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.LkP  reason: case insensitive filesystem */
public final class C64924LkP implements C66436MRq {
    public final /* synthetic */ C354388Lv A00;
    public final /* synthetic */ List A01;

    public C64924LkP(C354388Lv r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public final void EF1(L66 l66) {
        List list = this.A01;
        C354388Lv r5 = this.A00;
        synchronized (list) {
            list.add(Integer.valueOf(l66.A00));
            if (list.containsAll(r5.A04)) {
                List list2 = r5.A06;
                synchronized (list2) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        0eP A1A = JTO.A1A(it);
                        C354388Lv.A00(r5, (0sL) A1A.A01, C51970G9q.A0B(A1A));
                    }
                    list2.clear();
                    r5.A01 = true;
                }
            }
        }
    }
}
