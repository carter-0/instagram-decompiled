package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CYM {
    public static C42045BEy parseFromJson(16F r20) {
        16F r2 = r20;
        0qQ.A0B(r2, 0);
        try {
            Long l = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Long l2 = null;
            String str = null;
            String str2 = null;
            Float f = null;
            User user = null;
            Float f2 = null;
            String str3 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("category".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("facebook_places_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r2);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r2);
                } else if ("lat".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r2);
                } else if ("linked_account".equals(A17)) {
                    user = C41845B3m.A0a(r2, false);
                } else if ("lng".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r2);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            if (str == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category", r2, "GuideItemAttachmentPlaceImpl");
            } else if (l == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("facebook_places_id", r2, "GuideItemAttachmentPlaceImpl");
            } else if (l2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2, "GuideItemAttachmentPlaceImpl");
            } else if (str3 != null || !(r2 instanceof 0c9)) {
                return new C42045BEy(user, f, f2, str, str2, str3, l.longValue(), l2.longValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2, "GuideItemAttachmentPlaceImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
