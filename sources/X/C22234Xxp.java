package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Xxp  reason: case insensitive filesystem */
public final class C22234Xxp implements AnonymousClass153 {
    public static boolean A01;
    public final Context A00;

    public final int Bcx() {
        return 8;
    }

    public final int Bcy() {
        return 1;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "qualcomm");
            jSONObject.put("framework", "QPerformance");
            jSONObject.put("extra", A01 ? AnonymousClass000.A00(4163) : "");
            jSONObject.put("access", AnonymousClass4EG.A03.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C22234Xxp(Context context) {
        this.A00 = context;
    }

    public final 14s ALZ(AnonymousClass155 r5, AnonymousClass15J r6) {
        int[] Ah3 = r5.Ah3(r6);
        if (Ah3.length == 0) {
            return null;
        }
        return new XMV(new AnonymousClass4EG(this.A00), Ah3, r6.A00);
    }
}
