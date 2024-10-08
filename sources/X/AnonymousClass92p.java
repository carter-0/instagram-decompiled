package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.92p  reason: invalid class name */
public final class AnonymousClass92p {
    public static AnonymousClass92o parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass92o r1 = new AnonymousClass92o();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A00 = 1aC.A00(r3, true);
                } else {
                    1XY.A01(r3, r1, A0q);
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
