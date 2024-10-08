package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4tG  reason: invalid class name and case insensitive filesystem */
public abstract class C276394tG {
    public static C277064uN parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            C257593xe r5 = null;
            Integer num = null;
            String str = null;
            Boolean bool = null;
            C250533lb r3 = null;
            C270864hR r4 = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("bloks_data".equals(A0q)) {
                    r5 = C45662D0m.parseFromJson(r12);
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(r12.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("is_fullscreen".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r3 = C250523la.parseFromJson(r12);
                } else if ("layout".equals(A0q)) {
                    r4 = C276404tH.A00(r12);
                } else if ("netego_type".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num2 = Integer.valueOf(r12.A1D());
                }
                r12.A0z();
            }
            return new C277064uN(r3, r4, r5, bool, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
