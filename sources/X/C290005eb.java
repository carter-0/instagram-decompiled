package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.5eb  reason: invalid class name and case insensitive filesystem */
public abstract class C290005eb {
    public static C376529Ii parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            User user = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("user_info".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r10, false);
                } else if ("following".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                } else if ("outgoing_request".equals(A0q)) {
                    bool2 = Boolean.valueOf(r10.A0d());
                } else if ("incoming_request".equals(A0q)) {
                    bool3 = Boolean.valueOf(r10.A0d());
                } else if ("follow_back_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(r10.A0d());
                }
                r10.A0z();
            }
            if (user != null || !(r10 instanceof 0c9)) {
                return new C376529Ii(user, bool, bool2, bool3, bool4);
            }
            ((0c9) r10).A03.A00("user_info", "NewsfeedFollow");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
