package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Efh  reason: case insensitive filesystem */
public abstract class C48510Efh {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        HashMap hashMap;
        String str = (String) r8.A01();
        List list = r8.A00;
        Map map = (Map) list.get(1);
        if (map != null) {
            hashMap = C308206Td.A0H(map);
        } else {
            hashMap = null;
        }
        FragmentActivity A04 = C308206Td.A04(r7);
        UserSession A0Z = DbT.A0Z(r7);
        C283565Ie.A01 = DbV.A0R(list, 2);
        C283565Ie.A00 = r7;
        1Wj r0 = 1Wj.A00;
        if (r0 != null) {
            r0.A00(A04, A0Z, str, hashMap);
            return null;
        }
        C283565Ie.A00();
        return null;
    }
}
