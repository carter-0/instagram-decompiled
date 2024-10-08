package X;

import java.io.IOException;

/* renamed from: X.VCs  reason: case insensitive filesystem */
public abstract class C16966VCs {
    public static C17225VNd parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17225VNd vNd = new C17225VNd();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("organic".equals(AnonymousClass7TE.A17(r3))) {
                    vNd.A00 = C16965VCr.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
