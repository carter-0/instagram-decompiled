package X;

import java.io.IOException;

public abstract class VD6 {
    public static VSH parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VSH vsh = new VSH();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("has_next_page".equals(A17)) {
                    vsh.A01 = r3.A0d();
                } else if ("end_cursor".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vsh.A00 = str;
                }
                r3.A0z();
            }
            return vsh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
