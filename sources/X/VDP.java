package X;

import java.io.IOException;

public abstract class VDP {
    public static VSK parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VSK vsk = new VSK();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("has_next_page".equals(A17)) {
                    vsk.A01 = r3.A0d();
                } else if ("end_cursor".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vsk.A00 = str;
                }
                r3.A0z();
            }
            return vsk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
