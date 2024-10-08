package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ocb  reason: case insensitive filesystem */
public final class C71101Ocb {
    public static final C71101Ocb A00 = new Object();

    public static final Long A00(UserSession userSession, DirectShareTarget directShareTarget, Map map) {
        AnonymousClass3U9 B35;
        String C6C;
        C254783t2 A0c = DbS.A0c(directShareTarget);
        if (A0c instanceof C254763t0) {
            C6C = ((C254763t0) A0c).A00;
        } else if (!(A0c instanceof C291175gg) || (B35 = 2L2.A00(userSession).B35(((C291175gg) A0c).A00)) == null) {
            return null;
        } else {
            C6C = B35.C6C();
        }
        if (C6C != null) {
            return (Long) map.get(C6C);
        }
        return null;
    }

    public static final LinkedHashMap A01(List list) {
        String obj;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (Object next : list) {
            if (next instanceof DirectShareTarget) {
                obj = ((DirectShareTarget) next).A09();
                0qQ.A07(obj);
            } else if (next != null) {
                obj = next.toString();
            }
            A1H.put(obj, next);
        }
        return A1H;
    }

    public static final boolean A02(String str, String str2) {
        if (0mp.A0B(str2) || str == null || !DbT.A12(AnonymousClass1Q2.A02(), str).startsWith(DbT.A12(AnonymousClass1Q2.A02(), str2))) {
            return false;
        }
        return true;
    }
}
