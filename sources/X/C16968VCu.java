package X;

import java.io.IOException;

/* renamed from: X.VCu  reason: case insensitive filesystem */
public abstract class C16968VCu {
    public static C17227VNf parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17227VNf vNf = new C17227VNf();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("organic".equals(AnonymousClass7TE.A17(r3))) {
                    vNf.A00 = C16967VCt.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
