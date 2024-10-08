package X;

import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.E7f  reason: case insensitive filesystem */
public final class C47542E7f extends C62937Kop {
    public final /* synthetic */ FGH A00;

    public final void A00(List list) {
        String str;
        long j;
        String str2;
        FGH fgh = this.A00;
        02m r3 = fgh.A04;
        if (r3 == null) {
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.markerPoint(896612552, "endClientDataFetch");
        r3.markerPoint(896612552, 0, 002.A0R("join_request_", RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        AnonymousClass0aP r6 = fgh.A0D;
        AnonymousClass0iw r1 = fgh.A0B;
        0qQ.A0C(r1, Pxd.A00(3));
        C229382nI A01 = C229382nI.A01((SparseArray) null, r1, r1, r6);
        List<Map> list2 = list;
        JSONObject jSONObject = new JSONObject(Fl7.A00(fgh.A08, r6, FGH.A0H));
        HashMap A1E = AnonymousClass7TE.A1E();
        0xm A0e = DbS.A0e();
        Bundle bundle = fgh.A09;
        String A002 = AnonymousClass000.A00(494);
        if (bundle.containsKey(A002)) {
            str = bundle.getString(A002);
            if (str == null) {
                str = "";
            }
            if (fgh.A06 && bundle.containsKey("last_logged_in_ig_access_token")) {
                Bundle A0a = AnonymousClass7TE.A0a();
                DbS.A1A(A0a, bundle.getString("last_logged_in_ig_access_token", (String) null));
                UserSession A07 = 09i.A0A.A07(A0a);
                if (A07 != null) {
                    ArrayList A02 = FHC.A02(r6.A00.A06(), A07, "active_account", "caa_bloks_access_library_spc_account_linking", "BloksSignedOutFragmentActivity");
                    if (!A02.isEmpty()) {
                        Object obj = A02.get(0);
                        if (obj instanceof Map) {
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            for (Object next : list) {
                                DbY.A1T(((Map) next).get("uid"), str, next, A1C);
                            }
                            Object obj2 = ((Map) obj).get("auth_token");
                            DbS.A1Y(obj2);
                            list2 = 00k.A0S(A1C, AnonymousClass7TE.A1I(DbY.A0q("token", obj2, AnonymousClass7TE.A1L("uid", str), AnonymousClass7TE.A1L("credential_type", "spc_local_auth"))));
                        }
                    }
                }
            }
        } else {
            str = "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map jSONObject2 : list2) {
                jSONArray.put(new JSONObject(jSONObject2));
            }
            jSONObject.put("is_from_logged_in_switcher", fgh.A06);
            jSONObject.put("switcher_logged_in_uid", str);
            jSONObject.put("account_list", jSONArray);
            jSONObject.put(AnonymousClass000.A00(2709), new JSONArray(DbT.A0h().A09()));
            jSONObject.put("INTERNAL_INFRA_THEME", 1Kq.A00.C5w().name());
            String string = bundle.getString("launched_url", "");
            jSONObject.put("launched_url", string);
            0qQ.A0B(string, 0);
            0xY A0d = DbS.A0d(A0e);
            A0d.E5g("auto_login_launched_url", string);
            A0d.apply();
        } catch (JSONException unused) {
        }
        DbW.A1Q(jSONObject, A1E);
        Set A09 = DbT.A0h().A09();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : list) {
            DbV.A1U(next2, A1C2, A09.contains(((Map) next2).get("uid")) ? 1 : 0);
        }
        List A0a2 = 00k.A0a(A1C2);
        if (1AW.A06(0Tu.A06, 18309969568870442L)) {
            FGH.A02(fgh, "always_show_fallback_screen MC on");
            return;
        }
        Handler handler = fgh.A0A;
        Runnable runnable = fgh.A0E;
        if (AnonymousClass7TF.A1Z(fgh.A0G)) {
            j = 7000;
        } else {
            j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        handler.postDelayed(runnable, j);
        if (A0a2.isEmpty()) {
            str2 = "ig_login_home_shown";
        } else {
            str2 = "ig_aymh_shown";
        }
        0qQ.A0B(r6, 0);
        C49880FBe.A00(r6, AnonymousClass05K.A00, str2, "home_page", "prefill_login_signal", (Map) null);
        C2810155m r2 = C2810155m.A00;
        C360678ey A022 = C359988do.A02(fgh.A0C.A00, r6, "com.bloks.www.bloks.caa.login.process_client_data_and_redirect", A1E);
        E86.A01(A022, A01, fgh, 11);
        r2.schedule(A022);
    }

    public C47542E7f(FGH fgh) {
        this.A00 = fgh;
    }
}
