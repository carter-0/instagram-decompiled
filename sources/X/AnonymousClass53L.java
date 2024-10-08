package X;

import java.io.IOException;

/* renamed from: X.53L  reason: invalid class name */
public abstract class AnonymousClass53L {
    public static C269994g1 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("is_cis_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                } else if ("navbar_title".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("settings_row_title".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C269994g1(bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
