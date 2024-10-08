package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ClU  reason: case insensitive filesystem */
public abstract class C44818ClU {
    public static BBE parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (!"ssrcs".equals(A17)) {
                    bool = C41847B3o.A0z(r12, bool, A17, "enabled");
                } else if (r12.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r12.A1J() != 16L.A08) {
                        C41847B3o.A1L(r12, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                r12.A0z();
            }
            if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r12, "MwsMedia");
            } else if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r12, "MwsMedia");
            } else if (arrayList == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("ssrcs", r12, "MwsMedia");
            } else if (bool != null || !(r12 instanceof 0c9)) {
                return new BBE(str, arrayList, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("enabled", r12, "MwsMedia");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
