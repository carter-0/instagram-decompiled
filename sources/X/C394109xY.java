package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9xY  reason: invalid class name and case insensitive filesystem */
public abstract class C394109xY {
    public static C387369m6 parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            C387369m6 r1 = new C387369m6();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("text".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r1.A04 = str;
                } else if ("text_size".equals(A17)) {
                    r1.A00 = (float) r5.A0U();
                } else if ("max_width".equals(A17)) {
                    r1.A01 = r5.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A03 = 1aC.A00(r5, false);
                } else if (C273654mx.A00(880).equals(A17)) {
                    r1.A02 = C394119xZ.parseFromJson(r5);
                } else {
                    AAV.A01(r5, r1, A17);
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
