package X;

import java.io.IOException;

/* renamed from: X.3tY  reason: invalid class name and case insensitive filesystem */
public abstract class C255083tY {
    public static QPh parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            QPk qPk = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("checkoutSetupPayload".equals(A0q)) {
                    qPk = C9773RgV.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new QPh(qPk);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
