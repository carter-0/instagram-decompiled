package X;

import java.io.IOException;

/* renamed from: X.VDo  reason: case insensitive filesystem */
public abstract class C16988VDo {
    public static VSX parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VSX vsx = new VSX();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("routing_destination".equals(A17)) {
                    vsx.A00 = C16986VDm.parseFromJson(r3);
                } else if ("routing_value".equals(A17)) {
                    vsx.A01 = C16987VDn.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vsx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
