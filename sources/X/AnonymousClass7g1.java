package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7g1  reason: invalid class name */
public class AnonymousClass7g1 implements C337287g2 {
    public final Map A00 = Collections.synchronizedMap(new HashMap());

    public final void A9x(C15050ULg uLg, String str, List list) {
        A9z(uLg.A01, (String) null, list);
    }

    public final void A9z(String str, String str2, List list) {
        0qQ.A0B(str, 0);
        0qQ.A0B(list, 1);
        A9y(new AnonymousClass9P5(AnonymousClass05K.A0C, (Integer) null, (Object) null, (String) null, (String) null, (String) null, list, (List) null, false, false, true), str);
    }

    public final void A9v(C15050ULg uLg, AnonymousClass9P5 r3) {
        A9y(r3, uLg.A01);
    }

    public final void A9y(AnonymousClass9P5 r16, String str) {
        List list;
        AnonymousClass9P5 r3 = r16;
        String str2 = str;
        0qQ.A0B(str2, 0);
        Map map = this.A00;
        0qQ.A06(map);
        synchronized (map) {
            AnonymousClass9P5 r0 = (AnonymousClass9P5) map.get(str2);
            if (!(r0 == null || (list = r0.A06) == null)) {
                ArrayList arrayList = new ArrayList(list);
                List list2 = r3.A06;
                if (list2 != null) {
                    arrayList.addAll(list2);
                    Integer num = AnonymousClass05K.A0C;
                    String str3 = r3.A03;
                    String str4 = r3.A04;
                    r3 = new AnonymousClass9P5(num, r3.A00, r3.A02, str3, str4, r3.A05, arrayList, r3.A07, r3.A08, false, true);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            map.put(str2, r3);
        }
    }

    public final AnonymousClass9P5 BiW(C15050ULg uLg) {
        return BiX(uLg.A01);
    }

    public final AnonymousClass9P5 BiX(String str) {
        if (!(this instanceof C389829qI)) {
            0qQ.A0B(str, 0);
            AnonymousClass9P5 r0 = (AnonymousClass9P5) this.A00.get(str);
            if (r0 != null) {
                return r0;
            }
        }
        return AnonymousClass9PC.A00();
    }

    public final void clear() {
        this.A00.clear();
    }
}
