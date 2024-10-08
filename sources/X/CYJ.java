package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuidanceTipIconAsset;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.io.IOException;

public abstract class CYJ {
    public static GuidanceTipResponseImpl parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str2 = null;
            GuidanceTipIconAsset guidanceTipIconAsset = null;
            String str3 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("content".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("deeplink_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    guidanceTipIconAsset = (GuidanceTipIconAsset) GuidanceTipIconAsset.A01.get(str);
                    if (guidanceTipIconAsset == null) {
                        guidanceTipIconAsset = GuidanceTipIconAsset.UNRECOGNIZED;
                    }
                }
                r9.A0z();
            }
            if (str2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("content", r9, "GuidanceTipResponseImpl");
            } else if (guidanceTipIconAsset != null || !(r9 instanceof 0c9)) {
                return new GuidanceTipResponseImpl(guidanceTipIconAsset, str2, str3);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, r9, "GuidanceTipResponseImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
