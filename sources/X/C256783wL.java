package X;

import com.instagram.api.schemas.CollabFollowButtonInfoImpl;
import java.io.IOException;

/* renamed from: X.3wL  reason: invalid class name and case insensitive filesystem */
public abstract class C256783wL {
    public static CollabFollowButtonInfoImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Boolean bool = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("is_owner_in_author_exp".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                } else if ("show_follow_button".equals(A0q)) {
                    bool2 = Boolean.valueOf(r4.A0d());
                }
                r4.A0z();
            }
            return new CollabFollowButtonInfoImpl(bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
