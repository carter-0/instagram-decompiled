package X;

import java.io.IOException;

/* renamed from: X.VCq  reason: case insensitive filesystem */
public abstract class C16964VCq {
    public static C17223VNb parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17223VNb vNb = new C17223VNb();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("organic".equals(AnonymousClass7TE.A17(r3))) {
                    vNb.A00 = C16963VCp.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
