package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.CdM  reason: case insensitive filesystem */
public abstract class C44340CdM {
    public static BGM parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            C250533lb r7 = null;
            C42056BFj bFj = null;
            String str4 = null;
            String str5 = null;
            Integer num2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("about_page_url".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("about_prompt_text".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r7 = C250523la.parseFromJson(r15);
                } else if ("parameter_picker".equals(A17)) {
                    bFj = CbJ.parseFromJson(r15);
                } else if (C41845B3m.A1E(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if (!"tracking_token".equals(A17)) {
                    num2 = C41847B3o.A13(r15, num2, A17, "view_state_item_type");
                } else if (r15.A11() == 16L.A0G) {
                    str5 = null;
                } else {
                    str5 = r15.A1P();
                }
                r15.A0z();
            }
            if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r15, "SeparatorImpl");
            } else if (str5 != null || !(r15 instanceof 0c9)) {
                return new BGM(bFj, r7, num, num2, str, str2, str3, str4, str5);
            } else {
                AnonymousClass7TF.A1L("tracking_token", r15, "SeparatorImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
