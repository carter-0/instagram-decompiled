package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6I5  reason: invalid class name */
public final class AnonymousClass6I5 {
    public final AnonymousClass6I0 A00;
    public final C62320sa A01;
    public final Map A02 = new LinkedHashMap();

    public final Object A00(Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass6J7 r0 = (AnonymousClass6J7) this.A02.get(obj);
        if (r0 != null) {
            return r0.A02;
        }
        AnonymousClass6J1 r2 = (AnonymousClass6J1) this.A01.invoke();
        int BGq = r2.BGq(obj);
        if (BGq != -1) {
            return r2.Aqn(BGq);
        }
        return null;
    }

    public final 0sL A01(Object obj, Object obj2, int i) {
        Map map = this.A02;
        AnonymousClass6J7 r4 = (AnonymousClass6J7) map.get(obj);
        if (r4 == null || r4.A00 != i || !0qQ.A0K(r4.A02, obj2)) {
            r4 = new AnonymousClass6J7(this, obj, obj2, i);
            map.put(obj, r4);
        }
        0sL r0 = r4.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5PJ r02 = new AnonymousClass5PJ(1403994769, true, new C377449Lw(0, r4.A04, r4));
        r4.A01 = r02;
        return r02;
    }

    public AnonymousClass6I5(AnonymousClass6I0 r2, C62320sa r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
