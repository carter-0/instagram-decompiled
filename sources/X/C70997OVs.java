package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OVs  reason: case insensitive filesystem */
public final class C70997OVs {
    public final UserSession A00;

    public C70997OVs(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A01(C70621ODs oDs, DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 0);
        String str = directThreadKey.A00;
        if (str != null) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A05, userSession, 36325665159722105L) && oDs != null) {
                if ((C70054NwW.A00(oDs) || oDs.A00 == C69405Nkj.SHH_MODE) && C66582MXn.A0a(userSession, directThreadKey) != null) {
                    A00(this, str, true);
                }
            }
        }
    }

    public final void A02(DirectThreadKey directThreadKey) {
        AnonymousClass3U9 A0a;
        String str;
        0qQ.A0B(directThreadKey, 0);
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36320317927924001L) && (A0a = C66582MXn.A0a(userSession, directThreadKey)) != null && C308556Us.A0M(userSession, A0a) && C308556Us.A0O(userSession, A0a)) {
            C272964li Axk = A0a.Axk();
            if ((Axk == null || Axk.A04 == null) && (str = directThreadKey.A00) != null) {
                A00(this, str, false);
            }
        }
    }

    public static final void A00(C70997OVs oVs, String str, boolean z) {
        1NY A0a = AnonymousClass7TG.A0a(oVs.A00);
        A0a.A0K("direct_v2/threads/%s/sync_disappearing_messages_eligibility/", new Object[]{str});
        A0a.A0Q(1XP.class, 1XY.class);
        if (z) {
            A0a.A0C("skip_e2ee_attribution", 1);
        }
        1ES.A05(A0a.A0M(), -5, 2, true, false);
    }
}
