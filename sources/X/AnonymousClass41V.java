package X;

import java.io.IOException;

/* renamed from: X.41V  reason: invalid class name */
public abstract class AnonymousClass41V {
    public static C2608247e parseFromJson(16F r4) {
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
                if ("should_show_ig_only_user_disclosure_in_3dot_menu".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                } else if ("should_show_ig_only_user_disclosure_through_cta_click".equals(A0q)) {
                    bool2 = Boolean.valueOf(r4.A0d());
                }
                r4.A0z();
            }
            return new C2608247e(bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
