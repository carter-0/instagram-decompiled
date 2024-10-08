package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

public abstract class RhM {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        Object A0p;
        AnonymousClass6Tm r3 = r18;
        List list = r3.A00;
        String A0t = DbU.A0t(list, 0);
        Object A02 = r3.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0t2 = DbU.A0t(list, 2);
        String str2 = (String) DbT.A0q(r3, "null cannot be cast to non-null type kotlin.String", 3);
        String A0t3 = DbU.A0t(list, 5);
        Map map = (Map) list.get(6);
        List list2 = (List) list.get(7);
        C277014uI A0R = DbV.A0R(list, 8);
        C277014uI A0R2 = DbV.A0R(list, 9);
        C307896Rx r32 = r17;
        FragmentActivity A04 = C308206Td.A04(r32);
        if (A0t == null || A04 == null || map == null || A0t2 == null || list2 == null) {
            C308206Td.A0E(r32, A0R2, new Object[0]);
            return null;
        }
        C7433QCy A00 = new 2YN(A04).A00(C7433QCy.class);
        C59101J6j j6j = new C59101J6j(r32, A0R, 12);
        C58716IwP iwP = new C58716IwP(r32, A0R2, 33);
        AnonymousClass7TG.A1R(str, str2);
        Map map2 = A00.A01;
        if (map2.get(A0t) == null) {
            if (map.containsKey("payload")) {
                A0p = map.get("payload");
            } else {
                A0p = Pxe.A0p();
            }
            C10440RsH A022 = C11301SKl.A02(str, A0t2, (String) null, (String) null, list2);
            if (A0t3 != null) {
                A022.A00 = (C8284QnQ) A00.A00.A08(A0t3, C8284QnQ.class);
            }
            AnonymousClass2Fj A0K = JTO.A0K();
            AnonymousClass2gB A03 = AnonymousClass2E0.A03().A02(A04).A03(new C11542Sc3(0, A0K, j6j), (1MD) null, A022, A0p, str2);
            Dba.A16(A04, A03, new C74189PqV((Object) A04, (Object) A00, (Object) iwP, A0t, 2), 8);
            0qQ.A06(map2);
            map2.put(A0t, new OB9(A03, A0K));
        }
        return null;
    }
}
