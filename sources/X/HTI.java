package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class HTI {
    public static C53431GoO parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (AnonymousClass000.A00(47).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("emoji".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (AnonymousClass000.A00(1425).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (AnonymousClass000.A00(1426).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                } else if ("source".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r10.A1P();
                    }
                } else if ("version".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new C53431GoO(str, str2, str3, str4, str5, str6, str7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
