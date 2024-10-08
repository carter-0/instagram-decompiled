package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuideTypeStr;
import java.io.IOException;

/* renamed from: X.Ck8  reason: case insensitive filesystem */
public abstract class C44740Ck8 {
    public static BIP parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Integer num = null;
            String str2 = null;
            String str3 = null;
            BIR bir = null;
            String str4 = null;
            GuideTypeStr guideTypeStr = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if (C41845B3m.A1Q(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("mixed_cover_media".equals(A17)) {
                    bir = D1H.parseFromJson(r13);
                } else if ("num_items".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r13);
                } else if (C41845B3m.A1E(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    guideTypeStr = (GuideTypeStr) GuideTypeStr.A01.get(str);
                    if (guideTypeStr == null) {
                        guideTypeStr = GuideTypeStr.UNRECOGNIZED;
                    }
                }
                r13.A0z();
            }
            if (str3 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r13, "GuideFeedMetadata");
            } else if (num == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_items", r13, "GuideFeedMetadata");
            } else if (guideTypeStr != null || !(r13 instanceof 0c9)) {
                return new BIP(guideTypeStr, bir, str2, str3, str4, num.intValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r13, "GuideFeedMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
