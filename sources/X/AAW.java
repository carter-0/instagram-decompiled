package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class AAW {
    public static C40595Aej parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C40595Aej aej = new C40595Aej();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("caption".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    aej.A01 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    aej.A00 = 1aC.A00(r4, false);
                }
                r4.A0z();
            }
            return aej;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C40595Aej aej) {
        r2.A0c();
        String str = aej.A01;
        if (str != null) {
            r2.A0R("caption", str);
        }
        if (aej.A00 != null) {
            r2.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = aej.A00;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        r2.A0Z();
    }
}
