package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5LS  reason: invalid class name */
public final class AnonymousClass5LS extends AnonymousClass5LR {
    public static final Class A00 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List A00(Object obj, int i, long j) {
        AbstractList qBn;
        List list = (List) C284115La.A01.A06(obj, j);
        if (list.isEmpty()) {
            if (list instanceof C13977TnT) {
                C13977TnT tnT = C7403QBn.A01;
                list = new C7403QBn(new ArrayList(i));
            } else {
                list = new ArrayList(i);
            }
            C284115La.A0A(obj, j, list);
        } else {
            if (A00.isAssignableFrom(list.getClass())) {
                qBn = new ArrayList(list.size() + i);
            } else if (list instanceof C13249TRp) {
                C13977TnT tnT2 = C7403QBn.A01;
                qBn = new C7403QBn(new ArrayList(list.size() + i));
            }
            qBn.addAll(list);
            C284115La.A0A(obj, j, qBn);
            return qBn;
        }
        return list;
    }
}
