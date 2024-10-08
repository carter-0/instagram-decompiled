package X;

import java.io.IOException;

/* renamed from: X.ClQ  reason: case insensitive filesystem */
public abstract class C44814ClQ {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Cu3, java.lang.Object] */
    public static C45300Cu3 parseFromJson(16F r4) {
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
                if ("detailedReasonString".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A01 = str;
                } else if ("reason".equals(A17)) {
                    Integer A00 = A0M.A00(r4.A0i());
                    0qQ.A0B(A00, 0);
                    obj.A00 = A00;
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
