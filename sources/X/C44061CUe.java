package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AudienceList;
import java.io.IOException;

/* renamed from: X.CUe  reason: case insensitive filesystem */
public abstract class C44061CUe {
    public static AudienceList parseFromJson(16F r17) {
        16F r2 = r17;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            String str2 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("is_default".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("is_list_name_public".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r2);
                } else if ("is_list_named".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r2);
                } else if ("list_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            if (bool == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_default", r2, "AudienceList");
            } else if (bool2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_list_name_public", r2, "AudienceList");
            } else if (bool3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_list_named", r2, "AudienceList");
            } else if (str == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("list_id", r2, "AudienceList");
            } else if (str2 != null || !(r2 instanceof 0c9)) {
                return new AudienceList(str, str2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2, "AudienceList");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
