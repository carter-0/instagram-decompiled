package X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4ef  reason: invalid class name and case insensitive filesystem */
public final class C269154ef implements Serializable {
    public final ArrayList A01(C268894eF r10, C269144ee r11, C8208QkH qkH) {
        Class A04;
        C269144ee r5 = r11;
        C268854eA A01 = r11.A01();
        if (r10 != null) {
            A04 = r10.A00;
        } else {
            A04 = qkH.A04();
        }
        HashMap hashMap = new HashMap();
        List<T9Y> A0l = A01.A0l(qkH);
        if (A0l != null) {
            for (T9Y t9y : A0l) {
                A04(A01, r5, STz.A01(r11, r11, t9y.A01), t9y, hashMap);
            }
        }
        A04(A01, r5, STz.A01(r11, r11, A04), new T9Y(A04, (String) null), hashMap);
        return new ArrayList(hashMap.values());
    }

    public final ArrayList A02(C268894eF r10, C269144ee r11, C8208QkH qkH) {
        C269144ee r4 = r11;
        C268854eA A01 = r11.A01();
        Class cls = r10.A00;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A05(r4, STz.A01(r11, r11, cls), new T9Y(cls, (String) null), linkedHashMap, hashSet);
        List<T9Y> A0l = A01.A0l(qkH);
        if (A0l != null) {
            for (T9Y t9y : A0l) {
                A05(r4, STz.A01(r11, r11, t9y.A01), t9y, linkedHashMap, hashSet);
            }
        }
        return A00(cls, linkedHashMap, hashSet);
    }

    public final ArrayList A03(C269144ee r9, C269054eV r10) {
        Class cls = r10.A05;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A05(r9, r10, new T9Y(cls, (String) null), linkedHashMap, hashSet);
        return A00(cls, linkedHashMap, hashSet);
    }

    public final void A04(C268854eA r4, C269144ee r5, C269054eV r6, T9Y t9y, HashMap hashMap) {
        String A0j;
        if (t9y.A00 == null && (A0j = r4.A0j(r6)) != null) {
            t9y = new T9Y(t9y.A01, A0j);
        }
        T9Y t9y2 = new T9Y(t9y.A01, (String) null);
        if (!hashMap.containsKey(t9y2)) {
            hashMap.put(t9y2, t9y);
            List<T9Y> A0l = r4.A0l(r6);
            if (A0l != null && !A0l.isEmpty()) {
                for (T9Y t9y3 : A0l) {
                    A04(r4, r5, STz.A01(r5, r5, t9y3.A01), t9y3, hashMap);
                }
            }
        } else if (t9y.A00 != null && ((T9Y) hashMap.get(t9y2)).A00 == null) {
            hashMap.put(t9y2, t9y);
        }
    }

    public static final ArrayList A00(Class cls, Map map, Set set) {
        ArrayList arrayList = new ArrayList(map.values());
        for (T9Y t9y : map.values()) {
            set.remove(t9y.A01);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new T9Y(cls2, (String) null));
            }
        }
        return arrayList;
    }

    public final void A05(C269144ee r4, C269054eV r5, T9Y t9y, Map map, Set set) {
        List<T9Y> A0l;
        String A0j;
        C268854eA A01 = r4.A01();
        if (t9y.A00 == null && (A0j = A01.A0j(r5)) != null) {
            t9y = new T9Y(t9y.A01, A0j);
        }
        String str = t9y.A00;
        if (str != null) {
            map.put(str, t9y);
        }
        if (set.add(t9y.A01) && (A0l = A01.A0l(r5)) != null && !A0l.isEmpty()) {
            for (T9Y t9y2 : A0l) {
                A05(r4, STz.A01(r4, r4, t9y2.A01), t9y2, map, set);
            }
        }
    }

    public C269154ef(int i) {
    }

    public C269154ef() {
    }
}
