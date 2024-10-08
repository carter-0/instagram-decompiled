package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CWG {
    public static C60932Jtq parseFromJson(16F r18) {
        String A00;
        16F r3 = r18;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Boolean bool = null;
            Long l = null;
            C60954JuC juC = null;
            String str = null;
            User user = null;
            while (true) {
                16L A1J = r3.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(3441);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r3);
                if ("gift".equals(A17)) {
                    juC = CWJ.parseFromJson(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r3);
                } else if ("sender_info".equals(A17)) {
                    user = C41845B3m.A0a(r3, false);
                } else {
                    l = C41847B3o.A14(r3, l, A17, "timestamp");
                }
                r3.A0z();
            }
            if (juC == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("gift", r3, "ContentAppreciationGiftFeedTransaction");
            } else if (str == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3, "ContentAppreciationGiftFeedTransaction");
            } else if (bool == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r3, "ContentAppreciationGiftFeedTransaction");
            } else if (user == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sender_info", r3, "ContentAppreciationGiftFeedTransaction");
            } else if (l != null || !(r3 instanceof 0c9)) {
                return new C60932Jtq(juC, user, str, l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("timestamp", r3, "ContentAppreciationGiftFeedTransaction");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
