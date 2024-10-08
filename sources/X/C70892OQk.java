package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OQk  reason: case insensitive filesystem */
public abstract class C70892OQk {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.N1a, X.3FZ] */
    public static final C68112N1a A00(HNL hnl, C53229Gkd gkd, UserSession userSession, String str, String str2) {
        1Wr r1;
        Location lastLocation;
        JSONObject jSONObject = null;
        0qQ.A0B(userSession, 0);
        JSONObject A11 = DbS.A11();
        if (str != null) {
            try {
                A11.put("prompt_id", str);
            } catch (JSONException unused) {
            }
        }
        if (gkd != null) {
            try {
                A11.put("meta_ai_response_to_persist", gkd.A00);
            } catch (JSONException unused2) {
            }
        }
        if (str2 != null) {
            try {
                A11.put("qpl_join_id", str2);
            } catch (JSONException unused3) {
            }
        }
        boolean z = false;
        if (182.A06(0Tu.A05, userSession, 36319398807543060L) && (r1 = 1Wr.A00) != null && (lastLocation = r1.getLastLocation(userSession, "GenAiLocationUtil")) != null && C270984hi.A00(lastLocation)) {
            z = true;
            jSONObject = DbS.A11();
            Object valueOf = Double.valueOf(lastLocation.getLatitude());
            if (valueOf == null) {
                try {
                    valueOf = JSONObject.NULL;
                } catch (JSONException unused4) {
                }
            }
            jSONObject.put(com.facebook.location.platform.api.Location.LATITUDE, valueOf);
            Object valueOf2 = Double.valueOf(lastLocation.getLongitude());
            if (valueOf2 == null) {
                try {
                    valueOf2 = JSONObject.NULL;
                } catch (JSONException unused5) {
                }
            }
            jSONObject.put("longitude", valueOf2);
        }
        if (!z) {
            try {
                A11.put("location_extras", JSONObject.NULL);
            } catch (JSONException unused6) {
            }
        } else {
            A11.put("location_extras", jSONObject);
        }
        try {
            A11.put("prompt_type", hnl.toString());
        } catch (JSONException unused7) {
        }
        return new AnonymousClass3FZ(A11);
    }

    public static final String A01(HNL hnl, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        return A00(hnl, (C53229Gkd) null, userSession, str, str2).A00.toString();
    }
}
