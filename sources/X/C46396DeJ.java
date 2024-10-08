package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.DeJ  reason: case insensitive filesystem */
public abstract class C46396DeJ implements CallerContextable {
    public static final String __redex_internal_original_name = "RecommendedUserApi";

    public static final 1OC A00(UserSession userSession, Integer num, String str) {
        AnonymousClass7TF.A1H(userSession, str);
        return A01(userSession, num, str, (String) null, (String) null, (String) null, (String) null, (String) null, false, false);
    }

    public static final 1OC A01(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        String str7;
        0qQ.A0B(userSession, 0);
        if (0qQ.A0K(1UQ.A0n.toString(), str5)) {
            str7 = "discover/suggested_businesses/";
        } else {
            str7 = "discover/ayml/";
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0E = str7;
        DbW.A19(19f.A2F, A0a, DbT.A0P(userSession));
        A0a.A02 = new 1NS(new 0bH(userSession), C46418Def.class);
        if (num != null) {
            A0a.A9m("max_number_to_display", num.toString());
        }
        A0a.A9m("module", str);
        if (z) {
            A0a.A9m("paginate", "true");
        }
        if (z2) {
            A0a.A9m("profile_chaining_check", "true");
        }
        if (!(str2 == null || str2.length() == 0)) {
            A0a.A9m("max_id", str2);
        }
        if (!(str3 == null || str3.length() == 0)) {
            A0a.A9m("forced_user_ids", str3);
        }
        if (!(str4 == null || str4.length() == 0)) {
            A0a.A9m("ndid", str4);
        }
        if (!(str5 == null || str5.length() == 0)) {
            A0a.A9m("entry_feed_item_type", str5);
        }
        if (!(str6 == null || str6.length() == 0)) {
            A0a.A9m("surface", str6);
        }
        long j = 700;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36329354535452738L)) {
            j = 182.A01(r6, userSession, 36610829512087715L);
        }
        A0a.A0A = 002.A0i(str7, str, str2, '_');
        A0a.A03();
        A0a.A00 = j;
        return A0a.A0M();
    }

    public static final 1OC A02(UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("discover/sectioned_ayml/");
        A0M.A0H("request_from_nux", z);
        A0M.A0H("show_mutual_contacts_section", z2);
        A0M.A0G("request_from_notif_type", str);
        A0M.A0G("forced_user_ids", str2);
        A0M.A0G("surface", str3);
        return DbU.A0S(A0M, C43821CEn.class, C45623CzZ.class);
    }
}
