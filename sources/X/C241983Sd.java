package X;

import java.io.IOException;

/* renamed from: X.3Sd  reason: invalid class name and case insensitive filesystem */
public abstract class C241983Sd {
    public static AnonymousClass9JD parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass9JD r0 = new AnonymousClass9JD();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("item_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A02 = str;
                } else if ("created_at".equals(A0q)) {
                    r0.A01 = Long.valueOf(r4.A0y());
                } else if ("item_otid".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A03 = str;
                } else if ("is_different_than_cached_marker".equals(A0q)) {
                    r0.A00 = Boolean.valueOf(r4.A0d());
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
