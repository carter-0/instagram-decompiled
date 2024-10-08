package X;

import java.io.IOException;

/* renamed from: X.4le  reason: invalid class name and case insensitive filesystem */
public abstract class C272924le {
    public static C272934lf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Long l = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Long l2 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("end_timestamp".equals(A0q)) {
                    l = Long.valueOf(r4.A0y());
                } else if ("start_timestamp".equals(A0q)) {
                    l2 = Long.valueOf(r4.A0y());
                }
                r4.A0z();
            }
            return new C272934lf(l, l2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
