package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5lm  reason: invalid class name and case insensitive filesystem */
public final class C294055lm implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IgPresenceLogger";
    public final 0wc A00;
    public final UserSession A01;

    public C294055lm(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final void A01(Integer num, boolean z, boolean z2) {
        Long A012;
        C2605045x A002 = C2605045x.A00();
        if (z) {
            A012 = A002.A02(false);
        } else {
            A012 = A002.A01(false);
        }
        0qQ.A0A(A012);
        long longValue = A012.longValue();
        if (num.intValue() != 0) {
            String valueOf = String.valueOf(longValue);
            Boolean valueOf2 = Boolean.valueOf(z);
            0wc r2 = this.A00;
            0Aj A003 = r2.A00(r2.A00, "msgr_presence_update");
            if (A003.isSampled()) {
                if (182.A06(0Tu.A05, this.A01, 36312093061809037L)) {
                    A003.AAJ("event_type", "setting_update");
                    A003.A7p("is_co_presence_enabled", valueOf2);
                    A003.AAJ(AnonymousClass000.A00(1171), valueOf);
                    A003.Cgf();
                    return;
                }
                return;
            }
            return;
        }
        A00(this, (Boolean) null, Boolean.valueOf(z), Boolean.valueOf(z2), "setting_update", String.valueOf(longValue));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(C294055lm r4, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
        0wc r2 = r4.A00;
        0Aj A002 = r2.A00(r2.A00, "msgr_presence_update");
        if (A002.isSampled()) {
            if (182.A06(0Tu.A05, r4.A01, 36312093061809037L)) {
                A002.AAJ("event_type", str);
                A002.AAJ(AnonymousClass000.A00(1171), str2);
                A002.A7p("is_foregrounded", bool);
                A002.A7p("is_presence_enabled", bool2);
                A002.A7p("is_new_ls_presence_reporting", bool3);
                A002.Cgf();
            }
        }
    }

    public final void A02(Map map) {
        String str;
        String str2;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "msgr_presence_update");
        if (A002.isSampled()) {
            if (182.A06(0Tu.A05, this.A01, 36312093061874574L)) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    C251053mU r8 = (C251053mU) entry.getValue();
                    if (!(r8 == null || (str = r8.A03) == null || str.length() == 0 || "None".equals(str) || "0".equals(str))) {
                        Object key = entry.getKey();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r8.A04).put("is_active", r8.A05).put("lastActivityAtMs", r8.A01).put("appTitle", r8.A02).put("capabilities", r8.A00).put("correlationId", str).put("is_close_friend", r8.A06);
                            str2 = jSONObject.toString();
                            0qQ.A07(str2);
                        } catch (JSONException e) {
                            0KC.A0F("PresenceState", "Failed to generate content", e);
                            str2 = "";
                        }
                        hashMap.put(key, str2);
                    }
                }
                if (!hashMap.isEmpty()) {
                    A002.AAJ("event_type", "batch_received");
                    A002.A9H("presence_data", hashMap);
                    A002.Cgf();
                }
            }
        }
    }
}
