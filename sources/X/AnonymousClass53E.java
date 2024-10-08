package X;

import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import java.io.IOException;

/* renamed from: X.53E  reason: invalid class name */
public abstract class AnonymousClass53E {
    public static DirectAnimatedMediaUser parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if (Dbf.A02(31, 8, 105).equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("is_verified".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                }
                r7.A0z();
            }
            if (str == null || bool == null) {
                return null;
            }
            return new DirectAnimatedMediaUser(str, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
