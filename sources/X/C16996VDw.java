package X;

import java.io.IOException;

/* renamed from: X.VDw  reason: case insensitive filesystem */
public abstract class C16996VDw {
    public static C17441VVu parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17441VVu vVu = new C17441VVu();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("length".equals(A17)) {
                    vVu.A00 = r3.A1D();
                } else if ("offset".equals(A17)) {
                    vVu.A01 = r3.A1D();
                } else if ("entity".equals(A17)) {
                    vVu.A02 = C16995VDv.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vVu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
