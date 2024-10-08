package X;

import java.io.IOException;

/* renamed from: X.EnP  reason: case insensitive filesystem */
public abstract class C48987EnP {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.EwR, java.lang.Object] */
    public static C49486EwR parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (Dbf.A02(9, 12, 81).equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("email".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
