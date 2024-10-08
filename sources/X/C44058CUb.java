package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.CUb  reason: case insensitive filesystem */
public abstract class C44058CUb {
    public static BDr parseFromJson(16F r13) {
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
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Long l = null;
            String str8 = null;
            String str9 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("adNetworkId".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("appStoreId".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("campaignId".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("nonce".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("sourceAppId".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("sourceId".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                } else if ("timestamp".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r13);
                } else if ("version".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r13.A1P();
                    }
                } else if ("vtSignature".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new BDr(l, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
