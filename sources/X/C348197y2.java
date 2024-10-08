package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7y2  reason: invalid class name and case insensitive filesystem */
public abstract class C348197y2 {
    public static final C317846nw A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36314747351599895L)) {
            return C317846nw.MIXED_AVATAR_STICKERS;
        }
        return C317846nw.STATIC_AVATAR_STICKERS;
    }

    public static final C317876nz A01(C317966o8 r4) {
        C318046oG r1;
        String str = r4.A0S;
        0qQ.A07(str);
        r4.A0S = r4.A0a;
        List singletonList = Collections.singletonList(r4);
        0qQ.A07(singletonList);
        if (r4.A04() == AnonymousClass05K.A0N) {
            r1 = C318046oG.AVATAR_ANIMATED;
        } else {
            r1 = C318046oG.AVATAR_STATIC;
        }
        return new C317876nz(r1, str, singletonList);
    }
}
