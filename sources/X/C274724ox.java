package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.4ox  reason: invalid class name and case insensitive filesystem */
public final class C274724ox implements AnonymousClass153 {
    public static boolean A00;

    public final int Bcx() {
        return 3;
    }

    public final int Bcy() {
        return 2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AnonymousClass000.A00(3903));
            jSONObject.put(AnonymousClass000.A00(3157), "SemPerfManager");
            jSONObject.put("extra", A00 ? C66579MXk.A00(151) : "");
            jSONObject.put("access", AnonymousClass4HZ.A00.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final 14s ALZ(AnonymousClass155 r4, AnonymousClass15J r5) {
        int[] Ah3 = r4.Ah3(r5);
        if (Ah3.length == 0) {
            return null;
        }
        boolean z = false;
        if (Ah3[0] > 50 && A00) {
            z = true;
        }
        return new C274734oy(r5.A00, z);
    }
}
