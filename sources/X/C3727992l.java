package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.92l  reason: invalid class name and case insensitive filesystem */
public final class C3727992l {
    public static C3727892k parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C3727892k r4 = new C3727892k();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("bd".equals(A0q)) {
                    r4.A00 = C393299wD.parseFromJson(r5);
                } else if ("recs_from_friends".equals(A0q)) {
                    r4.A01 = C393479wV.parseFromJson(r5);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r4.A03 = 1aC.A00(r5, true);
                } else {
                    1XY.A01(r5, r4, A0q);
                }
                r5.A0z();
            }
            r4.A02 = new C298925uG(r4.A00, r4.A01, r4.A03);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
