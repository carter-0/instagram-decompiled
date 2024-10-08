package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hb6  reason: case insensitive filesystem */
public abstract class C55035Hb6 {
    public static final boolean A00(UserSession userSession, AnonymousClass3DY r6) {
        List A0x;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36312887639213505L) && (A0x = DbX.A0x(182.A04(r2, userSession, 36879063104684266L))) != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A0x);
            Iterator it = A0x.iterator();
            while (it.hasNext()) {
                A0r.add(DbV.A12(AnonymousClass7TE.A18(it)));
            }
            if (00k.A0u(A0r, r6.A00)) {
                return true;
            }
        }
        switch (r6.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }
}
