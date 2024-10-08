package X;

import java.io.IOException;

/* renamed from: X.Com  reason: case insensitive filesystem */
public abstract class C45009Com {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.CuF, java.lang.Object] */
    public static C45311CuF parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("delay_time_sec".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r5);
                } else if ("source".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (l != null) {
                obj.A00 = l.longValue();
            }
            if (str != null) {
                obj.A01 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
