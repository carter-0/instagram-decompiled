package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

public abstract class A1L {
    public static C317486nL parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("supported_emoji_set_index".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r9, "Emoji");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                C317486nL r5 = new C317486nL(str, str2);
                if (num != null) {
                    r5.A00 = num.intValue();
                }
                return r5;
            } else {
                AnonymousClass7TF.A1L(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r9, "Emoji");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
