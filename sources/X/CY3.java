package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GenAIMessagingDataImpl;
import com.instagram.api.schemas.GenAIPersonaBannerDictImpl;
import java.io.IOException;

public abstract class CY3 {
    public static GenAIPersonaBannerDictImpl parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            GenAIMessagingDataImpl genAIMessagingDataImpl = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("ig_messaging_data".equals(A17)) {
                    genAIMessagingDataImpl = CY1.parseFromJson(r11);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("persona_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("profile_image_url".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (genAIMessagingDataImpl == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("ig_messaging_data", r11, "GenAIPersonaBannerDictImpl");
            } else if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r11, "GenAIPersonaBannerDictImpl");
            } else if (str2 != null || !(r11 instanceof 0c9)) {
                return new GenAIPersonaBannerDictImpl(genAIMessagingDataImpl, str, str2, str3);
            } else {
                AnonymousClass7TF.A1L("persona_id", r11, "GenAIPersonaBannerDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
