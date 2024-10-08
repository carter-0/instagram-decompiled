package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class CYX {
    public static BF0 parseFromJson(16F r16) {
        16F r2 = r16;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("follower_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("hallpass_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("member_count".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
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
                AnonymousClass7TF.A1L("color", r2, "Hallpass");
            } else if (num == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("follower_count", r2, "Hallpass");
            } else if (str2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("hallpass_id", r2, "Hallpass");
            } else if (num2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("member_count", r2, "Hallpass");
            } else if (str3 != null || !(r2 instanceof 0c9)) {
                return new BF0(str, num.intValue(), str2, num2.intValue(), str3);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2, "Hallpass");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
