package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Ena  reason: case insensitive filesystem */
public abstract class C48998Ena {
    public static C47156DrX parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("start".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("end".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r12);
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r12, "TextLink");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r12, "TextLink");
            } else if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start", r12, "TextLink");
            } else if (num2 != null || !(r12 instanceof 0c9)) {
                return new C47156DrX(str, str2, num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("end", r12, "TextLink");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
