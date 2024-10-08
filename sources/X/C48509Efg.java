package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Efg  reason: case insensitive filesystem */
public abstract class C48509Efg {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        HashMap hashMap;
        1Wj r1 = 1Wj.A00;
        if (AnonymousClass7TF.A1V(r1) && r1 != null) {
            UserSession A0Z = DbT.A0Z(r7);
            FragmentActivity A04 = C308206Td.A04(r7);
            String str = (String) r8.A01();
            List list = r8.A00;
            if (list.get(1) != null) {
                hashMap = C308206Td.A0H((HashMap) list.get(1));
            } else {
                hashMap = null;
            }
            1Wj.A00.A00(A04, A0Z, str, hashMap);
        }
        return null;
    }
}
