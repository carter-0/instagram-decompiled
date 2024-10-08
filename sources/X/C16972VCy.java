package X;

import java.io.IOException;

/* renamed from: X.VCy  reason: case insensitive filesystem */
public abstract class C16972VCy {
    public static C17230VNi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17230VNi vNi = new C17230VNi();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("actions".equals(AnonymousClass7TE.A17(r3))) {
                    vNi.A00 = C16971VCx.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
