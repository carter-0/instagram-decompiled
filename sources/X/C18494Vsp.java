package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Vsp  reason: case insensitive filesystem */
public class C18494Vsp {
    public long A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public static void A00(C18494Vsp vsp, JSONObject jSONObject) {
        Integer num;
        Integer num2;
        vsp.A04 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null);
        vsp.A03 = jSONObject.optString("cctype", (String) null);
        vsp.A05 = jSONObject.optString("policy_id", (String) null);
        if (jSONObject.has("version")) {
            num = Integer.valueOf(jSONObject.getInt("version"));
        } else {
            num = null;
        }
        vsp.A02 = num;
        if (jSONObject.has("sample_rate")) {
            num2 = Integer.valueOf(jSONObject.getInt("sample_rate"));
        } else {
            num2 = null;
        }
        vsp.A01 = num2;
        vsp.A00 = jSONObject.optLong("timestamp");
    }
}
