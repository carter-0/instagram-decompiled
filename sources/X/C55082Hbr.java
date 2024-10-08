package X;

import java.io.IOException;

/* renamed from: X.Hbr  reason: case insensitive filesystem */
public abstract class C55082Hbr {
    public static 1vK parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1vK r0 = new 1vK();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                16P.A02(r3);
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
