package X;

import java.io.IOException;

/* renamed from: X.55i  reason: invalid class name and case insensitive filesystem */
public abstract class C2809755i {
    public static AnonymousClass9J6 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass9J6 r0 = new AnonymousClass9J6(11);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("from_media_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A00 = str;
                } else if ("from_reel_id".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A01 = str;
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
