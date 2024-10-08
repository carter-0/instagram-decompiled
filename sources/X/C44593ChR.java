package X;

import java.io.IOException;

/* renamed from: X.ChR  reason: case insensitive filesystem */
public abstract class C44593ChR {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.V3f] */
    public static C16722V3f parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            VRL vrl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1Q(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if ("effect".equals(A17)) {
                    vrl = C44592ChQ.parseFromJson(r5);
                }
                r5.A0z();
            }
            ? obj = new Object();
            obj.A00 = -1;
            obj.A02 = str;
            obj.A01 = vrl;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
