package X;

import java.util.List;

public abstract class RT0 {
    public static final C60340gF A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Object obj;
        List list = r8.A00;
        C276544tV r2 = (C276544tV) list.get(0);
        Object obj2 = list.get(1);
        DbS.A1Y(obj2);
        String str = (String) obj2;
        Object obj3 = list.get(2);
        C307786Rm A00 = C276734to.A00(r7, r8, 3);
        int A002 = C276474tO.A00(str);
        if (A002 < 32) {
            Integer valueOf = Integer.valueOf(A002);
            if (r2 != null) {
                obj = Integer.valueOf(r2.A04);
            } else {
                obj = "unknown";
            }
            1Kn.A02("BKBloksActionComponentSetAttrImpl", String.format(C273654mx.A00(1245), new Object[]{valueOf, str, obj}));
        }
        Object A06 = C307476Qg.A06(A00, r2);
        if (A06 == null || !(A06 instanceof C308256Ti) || !((C308256Ti) A06).EOz(A00, obj3, A002)) {
            C307476Qg.A02(A00).A0E(new R9W(A002, obj3), (long) r2.A03);
        }
        return C60340gF.A00;
    }
}
