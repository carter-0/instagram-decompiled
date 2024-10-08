package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.77N  reason: invalid class name */
public final class AnonymousClass77N {
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();

    public static final boolean A00(AnonymousClass77N r5, C66809Mcv mcv) {
        AnonymousClass3Q2 A03;
        if (!mcv.A0G) {
            return false;
        }
        UserSession userSession = r5.A00;
        C300925yB r0 = mcv.A06.A0F;
        String str = null;
        if (r0 != null) {
            str = r0.A06;
        }
        PendingMediaStore A002 = 28K.A00(userSession);
        if (str == null || (A03 = A002.A03(str)) == null || !C379909Vu.A01(A03) || !182.A06(0Tu.A05, userSession, 36323625049206080L)) {
            return false;
        }
        return true;
    }

    public AnonymousClass77N(UserSession userSession) {
        this.A00 = userSession;
    }
}
