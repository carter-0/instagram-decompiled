package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Kxi  reason: case insensitive filesystem */
public abstract class C63479Kxi {
    public static M0U parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            M0U m0u = new M0U();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("pk".equals(A17) || PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    m0u.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("created_at".equals(A17)) {
                    m0u.A02 = r5.A0y();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    Ki4 ki4 = (Ki4) Ki4.A01.get(AnonymousClass7TG.A0l(r5));
                    if (ki4 == null) {
                        ki4 = Ki4.UNKNOWN;
                    }
                    m0u.A05 = ki4;
                } else if (AnonymousClass000.A00(4170).equals(A17)) {
                    m0u.A01 = r5.A1D();
                } else if ("featured_image".equals(A17)) {
                    C41846B3n.A1A(r5);
                } else if ("cta_text".equals(A17)) {
                    m0u.A07 = AnonymousClass7TG.A0l(r5);
                } else if ("shopping_logging_info".equals(A17)) {
                    m0u.A03 = C63474Kxd.parseFromJson(r5);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17) || "owner".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    m0u.A04 = 1aC.A00(r5, false);
                } else if ("text".equals(A17)) {
                    m0u.A09 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return m0u;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
