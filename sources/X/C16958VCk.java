package X;

import java.io.IOException;

/* renamed from: X.VCk  reason: case insensitive filesystem */
public abstract class C16958VCk {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.VCZ, java.lang.Object] */
    public static VCZ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (C41846B3n.A1Y(r3, r3.A0q())) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
