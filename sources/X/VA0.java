package X;

import java.io.IOException;

public abstract class VA0 {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.VXi] */
    public static C17481VXi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("analytics_module".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("hide_back_button".equals(A17)) {
                    obj.A02 = r3.A0d();
                } else if ("hide_navbar".equals(A17)) {
                    obj.A03 = r3.A0d();
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
