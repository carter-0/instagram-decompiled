package X;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.59A  reason: invalid class name */
public final class AnonymousClass59A {
    public static final AnonymousClass59A A00 = new Object();
    public static final Map A01 = new LinkedHashMap();
    public static final Map A02 = new LinkedHashMap();
    public static final Map A03 = new LinkedHashMap();
    public static final Map A04 = new LinkedHashMap();
    public static final Map A05 = new LinkedHashMap();
    public static final Map A06 = new LinkedHashMap();
    public static final Map A07 = new LinkedHashMap();
    public static final Queue A08 = new ConcurrentLinkedQueue();
    public static final Map A09 = new LinkedHashMap();

    public static final void A03(String str) {
        0qQ.A0B(str, 0);
        A06.remove(str);
        A03.remove(str);
        A09.remove(str);
        A02.remove(str);
        A01.remove(str);
    }

    public static final void A04(String str, String str2) {
        0qQ.A0B(str2, 1);
        Map map = A09;
        AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
        if (abstractCollection == null) {
            abstractCollection = new HashSet();
        }
        abstractCollection.add(str2);
        map.put(str, abstractCollection);
    }

    public static final boolean A05(String str, String str2) {
        0qQ.A0B(str2, 1);
        AbstractCollection abstractCollection = (AbstractCollection) A09.get(str);
        if (abstractCollection == null || abstractCollection.isEmpty()) {
            return false;
        }
        return abstractCollection.contains(str2);
    }

    public final void A08(C244063aa r4, AnonymousClass59E r5, String str, String str2) {
        0qQ.A0B(str2, 2);
        Map map = A06;
        AbstractMap abstractMap = (AbstractMap) map.get(str);
        if (abstractMap == null) {
            abstractMap = new HashMap();
        }
        AbstractMap abstractMap2 = (AbstractMap) abstractMap.get(r4);
        if (abstractMap2 == null) {
            abstractMap2 = new HashMap();
        }
        abstractMap2.put(str2, r5);
        abstractMap.put(r4, abstractMap2);
        map.put(str, abstractMap);
        if (!r5.A01.containsKey("index_of_card")) {
            A08.add(new AnonymousClass59G(str, r4, str2));
        }
    }

    public static final AnonymousClass6KP A00(String str) {
        AnonymousClass6KP r0 = (AnonymousClass6KP) A03.get(str);
        if (r0 == null) {
            return new 0bb();
        }
        return r0;
    }

    public static final Double A01(String str) {
        Object obj;
        Map map = A01;
        Object obj2 = null;
        if (!map.containsKey(str)) {
            return null;
        }
        AbstractMap abstractMap = (AbstractMap) map.get(str);
        if (abstractMap != null) {
            obj = abstractMap.get("dwell_time");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        AbstractMap abstractMap2 = (AbstractMap) map.get(str);
        if (abstractMap2 != null) {
            obj2 = abstractMap2.get("dwell_time");
        }
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Double");
        return (Double) obj2;
    }

    public static final ArrayList A02(String str) {
        Object obj;
        Map map = A01;
        ArrayList arrayList = null;
        if (map.containsKey(str)) {
            AbstractMap abstractMap = (AbstractMap) map.get(str);
            if (abstractMap != null) {
                obj = abstractMap.get("client_cop_options");
            } else {
                obj = null;
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object next : iterable) {
                    if (next instanceof String) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.size() == ((List) obj).size()) {
                    arrayList = new ArrayList();
                    for (Object next2 : iterable) {
                        if (next2 instanceof String) {
                            arrayList.add(next2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final Integer A06(String str) {
        AnonymousClass59B r0 = (AnonymousClass59B) A02.get(str);
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public final ArrayList A07(String str) {
        Object obj;
        Map map = A01;
        ArrayList arrayList = null;
        if (map.containsKey(str)) {
            AbstractMap abstractMap = (AbstractMap) map.get(str);
            if (abstractMap != null) {
                obj = abstractMap.get("server_cop_options");
            } else {
                obj = null;
            }
            if ((obj instanceof ArrayList) && (!((Collection) obj).isEmpty())) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object next : iterable) {
                    if (next instanceof String) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.size() == ((AbstractCollection) obj).size()) {
                    arrayList = new ArrayList();
                    for (Object next2 : iterable) {
                        if (next2 instanceof String) {
                            arrayList.add(next2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A09(String str, String str2, String str3) {
        Map map = A04;
        0bb r1 = (0bb) map.get(str);
        if (r1 == null) {
            r1 = new 0bb();
        }
        r1.A06("flow_name", str2);
        r1.A06("flow_step", "lead_ads_first_question_impression");
        r1.A06("question_type", str3);
        map.put(str, r1);
    }
}
