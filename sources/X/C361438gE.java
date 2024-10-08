package X;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8gE  reason: invalid class name and case insensitive filesystem */
public final class C361438gE implements C360128e2 {
    public final 0sL A00;
    public final C361428gD A01 = new C361428gD();

    public final Object AXX(List list, C62230ry r7) {
        C255463uA r2;
        Object obj = this.A01.get(AnonymousClass2YU.A00(r7));
        0qQ.A07(obj);
        C361448gF r22 = (C361448gF) obj;
        Object obj2 = r22.reference.get();
        if (obj2 == null) {
            C361458gG r1 = new C361458gG();
            synchronized (r22) {
                obj2 = r22.reference.get();
                if (obj2 == null) {
                    obj2 = r1.invoke();
                    r22.reference = new SoftReference(obj2);
                }
            }
        }
        C360148e4 r3 = (C360148e4) obj2;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C360158e5((C62220rx) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = r3.A00;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                r2 = (C255463uA) this.A00.invoke(r7, list);
            } catch (Throwable th) {
                r2 = new 0eQ(th);
            }
            0eR r12 = new 0eR(r2);
            obj3 = concurrentHashMap.putIfAbsent(arrayList, r12);
            if (obj3 == null) {
                obj3 = r12;
            }
        }
        return ((0eR) obj3).A00;
    }

    public C361438gE(0sL r2) {
        this.A00 = r2;
    }
}
