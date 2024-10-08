package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Xxo  reason: case insensitive filesystem */
public final class C22233Xxo implements AnonymousClass153 {
    public static boolean A00;

    public final int Bcx() {
        return 4;
    }

    public final int Bcy() {
        return 2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AnonymousClass000.A00(3903));
            jSONObject.put("framework", "DVFSHelper");
            jSONObject.put("extra", A00 ? C66579MXk.A00(151) : "");
            jSONObject.put("access", C263054Ha.A00.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.4Ha] */
    public final 14s ALZ(AnonymousClass155 r5, AnonymousClass15J r6) {
        int[] Ah3 = r5.Ah3(r6);
        if (Ah3.length == 0) {
            return null;
        }
        boolean z = false;
        if (Ah3[0] > 50 && A00) {
            z = true;
        }
        return new XMX(new Object(), r6.A00, z);
    }
}
