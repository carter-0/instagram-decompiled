package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Kxf  reason: case insensitive filesystem */
public abstract class C63476Kxf {
    public static M0V parseFromJson(16F r5) {
        Integer num;
        0qQ.A0B(r5, 0);
        try {
            M0V m0v = new M0V();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("pk".equals(A17) || PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    m0v.A0A = AnonymousClass7TG.A0l(r5);
                } else if ("created_at".equals(A17)) {
                    m0v.A03 = r5.A0y();
                } else if ("text".equals(A17)) {
                    m0v.A0D = AnonymousClass7TG.A0l(r5);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    int A1D = r5.A1D();
                    if (A1D == 0 || A1D != 1) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A01;
                    }
                    0qQ.A0B(num, 0);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17) || "owner".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    m0v.A08 = 1aC.A00(r5, false);
                } else if (AnonymousClass000.A00(4626).equals(A17)) {
                    m0v.A02 = r5.A1D();
                } else if ("has_liked_comment".equals(A17)) {
                    m0v.A0F = r5.A0d();
                } else if (AnonymousClass000.A00(4707).equals(A17)) {
                    m0v.A0E = r5.A0d();
                } else if ("idempotence_token".equals(A17)) {
                    m0v.A0B = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(734).equals(A17)) {
                    m0v.A0C = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(4078).equals(A17)) {
                    m0v.A05 = C63478Kxh.parseFromJson(r5);
                } else if (AnonymousClass000.A00(1514).equals(A17)) {
                    m0v.A0G = r5.A0d();
                }
                r5.A0z();
            }
            return m0v;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
