package X;

import java.io.IOException;

public abstract class VDO {
    public static VO1 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VO1 vo1 = new VO1();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("cursor".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("node".equals(A17)) {
                    vo1.A00 = VDN.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vo1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
