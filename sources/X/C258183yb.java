package X;

import java.io.IOException;

/* renamed from: X.3yb  reason: invalid class name and case insensitive filesystem */
public abstract class C258183yb {
    public static C258193yc parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("action_data".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("action_id".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("is_high_value".equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                }
                r6.A0z();
            }
            return new C258193yc(bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
