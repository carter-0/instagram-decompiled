package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Q0  reason: invalid class name */
public abstract class AnonymousClass9Q0 {
    public static final C65796Lzo A00(AnonymousClass9JL r6) {
        0qQ.A0B(r6, 0);
        String str = r6.A04;
        int hashCode = str.hashCode();
        return new C65796Lzo((Integer) r6.A01, r6.A03, str, r6.A06, hashCode);
    }

    public static final List A01(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00((AnonymousClass9JL) it.next()));
        }
        return arrayList;
    }
}
