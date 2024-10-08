package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public abstract class LHo {
    public static final void A01(UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        0qQ.A0B(userSession, 0);
        if (z) {
            str4 = "stories/private_stories/add_member/";
        } else {
            str4 = "stories/private_stories/remove_member/";
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0E = str4;
        A0a.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
        A0a.A9m("module", str);
        DbX.A1M(A0a, "source", str2);
        1ES.A03(A0a.A0M());
    }

    public static final 1OC A00(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("stories/private_stories/members/");
        A0M.A0H("is_list_creation", z);
        A0M.A0G(AnonymousClass000.A00(374), str);
        A0M.A09(num, "page_size");
        A0M.A0H("pagination_enabled", z2);
        return DbU.A0S(A0M, CG6.class, C45659D0j.class);
    }
}
