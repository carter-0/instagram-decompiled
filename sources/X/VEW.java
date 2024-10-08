package X;

import com.instagram.user.model.User;
import java.io.IOException;

public abstract class VEW {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.VSp, java.lang.Object] */
    public static C17362VSp parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            User user = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C295745oq r3 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("profile".equals(A17)) {
                    user = C41845B3m.A0a(r5, false);
                } else if ("media_section".equals(A17)) {
                    r3 = C295735op.parseFromJson(r5);
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (user != null) {
                obj.A01 = user;
            }
            if (r3 == null) {
                return obj;
            }
            obj.A00 = r3;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
