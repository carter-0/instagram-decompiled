package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6ro  reason: invalid class name and case insensitive filesystem */
public abstract class C320126ro {
    public static final 1OC A01(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        1NY r3 = new 1NY(userSession, -2);
        r3.A04();
        r3.A0A("friendships/create_many/async/");
        r3.A9m("user_ids", str);
        r3.A0G("nav_chain", AnonymousClass1QI.A00.A02.A00);
        r3.A0P(new C64842Lj4(new 0bH(userSession), new FVG(userSession)));
        r3.A0R = true;
        return r3.A0M();
    }

    public static final 1OC A02(UserSession userSession, String str, boolean z) {
        0qQ.A0B(str, 0);
        String A06 = 0mp.A06("friendships/show/%s/", new Object[]{str});
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A(A06);
        r2.A0H("is_external_deeplink_profile_view", z);
        r2.A0O((15p) null, C320136rp.class, C320146rq.class, false);
        return r2.A0M();
    }

    public static final 1OC A04(UserSession userSession, List list, long j, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list, 1);
        String A0P = 00k.A0P(", ", "", "", list, C51838G3w.A00);
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("friendships/show_many/");
        r3.A9m("user_ids", A0P);
        r3.A0H("include_followed_by", z2);
        r3.A0P(new C64842Lj4(new 0bH(userSession), new FVF(userSession)));
        if (j > 0) {
            r3.A01 = j;
            r3.A07(AnonymousClass05K.A0N);
            r3.A0A = "friendships/show_many/";
        } else if (z) {
            r3.A0A = 002.A0R("friendships/show_many/", A0P);
            r3.A07(AnonymousClass05K.A0Y);
            r3.A00 = 3000;
        }
        return r3.A0M();
    }

    public static final 1OC A03(UserSession userSession, List list) {
        return A04(userSession, list, 0, false, false);
    }

    public static final String A05(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object put : list) {
            jSONArray.put(put);
        }
        String obj = jSONArray.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final 1OC A00(Context context, UserSession userSession, 1Xj r13, AnonymousClass3W1 r14, SearchContext searchContext, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        String str8;
        0qQ.A0B(context, 0);
        String str9 = str;
        0qQ.A0B(str9, 2);
        String str10 = str2;
        0qQ.A0B(str10, 3);
        String str11 = str3;
        0qQ.A0B(str11, 4);
        String str12 = AnonymousClass1QI.A00.A02.A00;
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0A(0mp.A06("friendships/%s/%s/", new Object[]{str10, str9}));
        r2.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
        r2.A9m("radio_type", C61970qY.A09(context));
        r2.A9m("container_module", str11);
        r2.A0G("nav_chain", str12);
        r2.A0G("ndid", str5);
        if (0qQ.A0K(bool2, true)) {
            str8 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str8 = "0";
        }
        r2.A9m("include_follow_friction_check", str8);
        if (r13 != null) {
            r2.A0G("media_id_attribution", r13.getId());
            r2.A0G("media_id", r13.getId());
            r2.A0G("ranking_info_token", r13.A0C.getLoggingInfoToken());
            r2.A0G("inventory_source", r13.A0C.BIl());
        }
        String str13 = str4;
        if (str4 != null) {
            r2.A0G("media_id_attribution", str13);
        }
        if (r14 != null) {
            r2.A09(Integer.valueOf(r14.A0W), "recs_ix");
            r2.A09(Integer.valueOf(r14.getPosition()), "client_position");
        }
        if ("create".equals(str10)) {
            r2.A9m(Dbe.A02(0, 9, 4), 0qv.A00(context));
        }
        if (jSONObject != null) {
            r2.AA0("entrypoint", jSONObject.toString());
        }
        if (searchContext != null) {
            r2.A0G("search_session_id", searchContext.A05);
            r2.A0G("query_text", searchContext.A02);
            r2.A0G("rank_token", searchContext.A03);
        }
        if (0qQ.A0K(bool, true)) {
            r2.A9m("is_suggested_user", "true");
        }
        if (!(str6 == null || str6.length() == 0)) {
            1Xv r0 = 1Xj.A0h;
            r2.A9m("barcelona_source_reply_id", 1Xv.A06(str6));
        }
        if (!(str7 == null || str7.length() == 0)) {
            1Xv r02 = 1Xj.A0h;
            r2.A9m("barcelona_source_quote_id", 1Xv.A06(str7));
        }
        r2.A0O((15p) null, DwR.class, C49810F7x.class, false);
        r2.A0R = true;
        return r2.A0M();
    }
}
