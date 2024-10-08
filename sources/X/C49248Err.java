package X;

import java.io.IOException;

/* renamed from: X.Err  reason: case insensitive filesystem */
public abstract class C49248Err {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Eyd, java.lang.Object] */
    public static C49568Eyd parseFromJson(16F r3) {
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
                if (C41845B3m.A1E(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A02 = str;
                } else if ("subtitle".equals(A17)) {
                    obj.A00 = Ci4.parseFromJson(r3);
                } else if ("icon_url".equals(A17)) {
                    obj.A01 = 16h.A00(r3);
                } else if ("timestamp".equals(A17)) {
                    r3.A0y();
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
