package X;

import java.io.IOException;

/* renamed from: X.5kY  reason: invalid class name and case insensitive filesystem */
public abstract class C293335kY {
    public static C293345kZ parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C293345kZ r0 = new C293345kZ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("igd_live_location_session_ids".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A00 = str;
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
