package X;

import java.io.IOException;

/* renamed from: X.VDn  reason: case insensitive filesystem */
public abstract class C16987VDn {
    public static VO4 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VO4 vo4 = new VO4();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("selector_value".equals(A17)) {
                    vo4.A00 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vo4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
