package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.recommended.FollowListData;

public abstract class F87 {
    public static final void A00(UserSession userSession, FollowListData followListData, Integer num, String str, String str2, String str3, int i) {
        C50237FUt fUt;
        String str4;
        String str5;
        0qQ.A0B(userSession, 0);
        Long l = null;
        if (str3 != null) {
            fUt = new C50237FUt(str3);
        } else {
            fUt = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(fUt, userSession), "follow_list_impression");
        if (A0e.isSampled()) {
            if (followListData != null) {
                str4 = followListData.A00.A00;
            } else {
                str4 = null;
            }
            A0e.AAJ("list_type", str4);
            if (followListData != null) {
                str5 = followListData.A02;
            } else {
                str5 = null;
            }
            A0e.AAJ("uid_based_on", str5);
            A0e.AAJ("social_context", str2);
            if (num != null) {
                l = DbS.A0j(num.intValue());
            }
            A0e.A9F(C273654mx.A00(3092), l);
            A0e.A9F("position", DbV.A0p(A0e, "target_user_id", str, i));
            DbV.A1J(A0e, str3);
        }
    }

    public static final void A01(UserSession userSession, FollowListData followListData, String str, String str2, String str3, String str4, int i) {
        C50236FUs fUs;
        AnonymousClass7TG.A1N(userSession, followListData);
        0qQ.A0B(str3, 5);
        if (str4 != null) {
            fUs = new C50236FUs(str4);
        } else {
            fUs = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(fUs, userSession), "follow_list_action");
        if (A0e.isSampled()) {
            A0e.AAJ("list_type", followListData.A00.name());
            DbS.A1J(A0e, str2);
            A0e.A9F("position", DbV.A0p(A0e, "target_user_id", str, i));
            A0e.AAJ("uid_based_on", str3);
            A0e.Cgf();
        }
    }
}
