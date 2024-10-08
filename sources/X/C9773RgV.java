package X;

import java.io.IOException;

/* renamed from: X.RgV  reason: case insensitive filesystem */
public abstract class C9773RgV {
    public static QPk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            QPg qPg = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            QPi qPi = null;
            QPj qPj = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("availability".equals(A17)) {
                    qPg = C9767RgP.parseFromJson(r5);
                } else if ("paymentConfig".equals(A17)) {
                    qPi = C9769RgR.parseFromJson(r5);
                } else if ("receiverInfo".equals(A17)) {
                    qPj = C9771RgT.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new QPk(qPg, qPi, qPj);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
