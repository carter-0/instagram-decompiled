package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class Cb3 {
    public static BBM parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            String str = null;
            C250533lb r4 = null;
            AnonymousClass9J1 r3 = null;
            String str2 = null;
            Integer num2 = null;
            Integer num3 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("enable_self_note".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("enable_show_more".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r12);
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if (C41845B3m.A17(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r4 = C250523la.parseFromJson(r12);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    r3 = C272154kD.parseFromJson(r12);
                } else if (C41845B3m.A1W(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (C41845B3m.A1C(A17)) {
                    num2 = AnonymousClass7TF.A0X(r12);
                } else {
                    num3 = C41847B3o.A13(r12, num3, A17, "view_state_item_type");
                }
                r12.A0z();
            }
            return new BBM(r3, r4, bool, bool2, num, num2, num3, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
