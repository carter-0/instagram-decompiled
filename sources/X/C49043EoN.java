package X;

import android.content.Context;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EoN  reason: case insensitive filesystem */
public abstract class C49043EoN {
    public static final 1OC A00(Context context, 0lg r8, EXD exd, Integer num, Integer num2, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        String str;
        if (z5) {
            z6 = AnonymousClass7TF.A1W(exd, EXD.SAC);
        } else {
            z6 = true;
            boolean z7 = r8 instanceof UserSession;
            0BQ A00 = AnonymousClass0BO.A00(r8);
            if (!z7 ? A00.BNv() <= 0 : A00.BNz().size() <= 1) {
                z6 = false;
            }
        }
        1NY A0a = AnonymousClass7TG.A0a(r8);
        A0a.A0A("dynamic_onboarding/get_steps/");
        A0a.A06 = 1CE.A02;
        A0a.A0H("is_ci", z);
        A0a.A0H("fb_connected", z2);
        A0a.A9m(AnonymousClass000.A00(2607), DbT.A0u(context, A0a, "guid", DbT.A0s(context)));
        A0a.A9m(AnonymousClass000.A00(173), C61970qY.A0C(C61970qY.A05(C61970qY.A01(context))));
        A0a.A0H("fb_installed", z3);
        A0a.A0H("tos_accepted", z4);
        switch (num.intValue()) {
            case 0:
                str = "prefetch";
                break;
            case 1:
                str = "start";
                break;
            default:
                str = "finish";
                break;
        }
        DbY.A1J(A0a, "progress_state", str);
        A0a.A0H(AnonymousClass000.A00(1527), z6);
        DbW.A1A(19f.A1c, A0a, DbW.A0I(A0a, r8, "timezone_offset", String.valueOf(1G0.A00())));
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            F38 f38 = (F38) it.next();
            JSONObject A11 = DbS.A11();
            try {
                String str2 = f38.A01;
                if (str2 != null) {
                    A11.put("step_name", str2).put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, f38.A00);
                    jSONArray.put(A11);
                } else {
                    0qQ.A0F("stepName");
                    throw AnonymousClass00P.createAndThrow();
                }
            } catch (JSONException unused) {
            }
        }
        A0a.A0G("seen_steps", jSONArray.toString());
        A0a.A0G("locale", AnonymousClass1Q2.A02().toString());
        String str3 = null;
        if (EXD.SAC != exd) {
            if (exd != null) {
                str3 = exd.A00;
            }
        } else if (num2 != null) {
            str3 = num2 == AnonymousClass05K.A0C ? "account_linking" : num2 == AnonymousClass05K.A00 ? "email" : "phone";
        }
        A0a.A0G("reg_flow_taken", str3);
        return DbW.A0L(A0a, C47349Dvj.class, C49783F6r.class, true);
    }
}
