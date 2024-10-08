package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.GOk  reason: case insensitive filesystem */
public abstract class C52341GOk {
    public static final ArrayList A00(C320486sS r14, UserSession userSession, String str, List list, Map map) {
        String A2n;
        C320486sS r8 = r14;
        UserSession userSession2 = userSession;
        List list2 = list;
        Map map2 = map;
        C51974G9v.A1O(userSession, list2, map2, r14);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            C267324bN r9 = (C267324bN) list2.get(i);
            1Xj r0 = r9.A02;
            if (!(r0 == null || (A2n = r0.A2n()) == null)) {
                A1C.add(new C320716sp(GPO.A00(r8, r9, (C56078HsR) null, userSession2, str, (String) null, false, false), r9, (C56078HsR) map2.get(A2n)));
            }
        }
        return A1C;
    }
}
