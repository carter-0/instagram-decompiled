package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8s0  reason: invalid class name and case insensitive filesystem */
public final class C368058s0 {
    public 0Pj A00;
    public 2LC A01;
    public C368078s2 A02 = new Object();
    public C368168sB A03;
    public C368188sD A04;
    public C368068s1 A05 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.8s1] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.8s2] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.8sB] */
    public C368058s0() {
        List<C368148s9> list = C368118s6.A03;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C368148s9 r0 : list) {
            arrayList.add(new 0eP(r0.A01, r0.A02));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = ((0eP) next).A00;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(obj, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable<0eP> iterable = (Iterable) entry.getValue();
            ArrayList arrayList3 = new ArrayList(0Yv.A1E(iterable, 10));
            for (0eP r02 : iterable) {
                arrayList3.add(r02.A01);
            }
            arrayList2.add(new 0eP(key, 00k.A0k(arrayList3)));
        }
        this.A00 = new 0Pj(0Yt.A08(arrayList2));
        this.A03 = new Object();
        this.A04 = new C368188sD();
    }
}
