package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Vfd  reason: case insensitive filesystem */
public final class C17766Vfd {
    public final /* synthetic */ UYH A00;

    public C17766Vfd(UYH uyh) {
        this.A00 = uyh;
    }

    public final void A00() {
        UYH uyh = this.A00;
        C39749A7p A01 = uyh.A01();
        AH4 ah4 = A01.A03;
        if (ah4.A00 != 1) {
            C40161AUb aUb = ah4.A09;
            aUb.A04(ah4.A0C);
            C40161AUb.A00(aUb).enable(true);
            C341897nh r0 = (C341897nh) ah4.A0G.C3L().BYV(C341897nh.A00);
            if (r0 != null) {
                r0.setUseArCoreIfSupported(true);
            }
            ah4.A00 = 1;
        }
        A9C a9c = A01.A06;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "onAR3DToggleSwitchStateChanged");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("newValue", "AR");
        jSONObject.put("data", jSONObject2);
        a9c.A00(jSONObject);
        uyh.A0B.A01();
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(num, 0);
        uyh.A0F = num;
    }
}
