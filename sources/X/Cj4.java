package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import java.io.IOException;

public abstract class Cj4 {
    public static C45398Cve parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            StatusStyleResponseInfoImpl statusStyleResponseInfoImpl = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("emoji".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("text".equals(A17)) {
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
                } else if ("status_key".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("style_response_info".equals(A17)) {
                    statusStyleResponseInfoImpl = C44372Cds.parseFromJson(r13);
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("emoji", r13, "Status");
            } else if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("text", r13, "Status");
            } else if (str3 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r13, "Status");
            } else if (str4 != null || !(r13 instanceof 0c9)) {
                return new C45398Cve(statusStyleResponseInfoImpl, str, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L("status_key", r13, "Status");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
