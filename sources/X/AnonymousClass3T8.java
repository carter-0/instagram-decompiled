package X;

import java.io.IOException;

/* renamed from: X.3T8  reason: invalid class name */
public abstract class AnonymousClass3T8 {
    public static AnonymousClass9IE parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C376599Ip r2 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("last_message".equals(A0q)) {
                    r2 = AnonymousClass55J.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new AnonymousClass9IE((Object) r2, 8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
