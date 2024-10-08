package X;

import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.82T  reason: invalid class name */
public final class AnonymousClass82T implements AnonymousClass82U {
    public C367368qd A00;
    public B1E A01;
    public C342847pG A02;
    public C342837pF A03;
    public AnonymousClass829 A04;
    public final UserSession A05;
    public final AnonymousClass82S A06;

    public static void A00(AnonymousClass82T r1, JSONObject jSONObject) {
        AnonymousClass82S r0 = r1.A06;
        if (r0 == null) {
            0kD.A01("PlatformEventsController", "firePlatformEvents() mPlatformEventsInput is null");
        } else {
            r0.A00(jSONObject);
        }
    }

    public final void AP6(JSONObject jSONObject) {
        String str;
        C342847pG r1;
        C342837pF r2;
        String str2;
        String str3;
        try {
            if (jSONObject.has("log")) {
                jSONObject.getString("log");
            }
            if (jSONObject.has("requestUserName")) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("user_name", AnonymousClass0t1.A01.A01(this.A05).getUsername());
                    A00(this, jSONObject2);
                } catch (JSONException e) {
                    if (e.getMessage() != null) {
                        str3 = e.getMessage();
                    } else {
                        str3 = "";
                    }
                    0kD.A01("PlatformEventsController::onReceiveRequestUserNameEvent", str3);
                }
            }
            if (jSONObject.has("requestPlatform")) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("platform", "android");
                    A00(this, jSONObject3);
                } catch (JSONException e2) {
                    if (e2.getMessage() != null) {
                        str2 = e2.getMessage();
                    } else {
                        str2 = "";
                    }
                    0kD.A01("PlatformEventsController::onReceiveRequestPlatformEvent", str2);
                }
            }
            if (jSONObject.has("effect_ready") && !jSONObject.isNull("effect_ready")) {
                jSONObject.getString("effect_ready");
            }
            if (jSONObject.has("avatar-event") && (r2 = this.A03) != null) {
                try {
                    String string = jSONObject.getString("avatar-event");
                    if (!(string == null || !string.equals("create-avatar") || 25x.A00(r2.A01).A01.A00 == C299715vi.A00)) {
                        11Z.A02(new C40788AjK(r2));
                    }
                } catch (JSONException e3) {
                    0KC.A0G("AvatarEventHandler", "Error in reading values from JSONObject", e3);
                }
            }
            if (jSONObject.has("show-ai-disclaimer") && (r1 = this.A02) != null) {
                try {
                    if (jSONObject.getBoolean("show-ai-disclaimer")) {
                        11Z.A02(new C40786AjI(r1));
                    }
                } catch (JSONException e4) {
                    0KC.A0G("AiCharacterEventHandler", "Error in reading values from JSONObject", e4);
                }
            }
            if (this.A04 != null) {
                jSONObject.has("hasForeground");
            }
            B1E b1e = this.A01;
            if (b1e != null) {
                b1e.DD8(jSONObject);
            }
        } catch (JSONException e5) {
            if (e5.getMessage() != null) {
                str = e5.getMessage();
            } else {
                str = "";
            }
            0kD.A01("PlatformEventsController::didReceiveEngineEvent", str);
        }
    }

    public AnonymousClass82T(AnonymousClass82S r1, UserSession userSession) {
        this.A05 = userSession;
        this.A06 = r1;
    }
}
