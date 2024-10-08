package X;

import java.io.IOException;

/* renamed from: X.4E9  reason: invalid class name */
public abstract class AnonymousClass4E9 {
    public static AnonymousClass9IV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass9IV r0 = new AnonymousClass9IV(17);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("cooldown_days".equals(A0q)) {
                    r0.A00 = Integer.valueOf(r3.A1D());
                } else if ("impression_limits".equals(A0q)) {
                    r0.A01 = Integer.valueOf(r3.A1D());
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
