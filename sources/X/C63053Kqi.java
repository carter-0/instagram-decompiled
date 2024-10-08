package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Kqi  reason: case insensitive filesystem */
public abstract class C63053Kqi {
    public static C60991Jun parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C60991Jun jun = new C60991Jun();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    jun.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("timestamp".equals(A17)) {
                    jun.A01 = r3.A0y();
                } else if ("media_count".equals(A17)) {
                    jun.A00 = r3.A1D();
                } else if ("cover_image_version".equals(A17)) {
                    jun.A02 = C63054Kqj.parseFromJson(r3);
                } else if ("reel_type".equals(A17)) {
                    jun.A03 = AnonymousClass3HS.A00(AnonymousClass7TG.A0l(r3));
                }
                r3.A0z();
            }
            return jun;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
