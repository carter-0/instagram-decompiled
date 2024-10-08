package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Kxx  reason: case insensitive filesystem */
public abstract class C63493Kxx {
    public static JWF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            JWF jwf = new JWF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    jwf.A02 = 1aC.A00(r4, false);
                } else if ("support_tier".equals(A17)) {
                    jwf.A01 = C2815758n.A00(AnonymousClass7TG.A0l(r4));
                } else if ("ts_secs".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    jwf.A03 = A0l;
                } else if ("badges_count".equals(A17)) {
                    jwf.A00 = r4.A1D();
                } else if (Pxd.A00(43).equals(A17)) {
                    jwf.A04 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return jwf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
