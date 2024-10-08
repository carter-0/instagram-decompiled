package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7qZ  reason: invalid class name and case insensitive filesystem */
public final class C343647qZ {
    public final Map A00;

    public static void A01(C343647qZ r2, Object obj, Object obj2, Object obj3) {
        r2.A02(C343737qi.A01, false);
        r2.A02(C343737qi.A0F, obj);
        r2.A02(C343737qi.A03, obj2);
        r2.A02(C343737qi.A02, obj3);
    }

    public final void A02(C343667qb r2, Object obj) {
        this.A00.put(r2, obj);
    }

    public C343647qZ(C343657qa r3) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.putAll(r3.A00);
    }

    public static void A00(C343647qZ r1, C343667qb r2, boolean z) {
        r1.A02(r2, Boolean.valueOf(z));
    }

    public C343647qZ(String str) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.put(C343657qa.A02, str);
    }
}
