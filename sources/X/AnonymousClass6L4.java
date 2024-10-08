package X;

import android.content.Context;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.6L4  reason: invalid class name */
public abstract class AnonymousClass6L4 {
    public static final void A00(UserSession userSession, 1Xj r3, AnonymousClass4DU r4, String str) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        C254523sc A04 = C254513sb.A04(r3, r4, "gesture");
        A04.A0G(userSession, r3);
        A04.A73 = "bottom_sheet";
        A04.A7M = str;
        C233822wX.A0H(userSession, A04, r4);
    }

    public static final boolean A01(Context context, UserSession userSession, 1Xj r5, int i) {
        C257773xw BFX;
        AnonymousClass47L r1;
        AndroidLink A02 = AnonymousClass47K.A02(context, userSession, r5, i, false);
        C250513lZ injected = r5.A0C.getInjected();
        if (injected == null || (BFX = injected.BFX()) == null) {
            return false;
        }
        if (A02 != null) {
            r1 = C271714jT.A01(A02);
        } else {
            r1 = null;
        }
        if (r1 != AnonymousClass47L.AD_DESTINATION_WEB || BFX.BFY() == IGPBIAProfileBrowseTypeEnum.DEFAULT || !182.A06(0Tu.A06, userSession, 36318849045436926L)) {
            return false;
        }
        return true;
    }
}
