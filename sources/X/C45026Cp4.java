package X;

import java.io.IOException;

/* renamed from: X.Cp4  reason: case insensitive filesystem */
public abstract class C45026Cp4 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Coz, java.lang.Object] */
    public static C45022Coz parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("enabled".equals(AnonymousClass7TE.A17(r3))) {
                    r3.A0d();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
