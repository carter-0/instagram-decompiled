package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.80W  reason: invalid class name */
public class AnonymousClass80W {
    public Pair A00;
    public boolean A01;
    public final LinkedHashSet A02 = new LinkedHashSet();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Queue A06 = new LinkedList();
    public final Queue A07 = new LinkedList();

    public static boolean A00(AnonymousClass80W r6, Object obj) {
        Object obj2;
        C3509486z r1;
        r6.A01 = true;
        11Z.A00();
        Set set = (Set) r6.A05.get(r6.A00.first);
        boolean z = false;
        if (set == null || !set.contains(obj.getClass())) {
            Map map = (Map) r6.A04.get(r6.A00.first);
            if (!(map == null || (obj2 = map.get(obj.getClass())) == null)) {
                Map map2 = r6.A03;
                if (map2.containsKey(obj2)) {
                    for (AnonymousClass84H r2 : (Set) map2.get(obj2)) {
                        if (r2 instanceof C3509486z) {
                            r1 = (C3509486z) r2;
                        } else {
                            r1 = null;
                        }
                        if (!r2.A76(obj2, obj)) {
                            if (r1 != null) {
                                r1.Dto(obj2);
                            }
                            obj2.toString();
                            r6.A01 = false;
                            return z;
                        } else if (r1 != null) {
                            r1.Dtk(obj2);
                        }
                    }
                }
                Pair pair = r6.A00;
                r6.A00 = new Pair(obj2, obj);
                Iterator it = new ArrayList(r6.A02).iterator();
                while (it.hasNext()) {
                    ((C3493580b) it.next()).Dmx(pair.first, r6.A00.first, obj);
                }
                pair.first.toString();
                r6.A00.first.toString();
                Queue queue = r6.A07;
                LinkedList linkedList = new LinkedList(queue);
                while (!linkedList.isEmpty()) {
                    Object remove = linkedList.remove();
                    queue.remove();
                    if (A00(r6, remove)) {
                        break;
                    }
                }
                z = true;
                r6.A01 = false;
                return z;
            }
        } else {
            r6.A07.add(obj);
        }
        obj2 = r6.A00.first;
        obj2.toString();
        r6.A01 = false;
        return z;
    }

    public final void A01(AnonymousClass84H r3, Object obj) {
        Map map = this.A03;
        if (map.containsKey(obj)) {
            ((Set) map.get(obj)).add(r3);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(r3);
        map.put(obj, linkedHashSet);
    }

    public final void A02(C3493580b r3) {
        LinkedHashSet linkedHashSet = this.A02;
        if (!linkedHashSet.contains(r3)) {
            linkedHashSet.add(r3);
        }
    }

    public final void A03(Class cls, Object obj, Object obj2) {
        Map map = this.A04;
        Map map2 = (Map) map.get(obj);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(obj, map2);
        }
        map2.put(cls, obj2);
    }

    public void A04(Object obj) {
        11Z.A02(new AnonymousClass8OW(this, obj));
    }

    public AnonymousClass80W(Object obj) {
        this.A00 = new Pair(obj, new Object());
    }
}
