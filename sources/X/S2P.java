package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class S2P {
    public final List A00;
    public final Map A01;
    public final Map A02;
    public final List A03;

    public final C10781Ry2 A00(RH6 rh6, RH6 rh62) {
        0qQ.A0B(rh6, 0);
        SJ2 sj2 = (SJ2) this.A01.get(rh6);
        Integer num = null;
        if (sj2 == null) {
            return null;
        }
        Map map = sj2.A01;
        S6H s6h = (S6H) map.get(rh62);
        if (s6h != null) {
            num = Integer.valueOf(s6h.A00);
        }
        Object obj = map.get(rh6);
        if (obj != null) {
            int i = ((S6H) obj).A00;
            int i2 = sj2.A00 - 1;
            Object obj2 = map.get(rh6);
            if (obj2 != null) {
                C8880RDx rDx = ((S6H) obj2).A03;
                List list = this.A00;
                0qQ.A0B(list, 0);
                return new C10781Ry2(rDx, num, i, i2, sj2.equals(C66582MXn.A0r(list)));
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public S2P(List list) {
        this.A03 = list;
        ArrayList A1C = AnonymousClass7TE.A1C();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            SJ2 sj2 = new SJ2(AnonymousClass7TE.A1H());
            A1C.add(sj2);
            ArrayList A0f = JTQ.A0f(map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A1H.put(A1J.getKey(), sj2);
                Dbb.A1V(A1J, A1H2);
                A0f.add(C60340gF.A00);
            }
            A0r.add(A0f);
        }
        this.A00 = 00k.A0a(A1C);
        this.A01 = 0Yt.A0B(A1H);
        this.A02 = 0Yt.A0B(A1H2);
    }
}
