package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class GLD {
    public static final GLD A00 = new Object();

    public final 1OC A01(Context context, C270694h9 r17, GLA gla, GEP gep, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Collection collection, List list, Map map, boolean z, boolean z2, boolean z3) {
        String A002;
        String str8;
        String str9 = str;
        String str10 = str2;
        AnonymousClass7TG.A1O(str9, str10);
        GEP gep2 = gep;
        0qQ.A0B(gep2, 14);
        UserSession userSession2 = userSession;
        1NY A0a = AnonymousClass7TG.A0a(userSession2);
        A0a.A0A("ads/async_ads/");
        A0a.A0G("seed_item_id", str3);
        A0a.A0G("seed_ad_id", str4);
        A0a.A0G("seed_ad_token", str5);
        C51965G9l.A1S(A0a, str6);
        A0a.AA0("organic_item_ids", C51970G9q.A0k(collection));
        A0a.A9m("chaining_session_id", str9);
        A0a.A9m("viewer_session_id", str10);
        Class<B5D> cls = B5D.class;
        A0a.A0Q(B5E.class, cls);
        if (l != null) {
            String str11 = str7;
            if (str7 != null) {
                Integer num2 = num;
                if (num != null) {
                    A0a.A0A = str11;
                    A0a.A07 = num2;
                    A0a.A01 = l.longValue();
                    C51972G9s.A18(A0a, userSession2, cls);
                }
            }
        }
        if (z3) {
            A0a.A9m("is_prefetch", "true");
        }
        0Tu r8 = 0Tu.A05;
        if (182.A06(r8, userSession2, 36318595642366264L)) {
            if (map != null) {
                str8 = AnonymousClass4LV.A00(map);
            } else {
                str8 = null;
            }
            A0a.AA0("ad_and_netego_request_information", str8);
        }
        GLA gla2 = gla;
        if (!AnonymousClass7TF.A1Z(gla2.A05)) {
            if (z2) {
                A002 = gla2.A01();
            } else {
                A002 = gla2.A00();
            }
            A0a.A9m("paging_token", A002);
        }
        if (z) {
            A0a.A9m("is_overlay", "true");
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C376489Ie r1 = (C376489Ie) it.next();
                    C267324bN r0 = (C267324bN) r1.A03;
                    C233472vm r9 = (C233472vm) r1.A04;
                    JSONObject jSONObject = new JSONObject();
                    if (r9 != null) {
                        try {
                            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r0.getId());
                            jSONObject.put("index", r9.A09());
                        } catch (JSONException e) {
                            0KC.A0F("ClipsApiUtil createSponsoredContentTask", "can't build json object for ad", e);
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            A0a.A9m("current_page_ad_positions", jSONArray.toString());
        }
        if (182.A06(r8, userSession2, 36313725150038226L)) {
            A0a.A0H("has_user_set_breaks", 2B0.A01.A07(userSession2).getBoolean("HAS_USER_EVER_SET_BREAKS", false));
            A0a.A0D("take_a_break_nudge_last_seen_time", 1Au.A00(userSession2).A0A());
            long currentTimeMillis = System.currentTimeMillis();
            long j = AnonymousClass2SF.A00;
            long j2 = 0;
            if (j > 0 && currentTimeMillis >= j) {
                j2 = AnonymousClass7TE.A0P(currentTimeMillis - j);
            }
            A0a.A0D("session_time_spent", j2);
            long currentTimeMillis2 = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            A0a.A0D("current_time_in_seconds_since_midnight", AnonymousClass7TE.A0P(currentTimeMillis2 - instance.getTimeInMillis()));
        }
        Iterator A0u = AnonymousClass7TF.A0u(r17.AUH("ads/async_ads/"));
        while (A0u.hasNext()) {
            Map.Entry entry = (Map.Entry) A0u.next();
            A0a.A9m((String) entry.getKey(), (String) entry.getValue());
        }
        String A003 = gep2.A00();
        if (A003 != null) {
            A0a.A9m("client_view_state_media_list", A003);
        }
        A0a.A0R = true;
        C51968G9o.A1C(context, A0a, userSession2);
        return A0a.A0M();
    }

    public static final 1OC A00(Context context, AnonymousClass9JG r4, UserSession userSession, String str, String str2, String str3, String str4, Map map, Map map2) {
        C51974G9v.A1L(str, str2, r4);
        0qQ.A0B(map2, 7);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("ads/async_ads/");
        A0a.A0G("seed_ad_id", r4.A00);
        A0a.A0G("seed_ad_token", r4.A02);
        C51965G9l.A1S(A0a, str3);
        A0a.AA0("organic_item_ids", C51970G9q.A0k(0sn.A00));
        A0a.A9m("chaining_session_id", str);
        A0a.A9m("viewer_session_id", str2);
        A0a.A0G("client_view_state_media_list", str4);
        A0a.A0Q(C43881CGv.class, C45653D0d.class);
        A0a.A0R = true;
        C51968G9o.A1C(context, A0a, userSession);
        if (map != null) {
            A0a.AA0("ad_and_netego_request_information", AnonymousClass4LV.A00(map));
        }
        Iterator A0u = AnonymousClass7TF.A0u(map2);
        while (A0u.hasNext()) {
            C51974G9v.A1C(A0a, A0u);
        }
        return A0a.A0M();
    }
}
