package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VFu  reason: case insensitive filesystem */
public abstract class C17046VFu {
    public static C64461Oj parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1OS r1 = new 1OS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("media_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("question_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(755).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(321).equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_session_id".equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_position".equals(A17)) {
                    r1.A00 = r3.A1D();
                } else if (AnonymousClass000.A00(1502).equals(A17)) {
                    r1.A07 = r3.A0d();
                } else {
                    C66670Mad.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
