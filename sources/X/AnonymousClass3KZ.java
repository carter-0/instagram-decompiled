package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3KZ  reason: invalid class name */
public final class AnonymousClass3KZ {
    public final boolean A02(AnonymousClass9J4 r8, UserSession userSession) {
        List list;
        List list2;
        0qQ.A0B(r8, 0);
        Object obj = r8.A04;
        Object obj2 = r8.A05;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36318140375832464L)) {
            list = AnonymousClass3KY.A01;
        } else {
            list = AnonymousClass3KY.A02;
        }
        if (list.contains(obj)) {
            return true;
        }
        if ((182.A06(r6, userSession, 36318140376422297L) && obj == C233162v9.CTA_CLICK && obj2 == C230432pc.CLIPS) || (list2 = (List) AnonymousClass3KY.A03.get(obj)) == null || !list2.contains(obj2)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(UserSession userSession) {
        return 182.A06(0Tu.A05, userSession, 36316379439436063L);
    }

    public static final boolean A01(UserSession userSession) {
        return 182.A06(0Tu.A06, userSession, 36316113151201232L);
    }
}
