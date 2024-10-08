package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Laa  reason: case insensitive filesystem */
public final class C64358Laa implements AnonymousClass82U {
    public static final String A03 = 0q1.A01(C64358Laa.class);
    public final C371838zD A00;
    public final AnonymousClass82S A01;
    public final C63755L5n A02;

    static {
        Map map = 0Yh.A03;
    }

    public final void AP6(JSONObject jSONObject) {
        C63888LAr lAr;
        try {
            String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            JSONObject A11 = DbS.A11();
            if (jSONObject.has("data")) {
                A11 = jSONObject.getJSONObject("data");
            }
            C63755L5n l5n = this.A02;
            0qQ.A0A(string);
            0qQ.A0B(string, 0);
            AvatarRetextureSparkPreviewController avatarRetextureSparkPreviewController = l5n.A00;
            C277014uI r4 = avatarRetextureSparkPreviewController.A02;
            if (r4 != null) {
                C276544tV r6 = l5n.A02;
                C307786Rm r5 = l5n.A01;
                AnonymousClass4CZ r0 = AnonymousClass12W.A00;
                AnonymousClass7TE.A1Z(new C66148MEb(A11, r4, r5, r6, string, (AnonymousClass4D7) null, 0), 19E.A02(AnonymousClass12y.A00));
            }
            if (string.equals("ready") && (lAr = avatarRetextureSparkPreviewController.A04.A00) != null) {
                AH4 ah4 = lAr.A03;
                if (ah4 == null) {
                    0qQ.A0F("richMediaViewer3d");
                    throw AnonymousClass00P.createAndThrow();
                }
                View Bf9 = ah4.A0E.Bf9();
                0qQ.A07(Bf9);
                Bf9.setAlpha(1.0f);
            }
        } catch (JSONException e) {
            0KC.A0F(A03, "didReceiveEngineEvent could not get event type or data", e);
        }
    }

    public C64358Laa(C63755L5n l5n) {
        this.A02 = l5n;
        AnonymousClass82S r1 = new AnonymousClass82S();
        this.A01 = r1;
        this.A00 = new C371838zD(this, r1);
    }
}
