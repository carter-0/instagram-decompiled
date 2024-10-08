package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3ZN  reason: invalid class name */
public abstract class AnonymousClass3ZN {
    public static final boolean A02(OnFeedMessagesIntf onFeedMessagesIntf) {
        if (3 == AnonymousClass3ZO.A00(onFeedMessagesIntf)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, 1Xj r8, boolean z) {
        boolean z2;
        OnFeedMessagesIntf onFeedMessagesIntf;
        OnFeedMessagesIntf onFeedMessagesIntf2;
        boolean z3;
        OnFeedMessagesIntf onFeedMessagesIntf3;
        IGCTMessagingAdsInfoDictIntf A1H = r8.A1H();
        if (A1H != null) {
            z2 = 0qQ.A0K(A1H.COE(), true);
        } else {
            z2 = false;
        }
        IGCTMessagingAdsInfoDictIntf A1H2 = r8.A1H();
        OnFeedMessagesIntf onFeedMessagesIntf4 = null;
        if (A1H2 != null) {
            onFeedMessagesIntf = A1H2.BTY();
        } else {
            onFeedMessagesIntf = null;
        }
        if (2 != AnonymousClass3ZO.A00(onFeedMessagesIntf) || !z) {
            IGCTMessagingAdsInfoDictIntf A1H3 = r8.A1H();
            if (A1H3 != null) {
                onFeedMessagesIntf2 = A1H3.BTY();
            } else {
                onFeedMessagesIntf2 = null;
            }
            if (2 != AnonymousClass3ZO.A00(onFeedMessagesIntf2) || z) {
                z3 = false;
            } else {
                z3 = 182.A06(0Tu.A05, userSession, 36316658612441651L);
            }
        } else {
            z3 = 182.A06(0Tu.A05, userSession, 36316658612048432L);
        }
        if (!z2) {
            return false;
        }
        if (!z3) {
            IGCTMessagingAdsInfoDictIntf A1H4 = r8.A1H();
            if (A1H4 != null) {
                onFeedMessagesIntf3 = A1H4.BTY();
            } else {
                onFeedMessagesIntf3 = null;
            }
            if (3 != AnonymousClass3ZO.A00(onFeedMessagesIntf3) || !182.A06(0Tu.A05, userSession, 36316658612179505L)) {
                IGCTMessagingAdsInfoDictIntf A1H5 = r8.A1H();
                if (A1H5 != null) {
                    onFeedMessagesIntf4 = A1H5.BTY();
                }
                if (1 != AnonymousClass3ZO.A00(onFeedMessagesIntf4) || !182.A06(0Tu.A05, userSession, 36316658612310578L)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final String A00(OnFeedMessagesIntf onFeedMessagesIntf) {
        if (onFeedMessagesIntf == null) {
            return "";
        }
        int A00 = AnonymousClass3ZO.A00(onFeedMessagesIntf);
        if (A00 == 3) {
            return "INSTAGRAM";
        }
        if (A00 == 1) {
            return "MESSENGER";
        }
        if (A00 == 2) {
            return "WHATSAPP";
        }
        throw new IllegalArgumentException(002.A0O(AnonymousClass000.A00(968), AnonymousClass3ZO.A00(onFeedMessagesIntf)));
    }

    public static final boolean A01(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, UserSession userSession) {
        Boolean CSD;
        OnFeedMessagesIntf BTY;
        List BE6;
        if (iGCTMessagingAdsInfoDictIntf == null || (CSD = iGCTMessagingAdsInfoDictIntf.CSD()) == null || !CSD.booleanValue() || (BTY = iGCTMessagingAdsInfoDictIntf.BTY()) == null) {
            return false;
        }
        if (2 == AnonymousClass3ZO.A00(BTY) || 1 == AnonymousClass3ZO.A00(BTY)) {
            return true;
        }
        if (!A02(BTY)) {
            return false;
        }
        String B9l = BTY.B9l();
        if ((B9l == null || B9l.length() == 0) && (BE6 = BTY.BE6()) != null && !BE6.isEmpty() && !182.A06(0Tu.A05, userSession, 36317049454072592L)) {
            return false;
        }
        return true;
    }
}
