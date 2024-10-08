package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Ek  reason: invalid class name and case insensitive filesystem */
public abstract class C375629Ek {
    public C255323tw A00(List list) {
        C255333tx r3 = new C255333tx();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((C255323tw) it.next()).A00);
            0qQ.A07(unmodifiableMap);
            linkedHashMap.putAll(unmodifiableMap);
        }
        r3.A02(linkedHashMap);
        return r3.A00();
    }
}
