package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class LP4 {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final C62320sa A01;
    public final 05G A02 = JTO.A1J();
    public final HashMap A03 = AnonymousClass7TE.A1E();

    public final synchronized void A02(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A00;
        List list = (List) map.get(str);
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (((C60936Jtu) next).A02 != AnonymousClass05K.A0N) {
                    A1C.add(next);
                }
            }
            ArrayList A0U = 00k.A0U(A1C);
            if (!A0U.isEmpty()) {
                map.put(str, A0U);
                A00(this, str);
            }
        }
        map.remove(str);
        A00(this, str);
    }

    public final synchronized void A03(String str, String str2) {
        Map map = this.A00;
        List list = (List) map.get(str);
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                DbY.A1T(((C60936Jtu) next).A03, str2, next, A1C);
            }
            map.put(str, 00k.A0U(A1C));
            A00(this, str);
        }
    }

    public final synchronized void A04(String str, String str2, String str3) {
        Map map = this.A00;
        String str4 = str;
        List<C60936Jtu> list = (List) map.get(str);
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (C60936Jtu jtu : list) {
                if (!0qQ.A0K(jtu.A03, str2)) {
                    A1C.add(jtu);
                } else {
                    String str5 = str3;
                    A1C2.add(new C61034JvY(jtu.A01, AnonymousClass05K.A0N, str4, str5, jtu.A04, jtu.A00));
                }
            }
            map.put(str, A1C);
            A00(this, str);
            this.A02.Epw(00k.A0a(A1C2));
        }
    }

    public static final void A00(LP4 lp4, String str) {
        List list;
        05G r1 = (05G) lp4.A03.get(str);
        if (r1 != null) {
            synchronized (lp4) {
                List list2 = (List) lp4.A00.get(str);
                if (list2 != null) {
                    list = 00k.A0a(list2);
                } else {
                    list = 0sn.A00;
                }
            }
            r1.Epw(list);
        }
    }

    public final 05F A01(String str) {
        List list;
        HashMap hashMap = this.A03;
        02z r0 = (05G) hashMap.get(str);
        if (r0 == null) {
            synchronized (this) {
                List list2 = (List) this.A00.get(str);
                if (list2 != null) {
                    list = 00k.A0a(list2);
                } else {
                    list = 0sn.A00;
                }
            }
            r0 = 106.A01(list);
            hashMap.put(str, r0);
        }
        return 10b.A03(r0);
    }

    public LP4(C62320sa r2) {
        this.A01 = r2;
    }
}
