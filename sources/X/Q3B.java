package X;

import java.util.List;
import java.util.Map;

public final class Q3B {
    public final C307896Rx A00;
    public final C277014uI A01;
    public final List A02;
    public final 0sP A03;

    public Q3B(C277014uI r2, List list) {
        this.A01 = r2;
        this.A00 = null;
        this.A03 = null;
        this.A02 = list;
    }

    public static Q3B A00(Object obj, int i) {
        return new Q3B(new C66310MMt(obj, i));
    }

    public static Q3B A01(Object obj, Object obj2, int i) {
        return new Q3B(new TPJ(i, obj, obj2));
    }

    public static void A02(Object obj, Map map, int i) {
        map.put("on_log_interaction_event_callback_v2", new Q3B(new C66310MMt(obj, i)));
    }

    public static void A03(Object obj, Map map, int i) {
        map.put("on_log_interaction_event_callback", new Q3B(new C66310MMt(obj, i)));
    }

    public final Object A04(C307896Rx r3, AnonymousClass6Tm r4) {
        0sP r0 = this.A03;
        if (r0 != null) {
            return r0.invoke(r4);
        }
        C277014uI r1 = this.A01;
        if (r1 != null) {
            C307896Rx r02 = this.A00;
            if (r02 == null) {
                List list = this.A02;
                if (!(list == null || r3 == null)) {
                    r02 = C307896Rx.A02(r3, list);
                }
            }
            return C299275ur.A00(r02, r4, r1);
        }
        1Kn.A02("BloksCallback", "An attempt to invoke an invalid callback");
        return null;
    }

    public Q3B(C307896Rx r2, C277014uI r3) {
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = null;
        this.A02 = null;
    }

    public Q3B(0sP r2) {
        this.A01 = null;
        this.A00 = null;
        this.A03 = r2;
        this.A02 = null;
    }
}
