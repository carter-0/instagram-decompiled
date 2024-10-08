package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.VBd  reason: case insensitive filesystem */
public abstract class C16926VBd {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.VN9, java.lang.Object] */
    public static VN9 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            User user = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("profile".equals(AnonymousClass7TE.A17(r4))) {
                    user = C41845B3m.A0a(r4, false);
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (user == null) {
                return obj;
            }
            obj.A00 = user;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
