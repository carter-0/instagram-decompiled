package X;

import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Hb3  reason: case insensitive filesystem */
public abstract class C55032Hb3 {
    public static final 0jB A00(UserSession userSession, IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1) {
        ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl;
        0jB A0k = C51965G9l.A0k();
        String str = gz1.A00().A02;
        if (str != null && str.length() > 0) {
            A0k.A04(C271774jZ.A3b, str);
        }
        String str2 = null;
        if (gz1.A00 == 7 && (contextualAdResponseOrganicInfoImpl = gz1.A02) != null) {
            A0k.A05(C271774jZ.A3d, contextualAdResponseOrganicInfoImpl.A01);
            0j9 r3 = C271774jZ.A3c;
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl2 = gz1.A02;
            if (contextualAdResponseOrganicInfoImpl2 != null) {
                str2 = contextualAdResponseOrganicInfoImpl2.A00;
            }
            A0k.A05(r3, str2);
        }
        A0k.A04(C271774jZ.A1C, intentAwareAdPivotState.A0E);
        C51967G9n.A1J(C271774jZ.A4V, A0k, true);
        A0k.A04(C271774jZ.A5w, DbS.A0j(gz1.A00));
        A0k.A04(C271774jZ.A5u, gz1.getId());
        0j9 r1 = C271774jZ.A5t;
        String A07 = C231122qu.A07(userSession, ((C55923Hpk) 00k.A0I(gz1.A0B)).A00());
        if (A07 != null) {
            A0k.A04(r1, A07);
            A0k.A04(C271774jZ.A5s, C51972G9s.A0i(intentAwareAdPivotState.A06));
            return A0k;
        }
        throw AnonymousClass7TE.A0y();
    }
}
