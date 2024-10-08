package X;

import java.io.IOException;

/* renamed from: X.Cm0  reason: case insensitive filesystem */
public abstract class C44850Cm0 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Hpk, java.lang.Object] */
    public static C55923Hpk parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("media_or_ad".equals(AnonymousClass7TE.A17(r4))) {
                    1Xj A00 = 1Xj.A00(r4);
                    0qQ.A0B(A00, 0);
                    obj.A00 = A00;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
