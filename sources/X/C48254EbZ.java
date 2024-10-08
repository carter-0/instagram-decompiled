package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import org.json.JSONObject;

/* renamed from: X.EbZ  reason: case insensitive filesystem */
public abstract class C48254EbZ {
    public Integer A00;
    public String A01;
    public String A02;

    public final JSONObject A00() {
        String str;
        JSONObject A11 = DbS.A11();
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "phone";
                    break;
                case 2:
                    str = "omnistring";
                    break;
                case 3:
                    str = "unknown";
                    break;
                default:
                    str = "email";
                    break;
            }
        } else {
            str = null;
        }
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A11.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, this.A02);
        A11.put("source", this.A01);
        return A11;
    }
}
