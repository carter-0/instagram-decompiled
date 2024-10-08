package X;

import java.io.IOException;

/* renamed from: X.VCw  reason: case insensitive filesystem */
public abstract class C16970VCw {
    public static C17228VNg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17228VNg vNg = new C17228VNg();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("node".equals(AnonymousClass7TE.A17(r3))) {
                    vNg.A00 = C16969VCv.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
