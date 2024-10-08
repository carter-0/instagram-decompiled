package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9GR  reason: invalid class name */
public abstract class AnonymousClass9GR {
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.9GU] */
    public static AnonymousClass9GU parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            User user = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Long l = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r5, false);
                } else if ("link_time".equals(A0q)) {
                    l = Long.valueOf(r5.A0y());
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (user != null) {
                obj.A01 = user;
            }
            if (l == null) {
                return obj;
            }
            obj.A00 = l.longValue();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
