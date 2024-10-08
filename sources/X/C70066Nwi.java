package X;

import java.io.IOException;

/* renamed from: X.Nwi  reason: case insensitive filesystem */
public abstract class C70066Nwi {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.OKm, java.lang.Object] */
    public static C70766OKm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("style".equals(AnonymousClass7TE.A17(r3))) {
                    num = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            if (num == null) {
                return obj;
            }
            obj.A00 = num.intValue();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
