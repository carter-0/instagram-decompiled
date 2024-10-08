package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.58K  reason: invalid class name */
public abstract class AnonymousClass58K {
    public static AnonymousClass58L parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            Integer num = null;
            String str = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("duration_in_ms".equals(A0q)) {
                    l = Long.valueOf(r14.A0y());
                } else if ("index".equals(A0q)) {
                    num = Integer.valueOf(r14.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("start_time_in_ms".equals(A0q)) {
                    l2 = Long.valueOf(r14.A0y());
                }
                r14.A0z();
            }
            if (l == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("duration_in_ms", "ClipsTemplateTransitionEffectInfoImpl");
            } else if (str == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ClipsTemplateTransitionEffectInfoImpl");
            } else if (l2 != null || !(r14 instanceof 0c9)) {
                return new AnonymousClass58L(num, str, l.longValue(), l2.longValue());
            } else {
                ((0c9) r14).A03.A00("start_time_in_ms", "ClipsTemplateTransitionEffectInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
