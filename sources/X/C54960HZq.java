package X;

import java.io.IOException;

/* renamed from: X.HZq  reason: case insensitive filesystem */
public abstract class C54960HZq {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.HmH, java.lang.Object] */
    public static C55720HmH parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("emoji".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A01 = str;
                } else if ("count".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else if ("is_viewer_reacted".equals(A17)) {
                    obj.A02 = r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
