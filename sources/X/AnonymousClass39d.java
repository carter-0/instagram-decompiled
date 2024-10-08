package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.39d  reason: invalid class name */
public final class AnonymousClass39d {
    public final Object A00 = new Object();
    public final Map A01 = new LinkedHashMap();

    public final C2805352f A00(C255373u1 r3) {
        C2805352f r0;
        0qQ.A0B(r3, 0);
        synchronized (this.A00) {
            r0 = (C2805352f) this.A01.remove(r3);
        }
        return r0;
    }

    public final List A02(String str) {
        List A0a;
        0qQ.A0B(str, 0);
        synchronized (this.A00) {
            Map map = this.A01;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (0qQ.A0K(((C255373u1) entry.getKey()).A01, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (C255373u1 remove : linkedHashMap.keySet()) {
                map.remove(remove);
            }
            A0a = 00k.A0a(linkedHashMap.values());
        }
        return A0a;
    }

    public final C2805352f A01(C255373u1 r4) {
        C2805352f r0;
        synchronized (this.A00) {
            Map map = this.A01;
            Object obj = map.get(r4);
            if (obj == null) {
                obj = new C2805352f(r4);
                map.put(r4, obj);
            }
            r0 = (C2805352f) obj;
        }
        return r0;
    }

    public final boolean A03(C255373u1 r3) {
        boolean containsKey;
        synchronized (this.A00) {
            containsKey = this.A01.containsKey(r3);
        }
        return containsKey;
    }
}
