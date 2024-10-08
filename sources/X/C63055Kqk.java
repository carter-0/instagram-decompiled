package X;

import java.io.IOException;

/* renamed from: X.Kqk  reason: case insensitive filesystem */
public abstract class C63055Kqk {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.L3L, java.lang.Object] */
    public static L3L parseFromJson(16F r3) {
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
                if ("day_reel_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A01 = str;
                } else if ("day_reel_index".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0X(r3);
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
