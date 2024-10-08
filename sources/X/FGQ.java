package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class FGQ {
    public static final 1OC A00(Context context, UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        Integer num;
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1O(str, userSession);
        C60820jg r5 = 0jh.A04;
        0jh A01 = r5.A01(userSession);
        19f r1 = 19f.A2L;
        String A02 = A01.A02(r1);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("address_book/link/");
        DbW.A19(r1, A0a, r5.A01(userSession));
        A0a.A9m(Dbe.A02(0, 9, 4), DbT.A0s(context));
        A0a.A9m("contacts", str);
        A0a.A9m("module", str2);
        A0a.A0H("should_process_contacts_immediately", z);
        A0a.A0G("source", str3);
        A0a.A0H("has_seen_new_ci_content", z2);
        A0a.A0Q(C334247ax.class, C334257ay.class);
        StringBuilder A0n = AnonymousClass7TF.A0n("address_book/link/");
        A0n.append('_');
        if (AnonymousClass7TF.A1R(str.length())) {
            num = Integer.valueOf(str.hashCode());
        } else {
            num = "";
        }
        A0n.append(num);
        A0n.append('_');
        if (A02 == null || A02.length() == 0) {
            A02 = "";
        }
        A0a.A0A = AnonymousClass7TF.A0l(A02, A0n);
        A0a.A03();
        A0a.A00 = 1500;
        A0a.A0V = true;
        return A0a.A0M();
    }

    public static final 1OC A02(UserSession userSession, String str, String str2) {
        return A05(userSession, str, (String) null, str2, (String) null, (String) null, (String) null, false, false, false, false, false);
    }

    public static final 1OC A03(UserSession userSession, String str, String str2, String str3) {
        return A05(userSession, str, str2, str3, (String) null, (String) null, (String) null, false, false, false, false, false);
    }

    public static final 1OC A04(UserSession userSession, String str, String str2, String str3, String str4) {
        0qQ.A0B(userSession, 0);
        return A05(userSession, str, str2, str3, str4, (String) null, (String) null, false, false, false, false, false);
    }

    public static final 1OC A05(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(userSession, 0);
        1NY A0M = DbU.A0M(userSession);
        A0M.A02 = new 1NS(new 0bH(userSession), C334257ay.class);
        A0M.A05();
        A0M.A0E = str;
        A0M.A0G("query", str2);
        A0M.A0G("search_surface", str3);
        A0M.A0G("max_id", str4);
        A0M.A0G("rank_token", str5);
        A0M.A0G("order", str6);
        if (z2) {
            A0M.A9m(AnonymousClass000.A00(3831), "true");
        }
        if (z3) {
            A0M.A9m(AnonymousClass000.A00(1455), "true");
        }
        if (z4) {
            A0M.A9m("enable_groups", "true");
        }
        if (z5) {
            A0M.A9m("support_professional_sticker_search", "true");
        }
        if (z) {
            StringBuilder A0n = AnonymousClass7TF.A0n(str);
            A0n.append(str2);
            A0n.append(str6);
            A0n.append('_');
            A0M.A0A = AnonymousClass7TF.A0l(str4, A0n);
            A0M.A03();
            A0M.A00 = 3000;
        }
        if ("nux_follow_from_logged_in_accounts".equals(str3)) {
            A0M.A9m("source", "nux_follow_from_logged_in_accounts");
            A0M.A0N = true;
        } else if ("search_in_dp".equals(str3)) {
            A0M.A9m("source", "search_in_dp");
        }
        return A0M.A0M();
    }

    public static final 1OC A01(Context context, UserSession userSession, String str, boolean z) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("address_book/unlink/");
        DbW.A19(19f.A2L, A0a, DbT.A0P(userSession));
        A0a.A9m(Dbe.A02(0, 9, 4), DbT.A0s(context));
        A0a.A0H("user_initiated", z);
        A0a.A0G("source", str);
        return DbU.A0S(A0a, 1XP.class, 1XY.class);
    }
}
