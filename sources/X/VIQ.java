package X;

import java.io.IOException;

public abstract class VIQ {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.WUh] */
    public static C19325WUh parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("primary_color".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("text_emphasis_mode".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A01 = A1S.A00(str);
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
