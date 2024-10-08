package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.4bZ  reason: invalid class name and case insensitive filesystem */
public final class C267444bZ implements AnonymousClass153 {
    public static boolean A01;
    public final Context A00;

    public final int Bcx() {
        return 1;
    }

    public final int Bcy() {
        return 1;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "qualcomm");
            jSONObject.put("framework", "BoostFramework");
            jSONObject.put("extra", A01 ? AnonymousClass000.A00(4163) : "");
            jSONObject.put("access", AnonymousClass4EF.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C267444bZ(Context context) {
        this.A00 = context;
    }

    public final 14s ALZ(AnonymousClass155 r5, AnonymousClass15J r6) {
        int[] Ah3 = r5.Ah3(r6);
        if (Ah3.length == 0) {
            return null;
        }
        return new AnonymousClass9GQ(new AnonymousClass4EF(this.A00), Ah3, r6.A00);
    }
}
