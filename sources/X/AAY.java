package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.io.StringWriter;

public abstract class AAY {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.AZg, java.lang.Object] */
    public static C40291AZg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("lastUsed".equals(A17)) {
                    obj.A00 = r3.A0y();
                } else if ("itemType".equals(A17)) {
                    Object obj2 = C317476nK.A01.get(r3.A1D());
                    if (obj2 != null) {
                        obj.A02 = (C317476nK) obj2;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else if ("uri".equals(A17)) {
                    obj.A01 = 16h.A00(r3);
                } else if ("sticker".equals(A17)) {
                    obj.A03 = C369248u6.parseFromJson(r3);
                } else if ("emoji".equals(A17)) {
                    obj.A04 = A1L.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(C40291AZg aZg) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        A0K.A0Q("lastUsed", aZg.A00);
        C317476nK r0 = aZg.A02;
        if (r0 != null) {
            A0K.A0P("itemType", r0.A00);
        }
        if (aZg.A01 != null) {
            A0K.A0q("uri");
            16h.A01(A0K, aZg.A01);
        }
        if (aZg.A03 != null) {
            A0K.A0q("sticker");
            C369248u6.A00(A0K, aZg.A03);
        }
        if (aZg.A04 != null) {
            A0K.A0q("emoji");
            C317486nL r2 = aZg.A04;
            A0K.A0c();
            A0K.A0P("supported_emoji_set_index", r2.A00);
            A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A01);
            A0K.A0R(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r2.A02);
            A0K.A0Z();
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
