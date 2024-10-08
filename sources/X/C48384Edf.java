package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Edf  reason: case insensitive filesystem */
public abstract class C48384Edf {
    public static Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String str;
        List list = r10.A00;
        String A0t = DbU.A0t(list, 0);
        Map map = (Map) list.get(1);
        Object obj = list.get(2);
        obj.getClass();
        C277014uI r6 = ((C280064zw) obj).A00;
        Object obj2 = list.get(3);
        obj2.getClass();
        C277014uI r7 = ((C280064zw) obj2).A00;
        if (list.size() > 4) {
            str = (String) r10.A03(4);
        } else {
            str = "current-screen";
        }
        C307896Rx r5 = r9;
        C308206Td.A09(r9);
        AnonymousClass4D6 A00 = C46610Dhq.A00(C308206Td.A02(r9), C308206Td.A0C(r9), str, A0t);
        if (A00 != null) {
            C360678ey A04 = C359988do.A04(C308206Td.A0B(r9), A0t, C308206Td.A0H(map));
            A04.A00(new C47559E7x(r5, r6, r7, A0t, 1));
            A00.schedule(A04);
        }
        return null;
    }
}
