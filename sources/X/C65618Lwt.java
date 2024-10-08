package X;

import com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.util.HallPassApiUtil;

/* renamed from: X.Lwt  reason: case insensitive filesystem */
public final class C65618Lwt implements C336227eH {
    public final int A00;
    public final Object A01;

    public static Object A00(C65618Lwt lwt, Object obj) {
        0qQ.A0B(obj, 0);
        return lwt.A01;
    }

    public C65618Lwt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final 1OC AMt(String str) {
        switch (this.A00) {
            case 0:
                return FGQ.A03(((C385189iX) A00(this, str)).A02, "users/search/", str, "share_post_page");
            case 1:
                KXi kXi = (KXi) A00(this, str);
                return AudienceListsApiUtil.A01(AnonymousClass7TE.A0l(kXi.A06), kXi.A05, str);
            case 2:
                return HallPassApiUtil.A00(AnonymousClass7TE.A0l(((KXf) A00(this, str)).A05), str);
            case 3:
                return HallPassApiUtil.A00(AnonymousClass7TE.A0l(((C62042KXe) A00(this, str)).A06), str);
            case 4:
                1NY A0O = DbU.A0O(((FGB) A00(this, str)).A0D);
                A0O.A0A("fbsearch/profile_link_search/");
                A0O.A9m("q", str);
                A0O.A9m("count", Integer.toString(20));
                return DbT.A0S(A0O, CGU.class, D24.class);
            case 5:
                return AudienceListsApiUtil.A01(AnonymousClass7TE.A0l(((C62041KXd) A00(this, str)).A0C), "ig_quick_snap_audience_selector", str);
            case 6:
                1NY A0b = AnonymousClass7TG.A0b((0lg) A00(this, str));
                A0b.A0A(AnonymousClass000.A00(2909));
                A0b.A0G("query", str);
                return DbU.A0S(A0b, UYA.class, C18252VoJ.class);
            case 7:
                return FGQ.A03(((C60196JhF) ((LEE) A00(this, str)).A08.getValue()).A02, "users/search/", str, "live_mention_search_page");
            case 8:
                return FGQ.A03((UserSession) A00(this, str), "users/search/", str, "live_mention_search_page");
            default:
                return FGQ.A03(((C273374mT) this.A01).getSession(), "users/search/", str, "restricted_accounts_page");
        }
    }
}
