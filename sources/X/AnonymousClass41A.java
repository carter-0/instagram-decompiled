package X;

import java.io.IOException;

/* renamed from: X.41A  reason: invalid class name */
public abstract class AnonymousClass41A {
    public static AnonymousClass41B parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("fallback_warning_message".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("fsr_quality".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if ("show_fallback_warning".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                } else if ("use_for_flash_cache_only".equals(A0q)) {
                    bool2 = Boolean.valueOf(r7.A0d());
                }
                r7.A0z();
            }
            return new AnonymousClass41B(bool, bool2, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
