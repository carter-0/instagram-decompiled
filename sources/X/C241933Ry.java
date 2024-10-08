package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3Ry  reason: invalid class name and case insensitive filesystem */
public final class C241933Ry implements C241943Rz {
    public final Map A00 = new ConcurrentHashMap();
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A02;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                ((AnonymousClass1TA) it.next()).cancel();
            }
        }
        map.remove(str);
    }

    public final void FKv(String str, boolean z) {
        1Fe r0;
        0qQ.A0B(str, 0);
        Map map = this.A02;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                AnonymousClass1TA r1 = (AnonymousClass1TA) it.next();
                if (z) {
                    r0 = 1Fe.A03;
                } else {
                    r0 = 1Fe.A02;
                }
                r1.FJj(r0);
            }
        }
        map.remove(str);
    }

    public final void AA2(AnonymousClass1TA r4, 1QU r5, String str) {
        String str2 = r5.A0E;
        Map map = this.A02;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(r4);
        this.A01.put(r4, r5);
        if (str2 != null) {
            Map map2 = this.A00;
            if (map2.containsKey(str2)) {
                Object obj = map2.get(str2);
                0qQ.A0A(obj);
                ((CopyOnWriteArrayList) obj).add(r4);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            copyOnWriteArrayList2.add(r4);
            map2.put(str2, copyOnWriteArrayList2);
        }
    }

    public final void EEV(AnonymousClass1TA r4, 1QU r5, String str) {
        String str2 = r5.A0E;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.A02.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(r4);
        }
        this.A01.remove(r4);
        if (str2 != null) {
            Map map = this.A00;
            if (map.containsKey(str2)) {
                Object obj = map.get(str2);
                0qQ.A0A(obj);
                ((CopyOnWriteArrayList) obj).remove(r4);
            }
        }
    }
}
