package X;

import java.io.IOException;

/* renamed from: X.CpF  reason: case insensitive filesystem */
public abstract class C45037CpF {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.CuK] */
    public static C45316CuK parseFromJson(16F r3) {
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
                if (C41845B3m.A1D(A17)) {
                    obj.A00 = 1Xj.A00(r3);
                } else if ("highlighted_media_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A01 = str;
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
