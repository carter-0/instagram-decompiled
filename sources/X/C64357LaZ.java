package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.LaZ  reason: case insensitive filesystem */
public final class C64357LaZ implements AnonymousClass82U {
    public C63572KzL A00;
    public final C371838zD A01;
    public final AnonymousClass82S A02;

    static {
        Map map = 0Yh.A03;
        0q1.A01(C64357LaZ.class);
    }

    public final void AP6(JSONObject jSONObject) {
        C63572KzL kzL;
        try {
            String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            C63572KzL kzL2 = this.A00;
            if (kzL2 != null) {
                JTQ.A1K(string);
                C64164LRf lRf = kzL2.A00;
                lRf.A0J.FIA(new C60812Jrh(AnonymousClass7TE.A1L(string, jSONObject)));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (0qQ.A0K(string, "avatar_fetch_event")) {
                0qQ.A0A(jSONObject2);
                String string2 = jSONObject2.getString(TraceFieldType.AdhocEventName);
                if (string2 != null && string2.hashCode() == -947300602 && string2.equals("fetch_completed") && (kzL = this.A00) != null) {
                    C62977KpT.A00(kzL.A00, AnonymousClass05K.A02);
                }
            } else if (0qQ.A0K(string, "avatar_animation_event")) {
                0qQ.A0A(jSONObject2);
                jSONObject2.getString(TraceFieldType.AdhocEventName);
            }
        } catch (JSONException unused) {
        }
    }

    public C64357LaZ() {
        AnonymousClass82S r1 = new AnonymousClass82S();
        this.A02 = r1;
        this.A01 = new C371838zD(this, r1);
    }
}
