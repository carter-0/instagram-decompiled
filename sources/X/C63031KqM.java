package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.KqM  reason: case insensitive filesystem */
public abstract class C63031KqM {
    public static C61121JxX parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            User user = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("author".equals(AnonymousClass7TE.A17(r4))) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r4, false);
                }
                r4.A0z();
            }
            return new C61121JxX(user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
