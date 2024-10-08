package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class CZV {
    public static BFF parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("has_cover_photo".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("num_episodes".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (bool == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_cover_photo", r12, "IGTVSeriesInfoImpl");
            } else if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r12, "IGTVSeriesInfoImpl");
            } else if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_episodes", r12, "IGTVSeriesInfoImpl");
            } else if (str2 != null || !(r12 instanceof 0c9)) {
                return new BFF(str, str2, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r12, "IGTVSeriesInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
