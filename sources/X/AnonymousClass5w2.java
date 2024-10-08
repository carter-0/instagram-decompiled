package X;

import java.io.IOException;

/* renamed from: X.5w2  reason: invalid class name */
public abstract class AnonymousClass5w2 {
    public static AnonymousClass9IE parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass9IE r0 = new AnonymousClass9IE(9);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("media_or_ad".equals(A0q)) {
                    r0.A00 = 1Xj.A00(r3);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
