package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.CoX  reason: case insensitive filesystem */
public abstract class C44994CoX {
    public static AnonymousClass1Oo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1Oo r1 = new AnonymousClass1Oo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1J(A17)) {
                    r1.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("question_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(172).equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("audio_asset_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_session_id".equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66670Mad.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
