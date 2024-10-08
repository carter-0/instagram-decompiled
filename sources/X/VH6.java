package X;

import java.io.IOException;

public abstract class VH6 {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.VTh] */
    public static C17380VTh parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"currency".equals(A17)) {
                    num = C41847B3o.A13(r5, num, A17, "offset");
                } else if (r5.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r5.A1P();
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (num != null) {
                obj.A00 = num.intValue();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
