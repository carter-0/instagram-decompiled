package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6RT  reason: invalid class name */
public final class AnonymousClass6RT {
    public Map A00 = new HashMap();
    public final List A01 = new ArrayList();

    public final synchronized void A01(String str, Object obj) {
        if (obj == null) {
            if (!this.A00.containsKey(str)) {
            }
        } else if (obj.equals(this.A00.get(str))) {
        }
        HashMap hashMap = new HashMap(this.A00);
        this.A00 = hashMap;
        hashMap.put(str, obj);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C307836Rr r1 = (C307836Rr) it.next();
            C307446Qd r4 = (C307446Qd) r1.A01.get();
            if (r1.A00.A00 || r4 == null) {
                it.remove();
            } else {
                Set<String> set = (Set) r1.A02.get(str);
                if (set != null) {
                    for (String A0G : set) {
                        r4.A0G(this.A00, obj, "gs", A0G);
                    }
                } else {
                    C307446Qd.A03(new Q3D(r4, this.A00, "gs"));
                }
            }
        }
    }

    public static C307836Rr A00(C307446Qd r5, AnonymousClass6RT r6) {
        List list = r6.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C307836Rr r2 = (C307836Rr) it.next();
            Object obj = r2.A01.get();
            if (r2.A00.A00 || obj == null) {
                it.remove();
            } else if (obj == r5) {
                return r2;
            }
        }
        C307836Rr r22 = new C307836Rr(r5);
        list.add(r22);
        return r22;
    }
}
