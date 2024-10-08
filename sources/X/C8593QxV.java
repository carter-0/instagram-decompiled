package X;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.QxV  reason: case insensitive filesystem */
public final class C8593QxV extends SRF {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C8593QxV(RPL rpl) {
    }

    public C8593QxV() {
    }

    public final void A02(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) SUg.A06(obj, j);
        if (list instanceof C13978TnU) {
            unmodifiableList = ((C13978TnU) list).FPc();
        } else if (Pxh.A1W(A00, list)) {
            return;
        } else {
            if (!(list instanceof C13484TbB) || !(list instanceof C13984Tna)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                C13984Tna tna = (C13984Tna) list;
                if (tna.FPP()) {
                    tna.FPF();
                    return;
                }
                return;
            }
        }
        SUg.A0J(obj, j, unmodifiableList);
    }

    public final void A03(Object obj, long j, Object obj2) {
        AbstractList qx3;
        List list = (List) SUg.A06(obj2, j);
        int size = list.size();
        List list2 = (List) SUg.A06(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof C13978TnU) {
                list2 = new C8565Qx3(size);
            } else if (!(list2 instanceof C13484TbB) || !(list2 instanceof C13984Tna)) {
                list2 = DbS.A0v(size);
            } else {
                list2 = ((C13984Tna) list2).FPW(size);
            }
            SUg.A0J(obj, j, list2);
        } else {
            if (Pxh.A1W(A00, list2)) {
                qx3 = Pxi.A0k(list2, size);
                qx3.addAll(list2);
            } else if (list2 instanceof C13253TRt) {
                C13978TnU tnU = C8565Qx3.A01;
                qx3 = new C8565Qx3(list2.size() + size);
                qx3.addAll(qx3.size(), list2);
            } else if ((list2 instanceof C13484TbB) && (list2 instanceof C13984Tna)) {
                C13984Tna tna = (C13984Tna) list2;
                if (!tna.FPP()) {
                    list2 = tna.FPW(list2.size() + size);
                    SUg.A0J(obj, j, list2);
                }
            }
            SUg.A0J(obj, j, qx3);
            list2 = qx3;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0) {
            if (size3 > 0) {
                list2.addAll(list);
            }
            list = list2;
        }
        SUg.A0J(obj, j, list);
    }
}
