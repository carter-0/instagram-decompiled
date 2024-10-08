package X;

import java.io.IOException;

/* renamed from: X.4oZ  reason: invalid class name and case insensitive filesystem */
public abstract class C274554oZ {
    public static C274564oa parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            Boolean bool = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("enable_1x1".equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                } else if ("enable_dense_ufi".equals(A0q)) {
                    bool2 = Boolean.valueOf(r6.A0d());
                } else if ("enable_ufi_interactive_like".equals(A0q)) {
                    bool3 = Boolean.valueOf(r6.A0d());
                } else if ("enable_ufi_interactive_reshare".equals(A0q)) {
                    bool4 = Boolean.valueOf(r6.A0d());
                }
                r6.A0z();
            }
            return new C274564oa(bool, bool2, bool3, bool4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
