package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

public abstract class RhA {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        Object A0p;
        List list = r13.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        String A0t3 = DbU.A0t(list, 2);
        Map map = (Map) list.get(3);
        List list2 = (List) r13.A03(4);
        C277014uI A0R = DbV.A0R(list, 5);
        C277014uI A0R2 = DbV.A0R(list, 6);
        if (map == null || !map.containsKey("payload")) {
            A0p = Pxe.A0p();
        } else {
            A0p = map.get("payload");
        }
        17k.A0E(AnonymousClass7TE.A1b(list2));
        FragmentActivity A04 = C308206Td.A04(r12);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("AUTH_METHOD_TYPE", A0t3);
        A0a.putString("PAYMENT_TYPE", A0t);
        A0a.putString("PAYMENT_LOGGING_ID", A0t2);
        A0a.putStringArray("PTT_UTIL_CAP_NAMES", DbU.A1b(list2, 0));
        SQ8.A02("VERIFY_BIO_TO_PAY", A0a);
        C11249SHj sHj = new C11249SHj();
        sHj.A01(A0t2);
        sHj.A00 = A0t2;
        sHj.A01 = A0t;
        sHj.A02 = null;
        sHj.A03 = null;
        Pxi.A0y(A0a, sHj);
        SUj.A0F(A04, AnonymousClass2E0.A03().A02(A04).A04(new C10440RsH(A0a), A0p, AnonymousClass7TE.A19(list2, 0)), new C11650Sds(r12, A0R2, A0R, 17));
        return null;
    }
}
